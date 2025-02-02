public class DSA25 {
    public static void main(String[]args){
        int [] a = {1,2,3,4,5};
        int n = a.length;
        int left = 0;
        int right = n-1;
        int min = Integer.MAX_VALUE;
        while(left<=right){
            int mid = (left+right)/2;
            if(a[left]<=a[mid]){
                if(a[left]<min){
                    min = a[left];
                }
                left = mid+1;
            }
            else{
                if(a[mid]<min){
                    min = a[mid];
                }
                right = mid-1;
            }
        }
        System.out.println(min);
    }
}
