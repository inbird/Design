package behavioral.mediator;

public abstract class Colleague {
    private Mediator mediator;
    protected String name;
    private String message;

    public Colleague(String name) {
        this.name = name;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void send(){
        System.out.println(this.name + " send()");
        System.out.println();
        mediator.mediate(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public abstract void receive(Colleague colleague);
}
