import javax.swing.*;

public class CelsiusCalculator {
    public static void main(String[] args) {
        String sTemp = JOptionPane
                .showInputDialog("Informe a temperatura em farenheit:");

        double farenheit = Double.parseDouble(sTemp);
        System.out.println(farenheit);
        double celsius = 5/9d * (farenheit - 32);

        System.out.print(celsius);
        JOptionPane.showMessageDialog(null, "A temperatura é: " + celsius + "C°",
                "Temperatura em Celsius", JOptionPane.OK_OPTION);

    }
}