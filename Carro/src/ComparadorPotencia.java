import java.util.Comparator;

public class ComparadorPotencia implements Comparator<Carro> {
    @Override
    public int compare(Carro carro1, Carro carro2) {
        return Integer.compare(carro1.getPotencia(), carro2.getPotencia());
    }
}

