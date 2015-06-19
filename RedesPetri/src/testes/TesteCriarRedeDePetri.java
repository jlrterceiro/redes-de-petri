/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import principal.RedeDePetri;

/**
 *
 * @author JoséLuís
 */
public class TesteCriarRedeDePetri {
   
    public static void main(String []args) {
        RedeDePetri rede = new RedeDePetri();
        String []lugares = {"p1", "p2", "p3", "p4"};
        String []transicoes = {"t1", "t2", "t3", "t4"};
        rede.inserirLugares(lugares);
        rede.inserirTransicoes(transicoes);
        
    }
    
}
