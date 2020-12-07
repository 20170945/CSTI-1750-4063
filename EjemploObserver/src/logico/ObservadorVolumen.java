package logico;

public class ObservadorVolumen extends Observer {
    private float volumen;

    public ObservadorVolumen() {
        super();
    }

    public ObservadorVolumen(Gas gas) {
        super((Subject) gas);
    }

    @Override
    public void update() {
        this.volumen = ((Gas)this.subject).getVolumen();
    }
}
