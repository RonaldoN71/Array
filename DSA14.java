public class DSA14 {
    static void MaxSub(int []a){
        int n= a.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++ ){
            for(int j=i;j<n;j++){
                int count =0;
                for(int k=i;k<=j;k++){
                  count +=a[k];
                  if(count>max){
                    max = count;
                  }
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
