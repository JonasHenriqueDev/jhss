import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class CarroTeste {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();

        carros.add(new Carro("Mobi", 87));
        carros.add(new Carro("Corolla", 177));
        carros.add(new Carro("LaFerrari", 800));
        carros.add(new Carro("Tesla", 1000));
        carros.add(new Carro("Civic Type R", 330));

        for(Carro carro:carros) {
            System.out.println(carro.getModelo() + ": " + carro.getPotencia());
        }
        System.out.println();
        Collections.sort(carros, new ComparadorModelo());
        for(Carro carro:carros) {
            System.out.println(carro.getModelo() + ": " + carro.getPotencia());
        }
        System.out.println();
        Collections.sort(carros, new ComparadorPotencia());
        for(Carro carro:carros) {
            System.out.println(carro.getModelo() + ": " + carro.getPotencia());
        }

    }
}
