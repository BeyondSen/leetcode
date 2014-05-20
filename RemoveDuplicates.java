package leetcode;
/*
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * For example,
 * Given input array A = [1,1,2],
 * Your function should return length = 2, and A is now [1,2].
 * 思路还是同一个数组内使用双索引
 */
public class RemoveDuplicates
{
    
    public static int removeDuplicates(int[] A) {
        if (A.length == 0) {
            return 0;
        }
        
        int pos = 0;
        for (int i=1; i<A.length; i++) {
            if (A[i] != A[pos]) {
                A[++pos] = A[i];
            }
        }
        
        return pos + 1;
    }
}
