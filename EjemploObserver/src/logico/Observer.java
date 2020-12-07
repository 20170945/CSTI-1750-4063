package logico;

public abstract class Observer {
    protected Subject subject;

    public Observer() {
        super();
        this.subject = null;
    }

    public Observer(Subject subject) {
        super();
        this.subject = subject;
    }

    public abstract void update();

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
