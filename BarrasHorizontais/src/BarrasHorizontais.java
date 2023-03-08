/*Crie uma aplicação que gere um gráfico de barras horizontais com sinais de igual.
Receba do usuário um inteiro que representa a quantidade de itens que serão informados,
depois obtenha os números e os exiba da seguinte forma:
3 ===
7 =======
5 =====
2 ==*/

import java.util.Scanner;

public class BarrasHorizontais {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        String[] barras = new String[num];

        System.out.print(num + " ");
        for (int i = 0; i < barras.length; i++) {
            System.out.print("=");
        }

    }
}