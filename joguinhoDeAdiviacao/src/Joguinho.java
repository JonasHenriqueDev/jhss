import javax.swing.*;
import java.util.Random;

public class Joguinho {
    public static void main(String[] args) {

        Random random = new Random();
        int numero = random.nextInt(1000);
        System.out.println(numero);
        int tentativa = 0;

        while (numero != tentativa) {
            String sTentativa;
            sTentativa = JOptionPane.showInputDialog("Digite um número para ser sorteado:");
            tentativa = Integer.parseInt(sTentativa);

            if (tentativa > numero) {
                JOptionPane.showMessageDialog(null,
                        "A jogada foi acima do número sorteado.", "Resultado", JOptionPane.ERROR_MESSAGE);
            } else if (tentativa < numero) {
                JOptionPane.showMessageDialog(null,
                        "A jogada foi abaixo do número sorteado.", "Resultado", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        "Parabéns! Você acertou o número sorteado " + numero);
            }
        }
    }
}

