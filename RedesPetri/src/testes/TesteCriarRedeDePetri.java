/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.util.ArrayList;
import java.util.List;
import principal.ArvoreDeCobertura;
import principal.RedeDePetri;

public class TesteCriarRedeDePetri {
   
    public static void main(String []args) {
        testeRede2();
    }
    
    public static void testeRede1() {
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
        List<Integer> x = new ArrayList<>();
        x.add(2);
        x.add(5);
        x.add(0);
        x.add(0);
        ArvoreDeCobertura arvore = rede.arvoreDeCobertura(x);
        System.out.println(arvore);
    }
    
    public static void testeRede2() {
        RedeDePetri rede = new RedeDePetri();
        String []lugares = {"p1", "p2", "p3", "p4"};
        String []transicoes = {"t1", "t2", "t3"};
        rede.inserirLugares(lugares);
        rede.inserirTransicoes(transicoes);
        rede.inserirArestaLugarTransicao("p1", "t1", 1);
        rede.inserirArestaLugarTransicao("p2", "t2", 1);
        rede.inserirArestaLugarTransicao("p2", "t3", 1);
        rede.inserirArestaLugarTransicao("p3", "t3", 1);
        rede.inserirArestaTransicaoLugar("t1", "p2", 1);
        rede.inserirArestaTransicaoLugar("t1", "p3", 1);
        rede.inserirArestaTransicaoLugar("t2", "p1", 1);
        rede.inserirArestaTransicaoLugar("t3", "p3", 1);
        rede.inserirArestaTransicaoLugar("t3", "p4", 1);
        List<Integer> x = new ArrayList<>();
        x.add(1);
        x.add(0);
        x.add(0);
        x.add(0);
        ArvoreDeCobertura arvore = rede.arvoreDeCobertura(x);
        System.out.println(arvore);
    }
    
    public static void testeRede3() {
        RedeDePetri rede = new RedeDePetri();
        String []lugares = {"p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9"};
        String []transicoes = {"t1", "t2", "t3", "t4", "t5", "t6", "t7", "t8"};
        rede.inserirLugares(lugares);
        rede.inserirTransicoes(transicoes);
        rede.inserirArestaLugarTransicao("p1", "t1", 1);
        rede.inserirArestaLugarTransicao("p2", "t2", 1);
        rede.inserirArestaLugarTransicao("p3", "t3", 1);
        rede.inserirArestaLugarTransicao("p4", "t4", 1);
        rede.inserirArestaLugarTransicao("p5", "t5", 1);
        rede.inserirArestaLugarTransicao("p6", "t6", 1);
        rede.inserirArestaLugarTransicao("p7", "t7", 1);
        rede.inserirArestaLugarTransicao("p8", "t8", 1);
        
        rede.inserirArestaLugarTransicao("p9", "t3", 1);
        rede.inserirArestaLugarTransicao("p9", "t4", 1);
        
        rede.inserirArestaTransicaoLugar("t1", "p3", 1);
        rede.inserirArestaTransicaoLugar("t2", "p4", 1);
        rede.inserirArestaTransicaoLugar("t3", "p5", 1);
        rede.inserirArestaTransicaoLugar("t4", "p6", 1);
        rede.inserirArestaTransicaoLugar("t5", "p7", 1);
        rede.inserirArestaTransicaoLugar("t6", "p8", 1);
        
        rede.inserirArestaTransicaoLugar("t5", "p9", 1);
        rede.inserirArestaTransicaoLugar("t6", "p9", 1);
        
        List<Integer> x = new ArrayList<>();
        x.add(0);
        x.add(0);
        x.add(1);
        x.add(1);
        x.add(0);
        x.add(0);
        x.add(0);
        x.add(0);
        x.add(1);
        ArvoreDeCobertura arvore = rede.arvoreDeCobertura(x);
        System.out.println(arvore);
    }
    
    public static void testeRede4() {
        RedeDePetri rede = new RedeDePetri();
        String []lugares = {"p1", "p2", "p3", "p4"};
        String []transicoes = {"t1", "t2", "t3", "t4", "t5"};
        rede.inserirLugares(lugares);
        rede.inserirTransicoes(transicoes);
        rede.inserirArestaLugarTransicao("p1", "t1", 1);
        rede.inserirArestaLugarTransicao("p2", "t2", 1);
        rede.inserirArestaLugarTransicao("p2", "t3", 1);
        rede.inserirArestaLugarTransicao("p3", "t4", 1);
        rede.inserirArestaLugarTransicao("p4", "t5", 1);
        
        rede.inserirArestaTransicaoLugar("t1", "p2", 1);
        rede.inserirArestaTransicaoLugar("t2", "p3", 1);
        rede.inserirArestaTransicaoLugar("t3", "p4", 1);
        rede.inserirArestaTransicaoLugar("t4", "p2", 1);
        
        List<Integer> x = new ArrayList<>();
        x.add(1);
        x.add(0);
        x.add(0);
        x.add(0);
        ArvoreDeCobertura arvore = rede.arvoreDeCobertura(x);
        System.out.println(arvore);
    }
    
}
