import java.util.ArrayList;

public class StringRecursion {
    public static void main(String[] args) {
        skippinAlphabets("", "bccaddah");
        skippinwords("","bccadaapplehus");
        subsequence("", "abc");
        System.out.println(subsequenceArray("", "abc"));
        System.out.println("ASCII VALUE");
        subsequenceAscii("", "abc");
       // stringlength(0,"Hello");
        
        System.out.println(stringLengthMethod("hello World")); 
    }

    static void skippinAlphabets(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            skippinAlphabets(p, up.substring(1));
            return;
        } else {
            skippinAlphabets(p + ch, up.substring(1));
        }
    }

    static void skippinwords(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if ( up.startsWith("apple")) {
            skippinwords(p, up.substring(5));
            return;
        } else {
            skippinwords(p + ch, up.substring(1));
        }

}
static void subsequence(String p, String up){
    if (up.isEmpty()){
        System.out.println(p);
        return;
    }
    char ch= up.charAt(0);
    subsequence(p+ch, up.substring(1));
    subsequence(p, up.substring(1));
}
static ArrayList<String> subsequenceArray(String p, String up){
    if (up.isEmpty()){
        ArrayList<String> list=new ArrayList<>();
        list.add(p);
        return list;
    }
    char ch= up.charAt(0);
    ArrayList<String> left= subsequenceArray(p+ch, up.substring(1));
    ArrayList<String> right= subsequenceArray(p, up.substring(1));
    left.addAll(right);
    return left;
}
static void subsequenceAscii(String p, String up){
    if (up.isEmpty()){
        System.out.println(p);
        return;
    }
    char ch= up.charAt(0);
    subsequenceAscii(p+ch, up.substring(1));
    subsequenceAscii(p, up.substring(1));
    subsequenceAscii(p+(ch+0), up.substring(1));
}
    /*static void stringlength(int n,String s){
        n=0;
        if(s.isEmpty()){
            return;
        }
        stringlength(s.length(),s);
    }*/
    static int stringLengthMethod(String s){
        if(s.equals("")){
            return 0;
        }
        return 1 + stringLengthMethod(s.substring(1));
    }
}