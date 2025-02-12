public class DSA32 {
    static void merge4Palin(int []a){
        int n = a.length;
        int i,j;
        int ans = 0;
        for( i=0,j=n-1;i<j;){
        if(a[i]==a[j]){
            i++;
            j--;
        }else{
            if(a[i]<a[j]){
                a[i+1] = a[i+1]+a[i];
                i++;
                ans++;
            }else{
                a[j-1] = a[j-1] + a[j];
                j--;
                ans++;
            }
        }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int []a = {11, 14, 15, 99};
        merge4Palin(a);
    }
}
