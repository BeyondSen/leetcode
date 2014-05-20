package leetcode;
/*
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * 给定一个数组和一个值，替换掉所有数组中包含该值的元素并返回调整后的数组长度
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * 采用双索引思路
 */
public class RemoveElement
{
    
    public static int removeElement(int[] A, int elem) {
        int index = 0;
        for (int i=0; i<A.length; i++) {
            if (A[i] != elem) {
                A[index++] = A[i] ;
            }
        }

        return index;
        
    }
}
