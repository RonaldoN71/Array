public class DSA19 {
    static void Stock(int a[]){
        int n = a.length;
        int buy = a[0];
        int profit = 0;
        for(int i=1;i<n;i++){
            if(buy>a[i]){
                buy = a[i];
            }else if((a[i]-buy)>profit){
                  profit = a[i]-buy;
            }
        }
        System.out.print(profit);
    }
    public static void main(String[]args){
        int a[] = {7,1,5,3,6,4};
        Stock(a);
    }
}
