public class CountCharacters {

    public static void main (String arg[]){

        String s=("la vie est belle il faut \n en profiter jhsdhqhjds qhdqsdqhds \n jqshqshd.$");
        countcharacters(s);
    }

    public static void countcharacters (String s){
    int countc=0;
    int countw=0;
    int countl=1;
    boolean beginWord=false;

int stringlength=s.length();
for (int i=0; i<stringlength;i++)
if (s.charAt(i)=='\n') countl++;
else {
    if (s.charAt(i)!='$')   countc++;
    if ((s.charAt(i)!=' ') && (s.charAt(i)!='\n')) beginWord=true;
    if (((s.charAt(i)==' ') && (beginWord==true))  || ((i=='$') && (beginWord==true)))
    {
        countw++;
        beginWord=false;
    }
}

System.out.println("Number of Characters = " + countc);
System.out.println("Number of Words = " + countw);
System.out.println("Number of Lines = " + countl);

    }

}
