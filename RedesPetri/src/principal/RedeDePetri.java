package principal;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RedeDePetri {

    private final int MAX_LUGARES = 100;
    private final int MAX_TRANSICOES = 100;
    public static final int W = 1000000007;

    private List<String> lugares;
    private List<String> transicoes;
    private Map<String, Integer> indiceLugar;
    private Map<String, Integer> indiceTransicao;
    private int[][] adjLugar;
    private int[][] adjTransicao;
    private int[] grauEntradaTransicao;

    public RedeDePetri() {
        lugares = new ArrayList<>();
        transicoes = new ArrayList<>();
        indiceLugar = new HashMap<>();
        indiceTransicao = new HashMap<>();
        adjLugar = new int[MAX_LUGARES][MAX_TRANSICOES];
        adjTransicao = new int[MAX_TRANSICOES][MAX_LUGARES];
        grauEntradaTransicao = new int[MAX_TRANSICOES];
        inicializarMatriz(adjLugar);
        inicializarMatriz(adjTransicao);
        inicializarVetor(grauEntradaTransicao);
    }

    public List<String> getLugares() {
        return lugares;
    }

    public List<String> getTransicoes() {
        return transicoes;
    }

    public int[][] getAdjLugar() {
        return adjLugar;
    }

    public int[][] getAdjTransicao() {
        return adjTransicao;
    }
    
    

    public void inicializarVetor(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            vet[i] = 0;
        }
    }

    public void inicializarMatriz(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = -1;
            }
        }
    }

    public void inserirLugar(String lugar) {
        indiceLugar.put(lugar, lugares.size());
        lugares.add(lugar);
    }

    public void inserirLugares(String[] lugares) {
        for (String lugar : lugares) {
            inserirLugar(lugar);
        }
    }

    public void inserirTransicao(String transicao) {
        indiceTransicao.put(transicao, transicoes.size());
        transicoes.add(transicao);
    }

    public void inserirTransicoes(String[] transicoes) {
        for (String transicao : transicoes) {
            inserirTransicao(transicao);
        }
    }

    public void inserirArestaLugarTransicao(String lugar, String transicao, int peso) {
        int a, b;
        a = indiceLugar.get(lugar);
        b = indiceTransicao.get(transicao);
        adjLugar[a][b] = peso;
        grauEntradaTransicao[b]++;
    }

    public void inserirArestaTransicaoLugar(String transicao, String lugar, int peso) {
        int a, b;
        a = indiceTransicao.get(transicao);
        b = indiceLugar.get(lugar);
        adjTransicao[a][b] = peso;
    }

    public String toString() {
        int i, j;
        String lugar, transicao;
        int peso;
        String res = "";
        res += "Lugares:";
        for (i = 0; i < lugares.size(); i++) {
            res += " " + lugares.get(i);
        }
        res += "\n";
        res += "Transições:";
        for (i = 0; i < transicoes.size(); i++) {
            res += " " + transicoes.get(i);
        }
        res += "\n\n";
        res += "Arestas de lugares para transições:\n";
        for (i = 0; i < lugares.size(); i++) {
            lugar = lugares.get(i);
            res += lugar + ":";
            for (j = 0; j < transicoes.size(); j++) {
                if (adjLugar[i][j] != -1) {
                    transicao = transicoes.get(j);
                    peso = adjLugar[i][j];
                    res += "  --> " + "(" + transicao + ", " + peso + ")";
                }
            }
            res += "\n";
        }
        res += "\n";
        res += "Arestas de transições para lugares:\n";
        for (i = 0; i < transicoes.size(); i++) {
            transicao = transicoes.get(i);
            res += transicao + ":";
            for (j = 0; j < lugares.size(); j++) {
                if (adjTransicao[i][j] != -1) {
                    lugar = lugares.get(j);
                    peso = adjTransicao[i][j];
                    res += "  --> " + "(" + lugar + ", " + peso + ")";
                }
            }
            res += "\n";

        }
        return res;
    }

    
    public ArvoreDeCobertura arvoreDeCobertura(List<Integer> x) {
        List<List<Integer>> vis;
        vis = new ArrayList<>();
        return arvoreDeCobertura(x, vis);
    }

    private ArvoreDeCobertura arvoreDeCobertura(List<Integer> x, List<List<Integer>> vis) {
        ArvoreDeCobertura res;
        int i, j;
        List<Integer> y;
        for (i=0; i<vis.size(); i++) {
            y=vis.get(i);
            int ehMenor=1;
            for (j=0; j<x.size(); j++) {
                if (x.get(j)<y.get(j)) {
                    ehMenor=0;
                    break;
                }
            }
            if (ehMenor==1) {
                for (j=0; j<x.size(); j++) {
                    if (x.get(j)>y.get(j)) {
                        x.set(j, RedeDePetri.W);
                    }
                }
            }
        }
        if (vis.contains(x)) {
            res = new ArvoreDeCobertura(x, ArvoreDeCobertura.NO_DUPLICADO);
            return res;
        } else {
            res = new ArvoreDeCobertura(x);
            vis.add(x);
            int[] quantPode;
            quantPode = new int[transicoes.size()];
            for (i = 0; i < transicoes.size(); i++) {
                quantPode[i] = 0;
            }
            for (i = 0; i < lugares.size(); i++) {
                for (j = 0; j < transicoes.size(); j++) {
                    if (adjLugar[i][j] != -1 && x.get(i) >= adjLugar[i][j]) {
                        quantPode[j]++;
                    }
                }
            }
            int definido = 0;
            for (i = 0; i < transicoes.size(); i++) {
                if (quantPode[i] == grauEntradaTransicao[i]) {
                    if (definido == 0) {
                        definido = 1;
                        res.setTipoNo(ArvoreDeCobertura.NO_INTERNO);
                    }
                    List<Integer> novoX = new ArrayList<>();
                    for (j = 0; j < lugares.size(); j++) {
                        if (x.get(j) == RedeDePetri.W) {
                            novoX.add(RedeDePetri.W);
                        } else {
                            novoX.add(x.get(j));
                            if (adjLugar[j][i]!=-1) {
                                novoX.set(j, novoX.get(j)-adjLugar[j][i]);
                            }
                            if (adjTransicao[i][j]!=-1) {
                                novoX.set(j, novoX.get(j)+adjTransicao[i][j]);
                            }
                        }
                    }
                    ArvoreDeCobertura filho = RedeDePetri.this.arvoreDeCobertura(novoX, vis);
                    res.getFilhos().add(filho);
                }
            }
            if (definido == 0) {
                res.setTipoNo(ArvoreDeCobertura.NO_TERMINAL);
            }
            vis.remove(x);
            return res;
        }
    }

}
