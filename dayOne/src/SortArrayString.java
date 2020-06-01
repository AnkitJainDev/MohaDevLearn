import java.util.PrimitiveIterator;

public class SortArrayString {
    //Sort an array of strings based on length

public static void main(String[] args){

    String[] T={"qqdghqhds","qkdkqkdkqjds","gdgdg", "abababababab","lmlmmlmlm"};
    sortarraystring(T);
    System.out.println("Length = " + T.length);
    for (int i=0; i<T.length; i++) System.out.print(T[i]+"    ");
}

public static void sortarraystring(String[] s){

    int stringlength=s.length; int result=0;
    String[] proxy=new String[s.length];
    int count=s.length;
    int index=0;
    while (count>0){

            result= minimum(s);
            proxy[index]=s[result];
            s[result]="";

            index++;
            count--;
                    }

 for (int i=0; i<stringlength; i++ ) s[i]=proxy[i];


    }



public static int minimum(String[] s){

    int stringlength=s.length;
    int result=0;
    while (s[result].length()==0) result++;
    for (int i=1; i<stringlength; i++)

    {
        if (s[i].length()!=0)
        if (s[i].length()<s[result].length())
            result=i;

    }

    return result;

}

}

