package structures.trees;

import structures.node.Node;

// CLASE DE ARBOL SOLO DE ENTEROS
public class IntTree {
    private Node<Integer> root;

    //CONSTRUCTOR
    public IntTree(){
        this.root = null;
    }

    public Node<Integer> getRoot() {
        return root;
    }

    public void setRoot(Node<Integer> root) {
        this.root = root;
    }

    public void setRoot(Integer value){
        Node<Integer> node = new Node<Integer>(value);
        this.root = node;
    }

    public void add(int value) {
        Node<Integer> node = new Node<Integer>(value);
        root = addRecursivo(root, node);
    }

    private Node<Integer> addRecursivo(Node<Integer> actual, Node<Integer> nodeInsertar) {
        if (actual == null) { 
            return nodeInsertar;        
        }
        if(actual.getValue() > nodeInsertar.getValue()){
            //Izquierda
            actual.setLeft(addRecursivo(actual.getLeft(), nodeInsertar));
        }else{
            actual.setRight(addRecursivo(actual.getRight(), nodeInsertar));
        }
        return actual;
    }

    public void preOrden(){
        preOrdenRecursivo(root);
    }

    private void preOrdenRecursivo(Node<Integer> actual) {
        if(actual == null){
            return;
        }
        System.out.print(actual+ ", ");
        preOrdenRecursivo(actual.getLeft());
        preOrdenRecursivo(actual.getRight());
    }

    public void posOrden(){
        posOrdenRecursivo(root);
    }

    private void posOrdenRecursivo(Node<Integer> actual) {
         if(actual == null){
            return;
        }
        preOrdenRecursivo(actual.getLeft());
        preOrdenRecursivo(actual.getRight());
        System.out.print(actual + ", ");
    }

    public void inOrden(){
        inOrdenRecursivo(root);
    }

    private void inOrdenRecursivo(Node<Integer> actual) {
         if(actual == null){
            return;
        }
        inOrdenRecursivo(actual.getLeft());
        System.out.print(actual + ", ");
        inOrdenRecursivo(actual.getRight());
        
    }

    public int getHeight(){
        return getHeightRecursivo(root);
    }

    private int getHeightRecursivo(Node<Integer> actual) {
        if(actual == null)
            return 0;
        int heightLeft = getHeightRecursivo(actual.getLeft());
        int heightRight = getHeightRecursivo(actual.getRight());

        int masAlto = Math.max(heightLeft, heightRight);
        return masAlto + 1;
    }

    public int getWeight(){
        return getWeightRecursivo(root);
    }

    private int getWeightRecursivo(Node<Integer> actual) {
        if(actual == null)
            return 0;
        int heightLeft = getHeightRecursivo(actual.getLeft());
        int heightRight = getHeightRecursivo(actual.getRight());

        return heightLeft + heightRight + 1;
    }
}