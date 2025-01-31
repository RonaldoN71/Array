// Brute force approach
public class DSA20 {
    public static void main(String []args){
        int a[] = {4,3,6,2,1,1};
        int n = a.length;
        int repeating =0;
        int missing = 0;
        for(int i=1;i<=n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(i==a[j]){
                    count++;
                }
                
                }
                if(count==2){
                    repeating = i;
                }
                else if(count==0){
                    missing = i;
            }
        }
        System.out.println("Repeating: "+ repeating);
        System.out.println("Missing: "+ missing);

    }
}
