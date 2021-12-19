import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
In this question we are solving the subset problem with duplicates.
With duplicates we are trying not the add the repeating integer with previous sets instead add the repeating element with the future set.
*/
public class SubSetDuplicates {
    public static void main(String args[]){
        int[] arr = {1,2,2};
        List<List<Integer>> ans = subSetDuplicates(arr);
        for(List<Integer> list: ans){
            System.out.println(list);
        }
    }
    public static List<List<Integer>> subSetDuplicates(int[] arr){
        //For finding the repeating element we sort the array so the repeating elements are next to each other.
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0,end=0;
        for(int i=0;i<arr.length;i++){
            start = 0;
            //Initially if the element is not a duplicate element we add it to the subsets
            if(i>0 && arr[i]==arr[i-1]){
                start = end;
                //If suppose the element is repeated we add the elements to the future subsets and not add it again.
            }
            end = outer.size();
            int n = outer.size();
            for(int j =start;j<n;j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
            //Return the outer list
        }
        return outer;
    }
}
