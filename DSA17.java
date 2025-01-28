public class DSA17 {
    static int SearchFromRotat(int a[],int k){
        int n = a.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(a[mid] == k) return mid;
            if(low<=mid){
                if(a[low]<=k && k<=a[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(a[mid]<=k && k<=a[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int a[] = {4,5,6,7,0,1,2};
        int k = 0;
        int result = SearchFromRotat(a,k);
        if(result == -1){
            System.out.println(-1);
        }else{
            System.out.println(result);
        }
    }
}
