package structures.trees;

import structures.node.Node;

public class Ejercicio2 {
    public void inverTree(Node<Integer> root){
        System.out.println("Arbol original: ");
        printTree(root);
        invertirRecursivo(root);
        System.out.println();
        System.out.println("Arbol invertido: ");
        printTree(root);
    }
    private void printTree(Node<Integer> root) {
        printTreeRecursivo(root, 0);
    }
    private void invertirRecursivo(Node<Integer> actual){
        if(actual == null){
            return;
        }
        Node<Integer> aux = actual.getLeft();
        actual.setLeft(actual.getRight());
        actual.setRight(aux);
        invertirRecursivo(actual.getLeft());
        invertirRecursivo(actual.getRight());
    
    }
    private void printTreeRecursivo(Node<Integer> actual, int nivel){
        if(actual == null){
            return;
        }
        printTreeRecursivo(actual.getRight(), nivel + 1);
        for (int i = 0; i < nivel; i++) {
            System.out.print("    ");
        }
        System.out.println(actual.getValue());
        printTreeRecursivo(actual.getLeft(), nivel + 1);
    }
}