import java.util.Comparator;

public class Carro{
    private String modelo;
    private int potencia;

    public Carro(String modelo, int potencia) {
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public String getModelo() {
        return modelo;
    }
}
