import java.util.Arrays;


public class DSA26 {
    static void FindSumPair(int []a,int n,int target){
        int left =0;
        int right = n-1;
        while(left<right){
            int sum = a[left] + a[right];
            if(sum<target){
                left++;
            }
            else if(sum>target){
                right--;
            }
            else{
                System.out.println("The pair: "+a[left]+" "+a[right]);
                return;
            }  
        }
    }
    public static void main(String[]args){
        int a[] = {11, 15, 6, 8, 9, 10};
        int target = 16;
        int n = a.length;
        Arrays.sort(a);
        FindSumPair(a,n,target);      
    }
}


