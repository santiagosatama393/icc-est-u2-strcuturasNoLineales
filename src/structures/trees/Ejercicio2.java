package structures.trees;

import structures.node.Node;

public class Ejercicio2 {
    public void inverTree(Node<Integer> root) {
        System.out.println("Arbol original:");
        ordenHorizontal(root);
        invertirRecursivo(root);
        System.out.println("Arbol invertido:");
        ordenHorizontal(root);
    }
    private void invertirRecursivo(Node<Integer> actual) {
        if (actual == null) {
            return;
        }
        Node<Integer> aux = actual.getLeft();
        actual.setLeft(actual.getRight());
        actual.setRight(aux);
        invertirRecursivo(actual.getLeft());
        invertirRecursivo(actual.getRight());
    }
    public void ordenHorizontal(Node<Integer> root) {
        ordenHorizontalRecursivo(root, 0);
    }
    private void ordenHorizontalRecursivo(Node<Integer> actual, int nivel) {
        if (actual == null) {
            return;
        }
        ordenHorizontalRecursivo(actual.getRight(), nivel + 1);
        for (int i = 0; i < nivel; i++) {
            System.out.print("    ");
        }
        System.out.println(actual.getValue());
        ordenHorizontalRecursivo(actual.getLeft(), nivel + 1);
    }
}