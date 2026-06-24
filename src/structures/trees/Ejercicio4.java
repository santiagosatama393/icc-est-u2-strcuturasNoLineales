package structures.trees;

import structures.node.Node;

public class Ejercicio4 {
    public int maxDepth(Node<Integer> root){
        if(root == null)
            return 0;
        int maxDepthLeft = maxDepth(root.getLeft());
        int maxDepthRight = maxDepth(root.getRight());

        int masAlto = Math.max(maxDepthLeft, maxDepthRight);
        return masAlto + 1;
    }
}