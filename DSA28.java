import java.util.Arrays;
import java.util.*;
public class DSA28 {
    static void OverlapInterval(int [][]arr){
        int n = arr.length;
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            int start = arr[i][0];
            int end = arr[i][1];
            if(!ans.isEmpty() && end<=ans.get(ans.size()-1).get(1)){
                continue;
            }

            for(int j=i+1;j<n;j++){
              if(end<= arr[j][0]){
                int mx = Math.max(end,arr[j][1]);
                end = mx;
              }else{
                break;
              }
            }
            ans.add(Arrays.asList(start,end));
        }
        for(List<Integer> lis: ans){
            System.out.print("[");
            for(int val : lis){
                System.out.print(val+" ");
            }
            System.out.print("] ");
        }
    }
   public static void main(String[]args) {
    int [][]a = {{1, 3},{8, 10},{2, 6},{15, 18}};
    OverlapInterval(a);
   }
}
