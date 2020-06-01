import java.util.Arrays;

public class HighestOccuringChar {

    //Return highest occurring char in the string.
    public static void main(String[] args){
String Chaine = " hqdgqhggqd";
System.out.println( "The Highest Occuring Char is " + highestoccuringchar(Chaine));
    }

    public static char highestoccuringchar(String s){

        int count=0; char charcount=' ';
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        System.out.println(sorted);
        int stringlength=sorted.length();
        for (int i=0; i<stringlength; i++)
        {
            char c= sorted.charAt(i); int countchar=0;
            while (((i+1)<stringlength) && (sorted.charAt(i+1)==c)) {
                countchar++; i++;
            }
            if (countchar>count){
                count=countchar;
                charcount=sorted.charAt(i);
                                }
        }
        return (charcount);

    }

}
