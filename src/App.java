import java.util.List;
import java.util.Set;

import Collections.Maps.Maps;
import Collections.Set.Sets;
import models.Contacto;
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
        // runEjercicios();
       // runSets();
        runMaps();

    }

    private static void runSets() {

        Sets sets = new Sets();

        // HashSet
        System.out.println("---HashSet---");
        Set<String> hashSet = sets.construirHashSet();
        System.out.println(hashSet);
        System.out.println("Size: " + hashSet.size());
        System.out.println("Contiene F: " + hashSet.contains("F"));

        System.out.println();

        // LinkedHashSet
        System.out.println("---LinkedHashSet---");
        Set<String> lSet = sets.construirLinkedHashSet();
        System.out.println(lSet);
        System.out.println("Size: " + lSet.size());
        System.out.println("Contiene F: " + lSet.contains("F"));

        System.out.println();

        // TreeSet
        System.out.println("---TreeSet---");
        Set<String> tSet = sets.construirTreeSet();
        System.out.println(tSet);
        System.out.println("Size: " + tSet.size());
        System.out.println("Contiene F: " + tSet.contains("F"));

        System.out.println();

        // HashSet de Contactos
        System.out.println("---HashSet Contactos---");
        Set<Contacto> hContactosSet = sets.construirHashSetContactos();
        System.out.println(hContactosSet);
        System.out.println("Size: " + hContactosSet.size());

        Contacto contacto = new Contacto("Juan", "Perez", "0991111111");
        System.out.println("¿Existe Juan? " + hContactosSet.contains(contacto));
    }

    private static void runEjercicios() {
        probarTodos(new int[] {});
        probarTodos(new int[] { 4 });
        probarTodos(new int[] { 4, 2, 7, 1, 3, 6, 9 });
        probarTodos(new int[] { 1, 2, 3, 4 });
    }

    public static void probarTodos(int[] numeros) {
        Ejercicio1 ejercicioUno = new Ejercicio1();
        Ejercicio2 ejercicioDos = new Ejercicio2();
        Ejercicio3 ejercicioTres = new Ejercicio3();
        Ejercicio4 ejercicioCuatro = new Ejercicio4();

        System.out.println();
        System.out.println("------ Caso de prueba ------");

        System.out.println("\nEjercicio Uno:");
        ejercicioUno.insert(numeros);

        System.out.println("\nEjercicio Dos:");
        ejercicioDos.inverTree(crearArbol(numeros).getRoot());

        System.out.println("\nEjercicio Tres:");

        List<List<Node<Integer>>> niveles = ejercicioTres.listLevels(crearArbol(numeros).getRoot());

        for (List<Node<Integer>> nivel : niveles) {
            for (int i = 0; i < nivel.size(); i++) {
                System.out.print(nivel.get(i).getValue());

                if (i < nivel.size() - 1) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }

        System.out.println("\nEjercicio Cuatro:");
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

        System.out.println("\nRecorrido InOrden:");
        arbolPersona.inOrden();

        System.out.println("\nRecorrido PreOrden:");
        arbolPersona.preOrden();

        System.out.println("\nRecorrido PosOrden:");
        arbolPersona.posOrden();

        System.out.println("\nAltura del árbol:");
        System.out.println(arbolPersona.getHeight());

        System.out.println("\nPeso del árbol:");
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

        System.out.println("\nRecorrido InOrden:");
        arbol.inOrden();

        System.out.println("\nRecorrido PreOrden:");
        arbol.preOrden();

        System.out.println("\nRecorrido PosOrden:");
        arbol.posOrden();

        System.out.println("\nAltura del árbol:");
        System.out.println(arbol.getHeight());

        System.out.println("\nPeso del árbol:");
        System.out.println(arbol.getWeight());
    }
    private static void runMaps(){
        Maps maps= new Maps();
        maps.construirHashMap();
    }
    
}