package structures.trees;

import structures.node.Node;

public class BinaryTree<T extends Comparable<T>> {
    private Node<T> root;

    //CONSTRUCTOR
    public BinaryTree(){
        this.root = null;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public void setRoot(T value){
        Node<T> node = new Node<T>(value);
        this.root = node;
    }

    public void add(T value) {
        Node<T> node = new Node<T>(value);
        root = addRecursivo(root, node);
    }

    private Node<T> addRecursivo(Node<T> actual, Node<T> nodeInsertar) {
        if (actual == null) { 
            return nodeInsertar;        
        }
        //if(actual.getValue() > nodeInsertar.getValue()){
            //Izquierda
        if(actual.getValue().compareTo(nodeInsertar.getValue())>0){
            actual.setLeft(addRecursivo(actual.getLeft(), nodeInsertar));
        }else{
            actual.setRight(addRecursivo(actual.getRight(), nodeInsertar));
        }
        return actual;
    }

    public void preOrden(){
        preOrdenRecursivo(root);
    }

    private void preOrdenRecursivo(Node<T> actual) {
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

    private void posOrdenRecursivo(Node<T> actual) {
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

    private void inOrdenRecursivo(Node<T> actual) {
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

    private int getHeightRecursivo(Node<T> actual) {
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

    private int getWeightRecursivo(Node<T> actual) {
        if(actual == null)
            return 0;
        int heightLeft = getHeightRecursivo(actual.getLeft());
        int heightRight = getHeightRecursivo(actual.getRight());

        return heightLeft + heightRight + 1;
    }
}