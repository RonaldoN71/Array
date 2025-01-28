import java.util.Arrays;

public class DSA16 {
    static void ChocolateDis(int a[],int m){
        int n = a.length;
        Arrays.sort(a);
        int min = Integer.MAX_VALUE;
        for(int i=0;i+m-1<n;i++){
            int curdif = a[i+m-1]-a[i];
            if(curdif<min){
                min = curdif;
            }
        }
        System.out.println(min);

    }
    public static void main(String[]args){
        int a[] = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;
        ChocolateDis(a,m);
    }
}
