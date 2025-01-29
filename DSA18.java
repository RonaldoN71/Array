class DSA18 {
    static void reverse(int []a,int start,int end){
        while(start<end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            
            start++;end--;
        }
    }
    static void swap(int []a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    static void nextPermutation(int []a){
        int n = a.length;
        int idx = -1;
        for(int i=n-1;i>0;i--){
            if(a[i-1]<a[i]){
                idx = i-1;
                break;
            }
        }
        if(idx==-1){
            reverse(a,0,n-1);
            return;
        }
        for(int i=n-1;i>idx;i--){
            if(a[i]>a[idx]){
                swap(a,idx,i);
                break;
            }
        }
        reverse(a,idx+1,n-1);
        

    }
   public static void main(String[]args) {
    int a[] = {2,1,5,4,3,0,0};
     nextPermutation(a);
     System.out.println("The next permutation of the array is: ");
        for(int num : a){
            System.out.print(num+ " ");
        }

   }
}