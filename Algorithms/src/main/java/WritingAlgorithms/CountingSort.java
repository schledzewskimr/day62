package WritingAlgorithms;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        String S = "edsab";
        System.out.println("In lexicographical order, string will be " + countSort(S));
    }
    public static String countSort (String arr){
        StringBuilder sb=new StringBuilder();
        char[] charString =arr.toCharArray();
        Arrays.sort(charString);
        for(int i=0;i<charString.length;i++){
            sb.append(charString[i]);
        }
        return sb.toString();
    }
}
