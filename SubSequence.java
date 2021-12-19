public class SubSequence {

    //Subsequence is one of the most common and easy questions for recursion
    /*
    In Subsequence we are given a String and we are supposed to give all possible combinations with the letters of the string.
    In the below code example, the unprocessed String "abc", we are supposed to get an anwer with different combinations of the letters 'a','b','c'
    And hence the output of the questions should be
    "a"
    "b"
    "c"
    "ab"
    "ac"
    "bc"
    */
    public static void main(String args[]){
        subSequence("", "abc");
    }
    public static void subSequence(String p,String up){
        /*
        We tackle this problem by taking two strings, one being the processed string which is initially empty
        And another string called unprocessed which is initially the given string.
        The logic behind this algorithm is to add a character to one set of the recursion tree and to neglet the character in another recursion tree
        */
        if(up.isEmpty()){
            //This is the base condition where the recusion is returned when there is nothing to processes.
            //Meaning unprocessed string becomes empty.
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSequence(p+ch, up.substring(1)); 
        //Here the first character of the unprocessed is added to the processed string and then the recursion is called again with the substring of unprocessed
        subSequence(p, up.substring(1));
        //Here the first character is just ignored and the recursion is called again without the first character of unprocessed.
    }
}
