import java.util.Comparator;

public class ComparadorModelo implements Comparator<Carro> {
    @Override
    public int compare(Carro carro1, Carro carro2) {
        return carro1.getModelo().compareTo(carro2.getModelo());
    }
}
