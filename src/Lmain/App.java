package Lmain;

import Lmain.Materia.Controllers.ArbolBinario;
/*
 * 
 * 
 * 
 */
import Lmain.Materia.Models.Node;

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


    }
}
