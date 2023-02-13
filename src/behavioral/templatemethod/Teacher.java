package behavioral.templatemethod;

public abstract class Teacher {
    public void start() {
        inside();
        teach();
        outside();
    }

    public void inside(){
        System.out.println("수업하러 교실로 들어온다.");
    }

    public void outside(){
        System.out.println("수업 끝나고 교실을 나간다.");
    }

    abstract void teach();
}
