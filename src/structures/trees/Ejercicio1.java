package structures.trees;

import structures.node.Node;

public class Ejercicio1 {

    public void insert(int[] numeros){
        // Crear el arbol de enteros
        BinaryTree<Integer> tree = new BinaryTree<>();
        //Insertar cada numero 
        for (int numero : numeros) {
            tree.add(numero);
        }
        //Imprimir el Arbol
        tree.inOrden();
        printTree(tree.getRoot());
    }

    public void printTree(Node<Integer> root){
        System.out.println();
        System.out.println("Imprimir Abol: ");
        printTreeRecursivo(root, 0);
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