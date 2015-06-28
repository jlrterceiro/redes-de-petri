/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import com.mxgraph.layout.mxParallelEdgeLayout;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import principal.RedeDePetri;

public class DesenhoRedeDePetri extends JFrame {

    private RedeDePetri rede;
    private mxGraph graph;
    private mxGraphComponent graphComponent;
    private Object parent;

    public DesenhoRedeDePetri(RedeDePetri rede, String titulo) {
        super(titulo);
        int altura = Math.max(rede.getLugares().size(), rede.getTransicoes().size());
        altura = 100*(altura+1);
        this.setSize(600, altura);
        this.setResizable(false);
        this.setAlwaysOnTop(true);
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        this.setBounds((screenSize.width - this.getWidth()) / 2, (screenSize.height - this.getHeight()) / 2, this.getWidth(), this.getHeight());
        this.rede = rede;
        this.atualizar();
    }
    
    public void atualizar() {
        if (graphComponent != null) {
            this.getContentPane().remove(graphComponent);
        }

        graph = new mxGraph();
        parent = graph.getDefaultParent();

        this.desenharRedeDePetri();

        graphComponent = new mxGraphComponent(graph);

        graphComponent.setEnabled(false);
        graphComponent.setEventsEnabled(true);
        graphComponent.getGraphControl().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

            }
        });

        getContentPane().add(graphComponent);
    }
    
    private void desenharRedeDePetri() {
        List<Object> verticesLugares = new ArrayList<>();
        List<Object> verticesTransicoes = new ArrayList<>();
        Object u, v;
        int peso;
        
        graph.getModel().beginUpdate();
        
        int i, j;
        for (i=0; i<rede.getLugares().size(); i++) {
            u = graph.insertVertex(parent, null, rede.getLugares().get(i), 50, 50+100*i, 50, 50, "shape=ellipse;fillColor=#fcfeff");
            verticesLugares.add(u);
        }
        
        for (i=0; i<rede.getTransicoes().size(); i++) {
            u = graph.insertVertex(parent, null, rede.getTransicoes().get(i), 500, 50+100*i, 50, 50, "fillColor=#000000;");
            verticesTransicoes.add(u);
        }
        
        for (i=0; i<rede.getLugares().size(); i++) {
            for (j=0; j<rede.getTransicoes().size(); j++) {
                if (rede.getAdjLugar()[i][j]!=-1) {
                    u=verticesLugares.get(i);
                    v=verticesTransicoes.get(j);
                    peso=rede.getAdjLugar()[i][j];
                    graph.insertEdge(v, null, "" + peso, u, v);
                }
                if (rede.getAdjTransicao()[j][i]!=-1) {
                    u=verticesTransicoes.get(j);
                    v=verticesLugares.get(j);
                    peso=rede.getAdjTransicao()[j][i];
                    graph.insertEdge(v, null, "" + peso, u, v);
                }
            }
        }
        
        
        graph.getModel().endUpdate();
        
        mxParallelEdgeLayout p = new mxParallelEdgeLayout(graph, 30);
        
        p.execute(parent);
    }
    

}
