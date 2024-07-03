package Lmain.Materia.Models;

import java.util.LinkedList;
import java.util.List;

public class NodoGraph {
    private int value;
    private List<NodoGraph> neighors;
    
    public NodoGraph(int value) {
        this.value = value;
        this.neighors = new LinkedList<>();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List<NodoGraph> getNeighors() {
        return neighors;
    }

    public void setNeighors(List<NodoGraph> neighors) {
        this.neighors = neighors;
    }

    public void addNeighbor (NodoGraph neighbor){
        this.neighors.add(neighbor);
    }
    
}