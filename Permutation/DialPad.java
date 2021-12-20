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
            char ch = (char)('a'+i);
            pad(p+ch, up.substring(1));
        }
    }
}
