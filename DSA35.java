// public class DSA35 {
//     static int SubMaxDiv(int []a,int t){
//         int n= a.length;
//         int maxIndiff =0;
//         for(int i=0;i<n;i++){
//             for(int j=i;j<n;j++){
//                 int sum = 0;
//                 for(int k=i;k<=j;k++){
//                     sum += a[k];
//                     if(sum%t==0){
//                        if((k-i+1)>maxIndiff){
//                         maxIndiff = k-i+1;
//                        }
//                     }
//                 }
//             }
//         }
//         return maxIndiff;
//     }
//     public static void main(String[] args) {
//         int [] a = {2, 7, 6, 1, 4, 5};
//         int k = 3;
//         int result = SubMaxDiv(a,k);
//         if(result !=0){
//             System.out.println("Max no. of Sub: "+result);
//         }else{
//             System.out.println("Sub not found");
//         }
//     }
// }

public class DSA35 {
    static int SubMaxDiv(int []a,int t){
        int n= a.length;
        int maxIndiff =0;
        for(int i=0;i<n;i++){
            int sum =0;
            for(int j=i;j<n;j++){
                sum+=a[j];
                if(sum%t==0){
                    if((j-i+1)>maxIndiff){
                        maxIndiff=j-i+1;
                    }
                }
            }
        }
        return maxIndiff;
    }
    public static void main(String[] args) {
        int [] a = {2, 7, 6, 1, 4, 5};
        int k = 3;
        int result = SubMaxDiv(a,k);
        if(result !=0){
            System.out.println("Max no. of Sub: "+result);
        }else{
            System.out.println("Sub not found");
        }
    }
}

