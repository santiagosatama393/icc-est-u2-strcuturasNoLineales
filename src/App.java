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
        probarTodos(new int[]{});
        probarTodos(new int[]{4});
        probarTodos(new int[]{4, 2, 7, 1, 3, 6, 9});
        probarTodos(new int[]{1, 2, 3, 4});
    }

    public static void probarTodos(int[] numeros) {
        Ejercicio1 ejercicioUno = new Ejercicio1();
        Ejercicio2 ejercicioDos = new Ejercicio2();
        Ejercicio3 ejercicioTres = new Ejercicio3();
        Ejercicio4 ejercicioCuatro = new Ejercicio4();

        System.out.println();
        System.out.println("------ Caso de prueba ------");

        System.out.println();
        System.out.println("Ejercicio Uno:");
        ejercicioUno.insert(numeros);

        System.out.println();
        System.out.println("Ejercicio Dos:");
        ejercicioDos.inverTree(crearArbol(numeros).getRoot());

        System.out.println();
        System.out.println("Ejercicio Tres:");

        List<List<Node<Integer>>> niveles =
                ejercicioTres.listLevels(crearArbol(numeros).getRoot());

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

        System.out.println();
        System.out.println("Ejercicio Cuatro:");
        Node<Integer> root = crearArbol(numeros).getRoot();
        System.out.println("Profundidad máxima: " + ejercicioCuatro.maxDepth(root));
    }

    public static BinaryTree<Integer> crearArbol(int[] numeros) {
        BinaryTree<Integer> tree = new BinaryTree<>();

        for (int numero : numeros) {
            tree.add(numero);
        }

        return tree;
    }

    private static void runBinaryTree() {
        BinaryTree<Persona> arbolPersona = new BinaryTree<>();

        arbolPersona.add(new Persona("Alice", 30));
        arbolPersona.add(new Persona("Bob", 25));
        arbolPersona.add(new Persona("Charlie", 35));
        arbolPersona.add(new Persona("David", 28));
        arbolPersona.add(new Persona("Eve", 32));

        System.out.println();
        System.out.println("Recorrido InOrden:");
        arbolPersona.inOrden();

        System.out.println();
        System.out.println("Recorrido PreOrden:");
        arbolPersona.preOrden();

        System.out.println();
        System.out.println("Recorrido PosOrden:");
        arbolPersona.posOrden();

        System.out.println();
        System.out.println("Altura del árbol:");
        System.out.println(arbolPersona.getHeight());

        System.out.println();
        System.out.println("Peso del árbol:");
        System.out.println(arbolPersona.getWeight());
    }

    private static void runIntTree() {
        IntTree arbol = new IntTree();

        arbol.add(50);
        arbol.add(10);
        arbol.add(60);
        arbol.add(30);
        arbol.add(55);
        arbol.add(70);

        System.out.println();
        System.out.println("Recorrido InOrden:");
        arbol.inOrden();

        System.out.println();
        System.out.println("Recorrido PreOrden:");
        arbol.preOrden();

        System.out.println();
        System.out.println("Recorrido PosOrden:");
        arbol.posOrden();

        System.out.println();
        System.out.println("Altura del árbol:");
        System.out.println(arbol.getHeight());

        System.out.println();
        System.out.println("Peso del árbol:");
        System.out.println(arbol.getWeight());
    }
}