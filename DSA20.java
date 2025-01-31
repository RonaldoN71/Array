// Brute force approach
// public class DSA20 {
//     public static void main(String []args){
//         int a[] = {4,3,6,2,1,1};
//         int n = a.length;
//         int repeating =0;
//         int missing = 0;
//         for(int i=1;i<=n;i++){
//             int count = 0;
//             for(int j=0;j<n;j++){
//                 if(i==a[j]){
//                     count++;
//                 }
                
//                 }
//                 if(count==2){
//                     repeating = i;
//                 }
//                 else if(count==0){
//                     missing = i;
//                 if(missing !=0 && repeating !=0){
//                     break;
//                 }
//             }
//         }
//         System.out.println("Repeating: "+ repeating);
//         System.out.println("Missing: "+ missing);

//     }
// }

// public class DSA20 {
//     public static void main(String []args){
//         int a[] = {4,3,6,2,1,1};
//         int n = a.length;
//         int repeating =0;
//         int missing = 0;
//         int b[] = new int[n+1];
//         for(int i=0;i<n;i++){
//             b[a[i]]++;
//         }
//         for(int i=1;i<n+1;i++){
//             if(b[i]==2){
//                 repeating = i;
//             }else if(b[i]==0){
//                 missing = i;
//             }
//         }
//         System.out.println("Repeating: "+ repeating);
//         System.out.println("Missing: "+ missing);

//     }
// }

public class DSA20 {
    public static void main(String []args){
        int a[] = {4,3,6,2,1,1};
        int n = a.length;
        long repeating =0;
        long missing = 0;
        long sumn = (long) (n*(n+1))/2;
        long sumSquaren = (long) (n*(n+1)*(2*n+1))/6;
        long sum = 0;
        long sumSquare = 0;
        for(int i=0;i<n;i++){
            sum +=a[i];
            sumSquare +=a[i]*a[i];
        }
        long sumdiff = sumn-sum;
        long sumSquarediff = sumSquaren - sumSquare;
        missing = (sumdiff + sumSquarediff/sumdiff)/2;
        repeating = missing - sumdiff;
        
        System.out.println("Repeating: "+ repeating);
        System.out.println("Missing: "+ missing);

    }
}

