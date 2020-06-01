import jdk.dynalink.support.ChainedCallSite;

import javax.swing.*;

public class MinimumLengthWordString {

    public static void main(String[] args){
//String Chaine = "123456 qkksdkjsdkqjsdkjkqjd kdjhghjmmm JHHHH ksdkdslkqdsqksldk klqdsdkdskqdk";
//System.out.println(minimumlengthwordstring(Chaine));
    }

    public static int minimumlengthwordstring(String s){

        int countcharword=0; int minlength=50000;
        boolean beginWord=false;
        int stringlength=s.length();

        if (stringlength!=0) beginWord=true;

        for (int i=0; i<stringlength;i++)
            if (s.charAt(i)!='\n')
             {

                if ((s.charAt(i)!=' ') && (s.charAt(i)!='\n')) {
                    countcharword++; System.out.print(s.charAt(i));
                }
                if ((s.charAt(i)==' ') && (beginWord==true))
                {
                    if (countcharword<minlength) minlength=countcharword;
                    System.out.println("Minlength= " + minlength);
                    countcharword=0;

                }
            }

        System.out.println("Minimum Length = " + minlength);
        return minlength;

    }

}


