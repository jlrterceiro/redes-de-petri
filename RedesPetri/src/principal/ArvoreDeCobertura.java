/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class ArvoreDeCobertura {
    
    public static final String NO_INTERNO = "";
    public static final String NO_TERMINAL = "terminal";
    public static final String NO_DUPLICADO = "duplicado";
    
    private List<Integer> marcacao;
    private String tipoNo;
    private List<ArvoreDeCobertura> filhos;

    public ArvoreDeCobertura() {
        filhos = new ArrayList<>();
    }
    
    public ArvoreDeCobertura(List<Integer> marcacao) {
        this.marcacao = marcacao;
        this.filhos = new ArrayList<>();
    }
    
    public ArvoreDeCobertura(List<Integer> marcacao, String tipoNo) {
        this.marcacao = marcacao;
        this.tipoNo = tipoNo;
        this.filhos = new ArrayList<>();
    }

    public List<Integer> getMarcacao() {
        return marcacao;
    }

    public void setMarcacao(List<Integer> marcacao) {
        this.marcacao = marcacao;
    }

    public String getTipoNo() {
        return tipoNo;
    }

    public void setTipoNo(String tipoNo) {
        this.tipoNo = tipoNo;
    }

    public List<ArvoreDeCobertura> getFilhos() {
        return filhos;
    }

    public void setFilhos(List<ArvoreDeCobertura> filhos) {
        this.filhos = filhos;
    }
    
    
    public String toString() {
        return toString(0);
    }
    
    public String stringMarcacao() {
        int i;
        String res = "";
        res += "[";
        for (i=0; i<marcacao.size(); i++) {
            if (i!=0) {
                res+=", ";
            }
            if (marcacao.get(i)==RedeDePetri.W) {
                res += "w";
            }
            else {
                res += "" + marcacao.get(i);
            }
        }
        return res;
    }
    
    public List<Integer> listaLarguras() {
        List<Integer> larguras = new ArrayList<>();
        Queue<ArvoreDeCobertura> filaArvore = new LinkedList<>();
        Queue<Integer> filaNivel = new LinkedList<>();
        filaArvore.add(this);
        filaNivel.add(0);
        while (filaArvore.size()>0) {
            ArvoreDeCobertura arvore;
            int nivel;
            arvore = filaArvore.poll();
            nivel = filaNivel.poll();
            if (nivel>=larguras.size()) {
                larguras.add(0);
            }
            larguras.set(nivel, larguras.get(nivel)+1);
            int i;
            for (i=0; i<arvore.getFilhos().size(); i++) {
                filaArvore.add(arvore.getFilhos().get(i));
                filaNivel.add(nivel+1);
            }
        }
        return larguras;
    }
    
    public int larguraMaxima() {
        int maior=0;
        int i;
        List<Integer> larguras = listaLarguras();
        for (i=0; i<larguras.size(); i++) {
            if (larguras.get(i)>maior) {
                maior = larguras.get(i);
            }
        }
        return maior;
    }
    
    public String toString(int espaco) {
        int i;
        String res = "";
        for (i=0; i<espaco; i++) {
            res += " ";
        }
        res += stringMarcacao();
        res += "] " + tipoNo + "\n";
        for (i=0; i<filhos.size(); i++) {
            res += filhos.get(i).toString(espaco+3);
        }
        return res;
    }
    
    
    
    
}
