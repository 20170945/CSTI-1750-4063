package logico;

public class Gas extends Subject{
    private float temp;
    private float volumen;
    private float presion;

    public Gas(float volumen, float presion, float temp) {
        super();
        this.temp = temp;
        this.volumen = volumen;
        this.presion = presion;
    }

    public void setVolumen(float nuevoVolumen) {
        float viejaPresion = presion;
        presion = viejaPresion*volumen/nuevoVolumen;
        volumen = nuevoVolumen;
    }

    public void setTemp(float nuevaTemp) {
        float viejaPresion = presion;
        presion = viejaPresion*nuevaTemp/temp;
        temp = nuevaTemp;
    }

    public float getTemp() {
        return temp;
    }

    public float getVolumen() {
        return volumen;
    }

    public float getPresion() {
        return presion;
    }
}
