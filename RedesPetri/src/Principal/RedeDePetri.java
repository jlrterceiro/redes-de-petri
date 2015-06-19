package Principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author SebastiaoGaleno
 */
public class RedeDePetri {

    private final int MAXTAM = 100;

    private ArrayList<String> vertices;
    private ArrayList<Integer> tipos;
    private Map<String, Integer> indiceLugar;
    private Map<String, Integer> indiceTransicao;
    private int[][] matrizPeso;
    private int[] grauEntrada;

    public RedeDePetri() {
        vertices = new ArrayList<>();
        tipos = new ArrayList<>();
        indiceLugar = new HashMap<>();
        indiceTransicao = new HashMap<>();;
        matrizPeso = new int[MAXTAM][MAXTAM];
        grauEntrada = new int[MAXTAM];
        inicializarMatriz(matrizPeso);
        inicializarVetor(grauEntrada);
    }

    public void inicializarVetor(int[] vet) {
        for (int i = 0; i < MAXTAM; i++) {
            vet[i]=0;
        }
    }
    
    public void inicializarMatriz(int[][] mat) {
        for (int i = 0; i < MAXTAM; i++) {
            for (int j = 1; j < MAXTAM; i++) {
                matrizPeso[i][j] = -1;
            }
        }
    }

    public void inserirLugar(String lugar) {
        indiceLugar.put(lugar, vertices.size());
        vertices.add(lugar);
    }

    public void inserirTransicao(String transicao) {
        indiceTransicao.put(transicao, vertices.size());
        vertices.add(transicao);
    }
    
    public void inserirArestaLugarTransicao(String lugar, String transicao, int peso) {
        int  a, b;
        a = indiceLugar.get(lugar);
        b = indiceTransicao.get(transicao);
        matrizPeso[a][b] = peso;
        grauEntrada [b] += peso;
    }
    
    public void inserirArestaTransicaoLugar(String transicao, String lugar, int peso) {
        int  a, b;
        a = indiceTransicao.get(transicao);
        b = indiceLugar.get(lugar);
        matrizPeso[a][b] = peso;
        grauEntrada [b] += peso;
    }
}
