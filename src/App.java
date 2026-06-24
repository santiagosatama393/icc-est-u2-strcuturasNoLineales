import java.util.List;

import models.Persona;
import structures.node.Node;
import structures.trees.BinaryTree;
import structures.trees.Ejercicio1;
import structures.trees.Ejercicio2;
import structures.trees.Ejercicio3;
import structures.trees.Ejercicio4;
import structures.trees.IntTree;

public class App {

    public static void main(String[] args) throws Exception {
        // runIntTree();
        // runBinaryTree();
        runEjercicios();
    }

    private static void runEjercicios() {

        Ejercicio1 ejercicio1 = new Ejercicio1();
        int[] numeros = {5, 3, 7, 2, 4, 6, 8};

        System.out.println("------ Ejercicio 1 ------");
        ejercicio1.insert(numeros);

        Ejercicio2 ejercicio2 = new Ejercicio2();
        int[] numeros2 = {4, 7, 2, 9, 6, 3, 1};

        BinaryTree<Integer> tree = new BinaryTree<>();

        for (int numero : numeros2) {
            tree.add(numero);
        }

        Node<Integer> root = tree.getRoot();

        System.out.println("------ Ejercicio 2 ------");
        ejercicio2.inverTree(root);

        Ejercicio3 ejercicio3 = new Ejercicio3();
        int[] numeros3 = {4, 2, 7, 1, 3, 6, 9};

        BinaryTree<Integer> tree2 = new BinaryTree<>();

        for (int numero : numeros3) {
            tree2.add(numero);
        }

        System.out.println("------ Ejercicio 3 ------");

        List<List<Node<Integer>>> niveles =
                ejercicio3.listLevels(tree2.getRoot());

        for (int i = 0; i < niveles.size(); i++) {

            List<Node<Integer>> nivel = niveles.get(i);

            for (int j = 0; j < nivel.size(); j++) {

                System.out.print(nivel.get(j).getValue());

                if (j < nivel.size() - 1) {
                    System.out.print(" -> ");
                }
            }

            System.out.println();
        }

        Ejercicio4 ejercicio4 = new Ejercicio4();
        int[] numeros4 = {10, 5, 3, 1};

        BinaryTree<Integer> tree3 = new BinaryTree<>();

        for (int numero : numeros4) {
            tree3.add(numero);
        }

        Node<Integer> root3 = tree3.getRoot();

        System.out.println("------ Ejercicio 4 ------");
        System.out.println(ejercicio4.maxDepth(root3));
    }

    private static void runBinaryTree() {

        BinaryTree<String> arbolStrings = new BinaryTree<>();

        BinaryTree<Persona> arbolPersonas = new BinaryTree<>();

        arbolPersonas.add(new Persona("Pablo", 30));
        arbolPersonas.add(new Persona("Ana", 25));
        arbolPersonas.add(new Persona("Luis", 35));
        arbolPersonas.add(new Persona("Maria", 28));

        System.out.println("-----Preorden-----");
        arbolPersonas.preOrden();

        System.out.println();
        System.out.println("-----PosOrden-----");
        arbolPersonas.posOrden();

        System.out.println();
        System.out.println("-----InOrden-----");
        arbolPersonas.inOrden();

        System.out.println();
        System.out.println("-----Height-----");
        System.out.println(arbolPersonas.getHeight());

        System.out.println();
        System.out.println("-----Weight-----");
        System.out.println(arbolPersonas.getWeight());
    }

    private static void runIntTree() {

        IntTree arbolNumeros = new IntTree();

        arbolNumeros.add(50);
        arbolNumeros.add(10);
        arbolNumeros.add(30);
        arbolNumeros.add(60);
        arbolNumeros.add(70);
        arbolNumeros.add(55);

        System.out.println("-----Preorden-----");
        arbolNumeros.preOrden();

        System.out.println();
        System.out.println("-----PosOrden-----");
        arbolNumeros.posOrden();

        System.out.println();
        System.out.println("-----InOrden-----");
        arbolNumeros.inOrden();

        System.out.println();
        System.out.println("-----Height-----");
        System.out.println(arbolNumeros.getHeight());

        System.out.println();
        System.out.println("-----Weight-----");
        System.out.println(arbolNumeros.getWeight());
    }
}