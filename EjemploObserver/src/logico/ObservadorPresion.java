package logico;

public class ObservadorPresion extends Observer {
    private float presion;

    public ObservadorPresion() {
        super();
    }

    public ObservadorPresion(Gas gas) {
        super((Subject) gas);
    }

    @Override
    public void update() {
        this.presion = ((Gas)this.subject).getPresion();
    }
}
