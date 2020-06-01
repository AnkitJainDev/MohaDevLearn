public class ConsecutiveString {


        public static void main (String[] args){
String Chaine ="kjdqdjkqhqjjjqdddqkdhqkkkkkkdj";
consecutivestring(Chaine);
        }

        public static void consecutivestring(String s){
            int lengthString=s.length();
            for (int i=0; i<lengthString-1; i++){
                char c=s.charAt(i); System.out.print(c);
                while (s.charAt(i+1)==c) i++;
            }
            System.out.println(s.charAt(lengthString-1));
        }

}
