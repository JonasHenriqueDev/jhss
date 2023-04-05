package util;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LayoutCinema extends JFrame{

    private JButton botao[][] = new JButton[7][10]; //70 botões em uma matriz bidimensional
    private final JLabel labelCinema = new JLabel("Cinema digital!");
    private FlowLayout layout;
    //private GridBagLayout layout2;
    private Container container;
    private Fileira fileira = new Fileira();


    public LayoutCinema() {
        super("Cinema");

        layout = new FlowLayout();
        container = getContentPane();
        setLayout(layout);
        JOptionPane.showMessageDialog(null, "Boas vindas ao Cinema digital!");

        String valor = "";

        for(int i = 0; i < 7; i++) {
            for(int j = 0; j < 10; j++) {
                valor = (i+1) + " " + (j+1);
                botao[i][j] = new JButton(valor);
                add(botao[i][j]).setBackground(Color.green);
            }
        }
        //botao[1][2].setEnabled(false);
        for(int i = 0; i < 7; i++) {
            for(int j = 0; j < 10; j++){
                if(fileira.lugares[i][j] == 0) {
                    botao[i][j].setEnabled(true);
                }else {
                    botao[i][j].setEnabled(false);
                }


            }
        }



    }

    public void reservarLugar() {
        for(int i = 0; i < 7; i++) {
            for(int j = 0; j < 10; j++) {
                int finalI = i;
                int finalJ = j;
                botao[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(fileira.lugares[finalI][finalJ] == 1){
                        JOptionPane.showMessageDialog(null, "Assento ocupado. Por favor, tente outro!");
                        //botao[finalI][finalJ].setEnabled(false);
                        fileira.mostrarAssentos();
                        } else {
                            JOptionPane.showMessageDialog(null, "Sucesso! Seu assento foi reservado.");
                            botao[finalI][finalJ].setBackground(Color.red);
                            fileira.addAssento(finalI,finalJ);
                            System.out.println(fileira.mostrarAssentos());
                        }
                    }
                });
            }
        }
    }

}
