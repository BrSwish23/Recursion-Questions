//https://youtu.be/gdifkIwCJyg - Link to the recursion video 
import java.util.ArrayList;
import java.util.List;

public class SubSets {
    public static void main(String args[]){
        List<String> ans = subSequence("", "abc");
        System.out.println(ans);
    }
    public static List<String> subSequence(String p,String up){
        /*
        Question is similar to SubSequence only difference is to add the answers and return it in a list.
        For this we create a list at each stage of the recursion tree.
        list.addAll(list2) adds all the elements of list2 to list 1, we then return the list to the previous recursion call.
        */
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        List<String> left = subSequence(p+ch, up.substring(1)); 
        //Here the first character of the unprocessed is added to the processed string and then the recursion is called again with the substring of unprocessed
        //Note that the list is created in the body of the funtion and is not passed through the arguments
        List<String> right = subSequence(p, up.substring(1));
        //Here the first character is just ignored and the recursion is called again without the first character of unprocessed.

        left.addAll(right);
        return left;
    }
}
