// public class DSA14 {
//     static void MaxSub(int []a){
//         int n= a.length;
//         int max = Integer.MIN_VALUE;
//         for(int i=0;i<n;i++ ){
//             for(int j=i;j<n;j++){
//                 int count =0;
//                 for(int k=i;k<=j;k++){
//                   count +=a[k];
//                   if(count>max){
//                     max = count;
//                   }
//                 }
               
//             }
//         }
//         System.out.println(max);
//     }
//     public static void main(String[]args){
//          int a[] = {1,2,3,4};
//     MaxSub(a);
//     }
   
// }
// public class DSA14{
//     static void MaxSub(int []a){
        
//         int maxsum = Integer.MIN_VALUE;
//         int cursum = 0;
//         for(int num:a){
//             cursum +=num;
//             if(cursum<0){
//                 cursum = 0;
//             }
//             maxsum = Math.max(cursum,maxsum);
//         }
//         System.out.println(maxsum);
        
//     }
//     public static void main(String[]args){
//         int a[] = {1,2,3,4};
//         MaxSub(a);
//     }

// }
class DSA14{
    static void MaxSub(int []a){
        int n=a.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=i;j<n;j++){
                count+=a[j];
                if(count>max){
                    max = count;
                }
            }
        }
        System.out.println(max);
    }
    public static void main(String[]args){
    int a[] = {1,2,3,4};
    MaxSub(a);
}
}
