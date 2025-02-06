//Brute force
// import java.util.*;
// public class DSA27 {
//     static void ThreeSum(int []a,int target){
        
//         Set<List<Integer>> set = new HashSet<>();
//         int n=a.length;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//             for(int k=j+1;k<n;k++){
//                 if(a[i]+a[j]+a[k] == target){
//                     List<Integer> list = new ArrayList<>();
//                     Collections.addAll(list,a[i],a[j],a[k]);
//                     Collections.sort(list);
//                     set.add(list);
//                 }
//             }
//         }
//         }
//         for(List <Integer> lis : set){
//             System.out.print("( ");
//             for(int val: lis){
//                 System.out.print(val+" ");
//             }
//             System.out.print(") ");
//         }
//     }
//     public static void main(String[]args){
//         int []a = {0,0,0};
//         int target = 0;
//         ThreeSum(a,target);
//     }
// }

import java.util.*;
public class DSA27 {
    static void ThreeSum(int []a,int target){
        int complement = 0;
        HashSet<List<Integer>> set = new HashSet<>();
        int n=a.length;
        for(int i=0;i<n;i++){
          HashSet<Integer> midset = new HashSet<>();
            for(int j=i+1;j<n;j++){
            complement = target-(a[i]+a[j]);
            if(midset.contains(complement)){
                List<Integer> list = new ArrayList<>();
                Collections.addAll(list,a[i],a[j],complement);
                Collections.sort(list);
                set.add(list);
            }
            midset.add(a[j]);
        }
        }
        for(List <Integer> lis : set){
            System.out.print("( ");
            for(int val: lis){
                System.out.print(val+" ");
            }
            System.out.print(") ");
        }
    }
    public static void main(String[]args){
        int []a = {-1,0,1,2,-1,-4};
        int target = 0;
        ThreeSum(a,target);
    }
}
