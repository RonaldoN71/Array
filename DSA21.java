import java.util.Arrays;

public class DSA21 {
    public static void main(String[]args){
        int a[] = {4,9,8,2,3};
        int k = 2;
        Arrays.sort(a);
        int n = a.length;
        int i = n-k;
        System.out.println(a[i]);
    }
}