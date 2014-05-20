package leetcode;
/*
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 * If the last word does not exist, return 0.
 * Note: A word is defined as a character sequence consists of non-space characters only.
 * For example, 
 * Given s = "Hello World",
 * return 5.
 * 用split方法时，需要先用trim()方法去掉首尾空格、制表符，因为首部的空格和制表符split会保留
 */
public class LengthOfLastWord
{
    
    
    public static int lengthOfLastWord(String s) {
        if (s != null || s.trim().split(" ") != null) {
            String[] arr = s.trim().split(" ");
            int len = arr[arr.length-1].length();
            return len;
        }
        return 0;
    }
    
    public static int lengthOfLastWord2(String s) {
        if (s == null)
            return 0;
        char[] c = s.toCharArray();
        int sum = 0;
        int num = 0;
        int i =0;
        
        while (i<c.length) {
            while (i<c.length && c[i] != ' ') {
                i++;
                num++;
            }
            sum = num;
            while (i<c.length && c[i] == ' ') {
                i++;
                num = 0;
            }
            
        }
        return sum;
    }
}
