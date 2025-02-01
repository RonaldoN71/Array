public class DSA22 {
    static void TrapWater(int a[]){
        int n = a.length;
        int [] leftMost = new int[n];
        int [] rightMost = new int[n];
        leftMost[0] = a[0];
        rightMost[0] = a[n-1];
        for(int i=1;i<n;i++){
            leftMost[i] = Math.max(leftMost[i-1],a[i]);
        }
        for(int i=n-2;i>0;i--){
            rightMost[i] = Math.max(rightMost[i+1],a[i]);
        }
        // now traversing and storing the water to the tank
        int tank = 0;
        for(int i=0;i<n;i++){
            int c = Math.min(leftMost[i],rightMost[i]);
            if( c>a[i]){
                int trap = c -a[i];
                tank += trap;
            }
        }
        System.out.println(tank);
    }
    public static void main(String[]args){
        int a[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        TrapWater(a);
    }
}
