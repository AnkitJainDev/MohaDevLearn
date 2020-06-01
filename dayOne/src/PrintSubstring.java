public class PrintSubstring {

    public static void main(String arg[]){
String s="ThanksGod";
printsubstring(s);
    }

    public static void printsubstring(String s)
    {
     int stringLength=s.length();
     String Chaine="";

     for (int i=0; i<stringLength;i++)
         for (int j=i+1;j<stringLength+1;j++)
         {
          Chaine=s.substring(i,j);
          System.out.println("Chaine = "+Chaine);
         }

    }

}
