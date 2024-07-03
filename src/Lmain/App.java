package Lmain;

import Lmain.Materia.Controllers.AVLTree;
import Lmain.Materia.Controllers.ArbolBinario;
import Lmain.Materia.Controllers.Graph;
import Lmain.Materia.Controllers.Sets;
/*
 * 
 * 
 * 
 */
import Lmain.Materia.Models.Node;
import Lmain.Materia.Models.NodoGraph;

public class App {
    public static void main(String[] args) throws Exception {

        ArbolBinario arbol=new ArbolBinario();
        Node nodeRoot=new Node(1);
        nodeRoot.setLeft(new Node(2));
        nodeRoot.setRight(new Node(3));

        nodeRoot.getLeft().setLeft(new Node(4));
        nodeRoot.getLeft().setRight(new Node(5));
        
        nodeRoot.getRight().setRight(new Node(6));

        nodeRoot.getLeft().getLeft().setLeft(new Node (7));
        nodeRoot.getLeft().getLeft().setRight(new Node (8));

       System.out.println("preOrdenloop");
       arbol.preOrdenloop(nodeRoot);
       System.out.println("");
       System.out.println("preOrdenRecursivo");
       arbol.preOrdenRecursivo(nodeRoot);
       System.out.println();
       System.out.println("postOrderloop");
       arbol.postOrderloop(nodeRoot);
       System.out.println();
       System.out.println("postOrdenRecursivo");
       arbol.postOrdenRecursivo(nodeRoot);
       System.out.println();
       System.out.println("inOrdenRecursivo");
       arbol.inOrdenRecursivo(nodeRoot);

        System.out.println();
        System.out.println("-----------------------");
        AVLTree tree = new AVLTree();

        int[] values = { 10, 20, 15, 24, 9, 8, 21, 23, 50, 25 };

        for (int value : values) {
            tree.insert(value);
        }

        runGraph();
        runSets();
    }
    
    private static void runSets(){
        Sets variableClaes=new Sets();
        
    }
    
    
    private static void runGraph() {
        Graph graph=new Graph();
        
        //Agregar nodos 
        //NodoGraph nodo1=new NodoGraph(1);
        //NodoGraph nodo2=new NodoGraph(2);
        //NodoGraph nodo3=new NodoGraph(3);
        //NodoGraph nodo4=new NodoGraph(4);
        //NodoGraph nodo5=new NodoGraph(5);

        NodoGraph node1=graph.addNode(1);
        NodoGraph node2=graph.addNode(2);
        NodoGraph node3=graph.addNode(3);
        NodoGraph node4=graph.addNode(4);
        NodoGraph node5=graph.addNode(5);
        graph.addEdge(node1, node2);
        graph.addEdge(node2, node4);
        graph.addEdge(node4, node5);
        graph.addEdge(node1, node3);

        //Imprime el Graph
        graph.printGraph();

        // Búsqueda en profundidad (DFS)
        System.out.println("Búsqueda en profundidad (DFS) desde el nodo 1:");
        graph.getDFS(node4);

        // Búsqueda en anchura (BFS)
        System.out.println("Búsqueda en anchura (BFS) desde el nodo 1:");
        graph.getBFS(node2);

        // Imprimir la matriz de adyacencia
        System.out.println("Matriz de adyacencia:");
        graph.printAdjacencyMatrix();
    }
}
