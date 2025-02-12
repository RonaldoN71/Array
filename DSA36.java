public class DSA36 {
    public static void main(String[] args) {
        int []a = {1,2,3,4,5};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                System.out.print("["+a[i]+" "+a[j]+"] ");
            }
             System.out.println();
        }
       
    }
}
