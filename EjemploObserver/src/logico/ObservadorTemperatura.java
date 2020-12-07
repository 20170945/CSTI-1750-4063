package logico;

public class ObservadorTemperatura extends Observer {
    private float temperatura;

    public ObservadorTemperatura() {
        super();
    }

    public ObservadorTemperatura(Gas gas) {
        super((Subject) gas);
    }

    @Override
    public void update() {
        this.temperatura = ((Gas)this.subject).getTemp();
    }
}
