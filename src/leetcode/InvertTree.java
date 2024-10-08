package leetcode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */

public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null; // Caso base, se a árvore for vazia
        }

        // Troca os filhos esquerdo e direito
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Chama recursivamente para os subárvores esquerda e direita
        invertTree(root.left);
        invertTree(root.right);

        return root; // Retorna a raiz invertida
    }
}
