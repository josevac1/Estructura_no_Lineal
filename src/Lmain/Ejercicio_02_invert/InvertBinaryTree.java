package Lmain.Ejercicio_02_invert;

import Lmain.Materia.Models.Node;

public class InvertBinaryTree {
    public Node invertTree(Node root) {
        // Si el nodo raíz es null, no hay nada que invertir, por lo tanto, retornamos null.
        if (root == null) {
          return null;
      }

      Node left = invertTree(root.getLeft());
  
      Node right = invertTree(root.getRight());
  
      root.setLeft(right);
      root.setRight(left);

      return root;
    }
    
}
