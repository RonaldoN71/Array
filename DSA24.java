// Brute force method
public class DSA24 {
    public static void main(String[]args){
        int []a = {-2,0,-1};
        int n = a.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int value = 1;
                for(int k=i;k<=j;k++){
                    value *= a[k];
                }
                if(value>max){
                    max = value;
                }
            }
        }
        System.out.println(max);
    }
}
