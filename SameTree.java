package leetcode;
/*
 * Given two binary trees, write a function to check if they are equal or not.
 * 判断两个二叉树是否相同
 */
public class SameTree {
    public static void main(String[] args) {
        TreeNode tNode1 =  new TreeNode(3);
        tNode1.left =  new TreeNode(2);
        TreeNode tNode2 =  new TreeNode(3);
        System.out.println(isSameTree(tNode1, tNode2));
    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            if (p== null && q == null) {
                return true;
            }
            return false;
        }
        
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right); //here is different with SymmetricTree
    }
}
