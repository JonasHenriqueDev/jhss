import util.Fileira;
import util.LayoutCinema;

import javax.swing.*;

public class Cinema {
    public static void main (String[] args) {

        LayoutCinema layoutCinema = new LayoutCinema();
        layoutCinema.setVisible(true);
        layoutCinema.setSize(600, 260);
        layoutCinema.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        layoutCinema.setLocationRelativeTo(null);
        layoutCinema.setResizable(false);
        layoutCinema.reservarLugar();

        Fileira cine = new Fileira();
        cine.addAssento(1, 2);
        System.out.println(cine.mostrarAssentos());
    }
}
