package principal;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author SebastiaoGaleno
 */
public class RedeDePetri {

    private final int MAXTAM = 100;
    private final int TIPO_LUGAR = 1;
    private final int TIPO_TRANSICAO = 2;

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
            for (int j = 0; j < MAXTAM; j++) {
                mat[i][j] = -1;
            }
        }
    }

    public void inserirLugar(String lugar) {
        indiceLugar.put(lugar, vertices.size());
        vertices.add(lugar);
        tipos.add(TIPO_LUGAR);
    }
    
    public void inserirLugares(String []lugares) {
        for (String lugar : lugares) {
            inserirLugar(lugar);
        }
    }
   
    public void inserirTransicao(String transicao) {
        indiceTransicao.put(transicao, vertices.size());
        vertices.add(transicao);
        tipos.add(TIPO_TRANSICAO);
    }
    
    public void inserirTransicoes(String []transicoes) {
        for (String transicao : transicoes) {
            inserirTransicao(transicao);
        }
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
    
    public String toString() {
        int i, j;
        String lugar, transicao;
        int peso;
        String res="";
        res += "Lugares:";
        for (i=0; i<vertices.size(); i++) {
            if (tipos.get(i)==TIPO_LUGAR) {
                res += " " + vertices.get(i);
            }
        }
        res += "\n";
        res += "Transições:";
        for (i=0; i<vertices.size(); i++) {
            if (tipos.get(i)==TIPO_TRANSICAO) {
                res += " " + vertices.get(i);
            }
        }
        res += "\n\n";
        res += "Arestas de lugares para transições:\n";
        for (i=0; i<vertices.size(); i++) {
            if (tipos.get(i)==TIPO_LUGAR) {
                lugar = vertices.get(i);
                res += lugar + ":";
                for (j=0; j<vertices.size(); j++) {
                    if (matrizPeso[i][j]!=-1) {
                        transicao = vertices.get(j);
                        peso = matrizPeso[i][j];
                        res += "  --> " + "(" + transicao + ", " + peso + ")";
                    }
                }
                res += "\n";
            }
        }
        res += "\n";
        res += "Arestas de transições para lugares:\n";
        for (i=0; i<vertices.size(); i++) {
            if (tipos.get(i)==TIPO_TRANSICAO) {
                transicao = vertices.get(i);
                res += transicao + ":";
                for (j=0; j<vertices.size(); j++) {
                    if (matrizPeso[i][j]!=-1) {
                        lugar = vertices.get(j);
                        peso = matrizPeso[i][j];
                        res += "  --> " + "(" + lugar + ", " + peso + ")";
                    }
                }
                res += "\n";
            }
        }
        return res;
    }
    
    
            
            
}
