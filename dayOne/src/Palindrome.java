public class Palindrome {

    public static void main(String arg[]){

    }

    public static boolean palindrome(String s){

        int stringLength=s.length();
        if (stringLength!=0)
        for (int i=0,j=stringLength-1;i<=stringLength/2;i++,j--) if (s.charAt(i)!=s.charAt(j))
            return false;

        return true;

    }

}
