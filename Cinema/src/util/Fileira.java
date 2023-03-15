package util;

public class Fileira {

    protected int[][] lugares = new int[7][10];

    public void addAssento(int i, int j) {
        if(lugares[i][j] == 0) {
            System.out.println("Lugar adicionado com sucesso!");
            this.lugares[i][j] = 1;
        } else {
            System.out.println("Lugar ocupado.");
        }
    }

    public String mostrarAssentos() {
        String assentos = "";
        for(int i = 0; i < 7; i++) {
            for(int j = 0; j < 10; j++) {
                assentos += "fileira " + (i+1) + " assento " + (j+1) + " status " + this.lugares[i][j] + "\n";
            }
        }
        return assentos;
    }


}
