public class DialPad {
    public static void main(String args[]){
        pad("", "12");
    }
    public static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int d = up.charAt(0) - '0';
        for(int i=(d-1)*3;i<d*3;i++){
            //As seen in the below dialpad, each dialpad starts with multiples of 3 and so d starts from inclusive (d-1)*3 to exclusive d*3
            //For example, the number 1 gives "a"||"b"||"c" and a starts from 0 b is 1 and c is 2. As a result for a digit d, d is (d-1)*3 to d*3
            char ch = (char)('a'+i);
            pad(p+ch, up.substring(1));
        }
    }
}
/*
Below is an example of a dial pad
    1       2       3
   abc     def     ghi
    4       5       6
   jkl     mno     pqr
    7       8       9
   stu     vwx      yz             
*/