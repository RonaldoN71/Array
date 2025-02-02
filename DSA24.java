// Brute force method
// public class DSA24 {
//     public static void main(String[]args){
//         int []a = {-2,0,-1};
//         int n = a.length;
//         int max = Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//             for(int j=i;j<n;j++){
//                 int value = 1;
//                 for(int k=i;k<=j;k++){
//                     value *= a[k];
//                 }
//                 if(value>max){
//                     max = value;
//                 }
//             }
//         }
//         System.out.println(max);
//     }
// }

// public class DSA24 {
//     public static void main(String[]args){
//         int []a = {-3,-4,-1,2};
//         int n = a.length;
//         int max = Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//             int value = 1;
//             for(int j=i;j<n;j++){
//                value *= a[j];
//                max = Math.max(value,max);
//             }
//         }
//         System.out.println(max);
//     }
// }

public class DSA24 {
    public static void main(String[]args){
        int []a = {1,2,-1,-2,0,-3};
        int n = a.length;
        int max = Integer.MIN_VALUE;
        int prefix =1,suffix =1;

        for(int i=0;i<n;i++){
            if(prefix==0) prefix = 1;
            if(suffix==0) suffix = 1;
            prefix *= a[i];
            suffix *= a[n-i-1];
            max = Math.max(max,Math.max(prefix,suffix));
            }
        
        System.out.println(max);
    }
}