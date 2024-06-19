package Lmain.Materia.Controllers;
import java.util.Stack;
import Lmain.Materia.Models.Node;
public class ArbolBinario {
    public void preOrdenloop(Node root){
        if (root==null) {
            return;           
        }

        Stack<Node> stack=new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node=stack.pop();

            System.out.print(node.getValue()+" - ");
            if (node.getRight() !=null) {
                stack.push(node.getRight());
            }
            if (node.getLeft()!=null) {
                stack.push(node.getLeft());
            }   
        }
    }

    public void preOrdenRecursivo(Node node){
        if (node !=null) {
        System.out.print(node.getValue()+" - ");
        preOrdenRecursivo(node.getLeft());
        preOrdenRecursivo(node.getRight());            
        }
    }

    public void postOrderloop(Node root){
        if (root==null) {
            return;
        }
        Stack<Node> stack1=new Stack<>();
        Stack<Node> stack2=new Stack<>();
        stack1.push(root);

        while (!stack1.isEmpty()) {
            Node node =stack1.pop();
            stack2.push(node);
            if (node.getLeft()!=null) {
                stack1.push(node.getLeft());
                
            }
            if (node.getRight()!=null) {
                stack1.push(node.getRight());
            }
        }

        while (!stack2.isEmpty()) {
            Node node=stack2.pop();
            System.out.print(node.getValue()+" - ");
        }

    }

    public void postOrdenRecursivo(Node node){
        if (node !=null) {
            postOrdenRecursivo(node.getLeft());
            postOrdenRecursivo(node.getRight());            
            System.out.print(node.getValue()+" - ");
        }

    }
    public void inOrdenRecursivo(Node node ){
        if (node !=null) {
            inOrdenRecursivo(node.getLeft());
            System.out.print(node.getValue()+" - ");
            inOrdenRecursivo(node.getRight());            
        }

    }
}
