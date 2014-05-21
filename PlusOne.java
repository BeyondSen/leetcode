package leetcode;
/*Given a non-negative number represented as an array of digits, plus one to the number.
 * The digits are stored such that the most significant digit is at the head of the list.
 * ����һ���������ʾ�ķǸ��������һ֮��Ľ������������������ʾ�����λ��������ͷ����
 */
public class PlusOne {
	public static void main(String[] args) {
		int[] digits = {9,9,9};
		int[] a = plusOne(digits);
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	public static int[] plusOne(int[] digits) {
        int flag = 0;
		for(int i=digits.length-1; i>=0; i--) {  //Note: i>= 0
        	if (i == digits.length -1) {
        		digits[i] = (digits[i] + flag + 1) % 10;
        	} else {
        		digits[i] = (digits[i] + flag) % 10;
        	}
			
        	if (digits[i] > 0) {
        		return digits;
        	} else {
        		flag = 1;
        	}
        }
		int[] a = new int[digits.length + 1];
		a[0] = 1;
		for (int i=1; i<digits.length; i++) {
			a[i] = digits[i-1];
		}
		return a;
    }
}
