
//BRUTE FORCE METHOD
// import java.util.Arrays;
// public class DSA26 {
//     static void FindSumPair(int []a,int n,int target){
//         int left =0;
//         int right = n-1;
//         while(left<right){
//             int sum = a[left] + a[right];
//             if(sum<target){
//                 left++;
//             }
//             else if(sum>target){
//                 right--;
//             }
//             else{
//                 System.out.println("The pair: "+a[left]+" "+a[right]);
//                 return;
//             }  
//         }
//     }
//     public static void main(String[]args){
//         int a[] = {11, 15, 6, 8, 9, 10};
//         int target = 16;
//         int n = a.length;
//         Arrays.sort(a);
//         FindSumPair(a,n,target);      
//     }
// }

// import java.util.Arrays;
// import java.util.HashSet;
// public class DSA26 {
//     static boolean FindSumPair(int []a,int n,int target){
//         HashSet<Integer> set = new HashSet<>();
//         for(int i=0;i<n;i++){
//             int complement = target -a[i];
//             if(set.contains(complement)){
//                 return true;
//             }
//             set.add(a[i]);
//         }
//         return false;
//     }
//     public static void main(String[]args){
//         int a[] = {11, 15, 6, 8, 9, 10};
//         int target = 16;
//         int n = a.length;
//         Arrays.sort(a);
//         boolean value = FindSumPair(a,n,target);  
//         if(value){
//             System.out.println("True");
//         }
//         else{
//             System.out.println("False");
//         }
//     }
// }

import java.util.Arrays;
public class DSA26 {
    static boolean FindSumPair(int []a,int n,int target){
        int l = 0;
        int r = 0;
        int i;
        for( i=0;i<n-1;i++){
            if(a[i]>a[i+1]){
                l = i+1;
                break;
            }
        }
        r = i;

        while(l!=r){
            if(a[l]+a[r]==target){
                return true;
            }
            if(a[l]+a[r]<target){
                l = (l+1)%n;
            }else{
                r = (r-1+n)%n;
            }
        }
        return false;

    }
    public static void main(String[]args){
        int a[] = {11, 15, 6, 8, 9, 10};
        int target = 16;
        int n = a.length;
        Arrays.sort(a);
        boolean value = FindSumPair(a,n,target);   
        if(value){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
