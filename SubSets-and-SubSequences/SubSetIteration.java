import java.util.ArrayList;
import java.util.List;

public class SubSetIteration {
    //In this program we look to solve the subset problem through iteration of loops
    public static void main(String args[]){
        List<List<Integer>> list = new ArrayList<>();
        int arr[] = {1,2,3};
        list = subset(arr);
        for(List<Integer> inner: list){
            System.out.println(inner);
        }
    }

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        //Here an empty list will be added into the list outer, example [[]]
        for(int num: arr){
            //Getting the individual numbers from the array
            int n= outer.size();
            for(int i=0;i<n;i++){
                //Iterating till the end of the outer list.
                List<Integer> internal = new ArrayList<>(outer.get(i));
                //Here we are getting the list based on the iterator i, this will fetch the empty list initially.
                internal.add(num);
                //We add the num into the list we get from outer
                outer.add(internal);
                //Ading back the internal list into the outer list once thenew num has been added.
            }
        }
        return outer;
    }
}
