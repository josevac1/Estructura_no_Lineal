package Lmain.Ejercicio_03_listLeves;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import Lmain.Materia.Models.Node;

public class ListLevels {

    public List<LinkedList<Node>> listLevels(Node root) {
        if (root==null) {
            return null;
        }
        List<LinkedList<Node>> result=new ArrayList<>();
        LinkedList<Node> current=new LinkedList<>();
        current.add(root);

        while (!current.isEmpty()) {
            result.add(current);
            LinkedList<Node> next = new LinkedList<>();
            for (Node node : current) {
                if (node.getLeft()!= null) {
                    next.add(node.getLeft());
                }
                if (node.getRight()!= null) {
                    next.add(node.getRight());
                }
            }
            current = next;
        }
        return result;
    }
    
}
