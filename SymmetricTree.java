package leetcode;
/*
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * 判断是否是对称树
 */

public class SymmetricTree {
    public static void main(String[] args) {
        TreeNode tNode =  new TreeNode(3);
        tNode.left =  new TreeNode(2);
        tNode.right =  new TreeNode(1);
        System.out.println(isSymmetric(tNode));
    }
    
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }  
        
        return judge(root.left, root.right);
    }
    
    public static boolean judge(TreeNode lchild, TreeNode rchild){
        if (lchild == null || rchild == null) {
            if (lchild == null && rchild == null) {
                return true;
            } else {
                return false;
            }
        } 

        if (lchild.val != rchild.val) {
            return false;
        }
        
        return judge(lchild.left, rchild.right) && judge(lchild.right, rchild.left);//here is different with SameTree
    }
}
