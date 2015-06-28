/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JoséLuís
 */
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
