/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import javax.swing.JFrame;
import gui.DesenhoRedeDePetri;
import principal.RedeDePetri;

/**
 *
 * @author JoséLuís
 */
public class TesteVizualizacaoRedeDePetri {
    
    public static void main(String []args) {
        RedeDePetri rede = new RedeDePetri();
        String []lugares = {"p1", "p2", "p3", "p4"};
        String []transicoes = {"t1", "t2", "t3", "t4", "t5"};
        rede.inserirLugares(lugares);
        rede.inserirTransicoes(transicoes);
        rede.inserirArestaLugarTransicao("p1", "t3", 1);
        rede.inserirArestaLugarTransicao("p2", "t3", 2);
        rede.inserirArestaLugarTransicao("p3", "t4", 1);
        rede.inserirArestaLugarTransicao("p4", "t5", 2);
        rede.inserirArestaTransicaoLugar("t2", "p1", 1);
        rede.inserirArestaTransicaoLugar("t1", "p2", 1);
        rede.inserirArestaTransicaoLugar("t3", "p3", 2);
        rede.inserirArestaTransicaoLugar("t3", "p4", 3);
        DesenhoRedeDePetri frame = new DesenhoRedeDePetri(rede, "Vizualização da Rede de Petri");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
