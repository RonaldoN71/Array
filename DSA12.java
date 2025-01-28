
public class DSA12 {
    public static void main(String[]args){
        int a[] = {3, 5, 4, 1, 9};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++){
            if(min>a[i]){
                min = a[i];
            }
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("Min and Max are: "+min+" "+max);

    }
}