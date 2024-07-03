package Lmain.Materia.Controllers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Lmain.Materia.Models.NodoGraph;

public class Graph {

    
        private List<NodoGraph> nodes;

    public Graph() {
        this.nodes=new ArrayList<>();
    }

    public NodoGraph addNode(int value){
        NodoGraph newNode=new NodoGraph(value);
        nodes.add(newNode);
        return newNode;
    }
    public void addEdge(NodoGraph src,NodoGraph dest){
        src.addNeighbor(dest);
        dest.addNeighbor(src);


    }
    public void printGraph(){
        for(NodoGraph node: nodes){
            System.out.print("Vertex"+ node.getValue()+" :" );
            for(NodoGraph neighbor :node.getNeighors()){
                System.out.print("->"+ neighbor.getValue());
            }
            System.out.println();
        }

    }
   
    // Método de búsqueda en profundidad (DFS)
    public void getDFS(NodoGraph startNodoGraph) {
        boolean[] visited = new boolean[nodes.size()];
        getDFSUtil(startNodoGraph, visited);
        System.out.println();
    }

    private void getDFSUtil(NodoGraph node, boolean[] visited) {
        int index = nodes.indexOf(node);
        if (index == -1 || visited[index]) {
            return;
        }
        visited[index] = true;
        System.out.print(node.getValue() + " ");
        for (NodoGraph neighbor : node.getNeighors()) {
            getDFSUtil(neighbor, visited);
        }
    }

    // Método de búsqueda en anchura (BFS)
    public void getBFS(NodoGraph startNodoGraph) {
        boolean[] visited = new boolean[nodes.size()];
        Queue<NodoGraph> queue = new LinkedList<>();
        visited[nodes.indexOf(startNodoGraph)] = true;
        queue.add(startNodoGraph);

        while (!queue.isEmpty()) {
            NodoGraph node = queue.poll();
            System.out.print(node.getValue() + " ");
            for (NodoGraph neighbor : node.getNeighors()) {
                int index = nodes.indexOf(neighbor);
                if (!visited[index]) {
                    visited[index] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    // Método para obtener la matriz de adyacencia
    public int[][] getAdjacencyMatrix() {
        int size = nodes.size();
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            NodoGraph node = nodes.get(i);
            for (NodoGraph neighbor : node.getNeighors()) {
                int j = nodes.indexOf(neighbor);
                matrix[i][j] = 1;
            }
        }
        return matrix;
    }

    // Método para imprimir la matriz de adyacencia
    public void printAdjacencyMatrix() {
        int[][] matrix = getAdjacencyMatrix();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}