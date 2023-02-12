package builder;

public class Member {
    //required parameters
    private String id;
    private String name;

    //optional parameters
    private int age;
    private String address;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    private Member(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder {

        // required parameters
        private String id;
        private String name;

        // optional parameters
        private int age;
        private String address;

        public Builder(String id, String name) {
            this.id = id;
            this.name = name;

        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Member build() {
            return new Member(this);
        }
    }
}
