public class BasicCompression {

    public static void main(String args[]){
//String Chaine = "aaabbaads";
String Chaine="abcckkkkke";
        basiccompression(Chaine);
    }

    public static void basiccompression(String s){

        //Write code to do basic string compression. e.g. Given aaabbccds print out
        //a3b2c2ds.

    int stringlength=s.length();
    if (stringlength>0){
        //System.out.print(s.charAt(0));
        for (int i=0; i<stringlength; i++){
            char c=s.charAt(i);
            System.out.print(c);
            while (((i+1)<stringlength) && ((s.charAt(i+1))==c))  i++;

                                        }

                        }

                                                        }


}
