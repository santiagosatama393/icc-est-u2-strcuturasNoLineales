import models.Persona;
import structures.node.Node;
import structures.trees.BinaryTree;
import structures.trees.Ejercicio1;
import structures.trees.Ejercicio2;
import structures.trees.IntTree;

public class App {
    public static void main(String[] args) throws Exception {
        // runIntTree();
        // runBinaryTree();
        runEjercicios();
        
    }

    private static void runEjercicios() {
        Ejercicio1 ejercicio1 = new Ejercicio1();
        int [] numeros = new int[] {5, 3, 7, 2, 4, 6, 8};
        ejercicio1.insert(numeros);

        Ejercicio2 ejercicio2 = new Ejercicio2();
        int[] numeros2 = new int[] {5, 3, 7, 2, 4, 6, 8};
        BinaryTree<Integer> tree = new BinaryTree<>();
        for (int numero2: numeros2)
            tree.add(numero2);
        Node<Integer> root = tree.getRoot();
        ejercicio2.inverTree(root);

    }

    // private static void runBinaryTree() {
    //     BinaryTree<String> arbolStrings = new BinaryTree<>();
    //     BinaryTree<Persona> arbolPersonas = new BinaryTree<>();
    //     arbolPersonas.add(new Persona("Pablo", 30));
    //     arbolPersonas.add(new Persona("Ana", 25));
    //     arbolPersonas.add(new Persona("Luis", 35));
    //     arbolPersonas.add(new Persona("Maria", 28));
        
    // }

    // private static void runIntTree() {
    //     IntTree arbolNumeros = new IntTree();
    //     arbolNumeros.add(50);
    //     arbolNumeros.add(10);
    //     arbolNumeros.add(30);
    //     arbolNumeros.add(60);
    //     arbolNumeros.add(70);
    //     arbolNumeros.add(55);

    //     System.out.println("-----Preorden-----");
    //     arbolNumeros.preOrden();
    //     System.out.println();
    //     System.out.println("-----PosOrden-----");
    //     arbolNumeros.posOrden();
    //     System.out.println();
    //     System.out.println("-----InOrden-----");
    //     arbolNumeros.inOrden();

        // Node<Integer> node1 = new Node(50);
        // Node<Integer> node2 = new Node(10);
        // Node<Integer> node3 = new Node(30);

        // //Raiz del arbol sea node1
        // arbolNumeros.setRoot(node1);
        // node1.setRight(node2);
        // node2.setLeft(node3);

        // System.out.println(arbolNumeros.getRoot());
        // System.out.println(arbolNumeros.getRoot().getLeft().getRight());



    // }
}


