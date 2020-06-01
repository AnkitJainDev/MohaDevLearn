public class ScanArray {

public static void main(String[] arg){
int[] arrayA={0,1,0,0,1,0,1,1,1,0,1,1,0,1};
    scanarray(arrayA);
    for (int i=0; i<arrayA.length;i++) System.out.print(arrayA[i]);

}

public static void scanarray(int t[]){

    int stringlength=t.length;
    int[] proxy=new int[stringlength];
    int indexzero= 0;
    int indexun=stringlength-1;

    for (int i=0; i<stringlength; i++)
    {
        if (t[i]==0) {
            proxy[indexzero]=t[i]; indexzero++;
        } else
        {
            proxy[indexun]=t[i];
            indexun--;
        }
      //  System.out.print("i= " + i + " "+ t[i] + " "+ proxy[i]+ " ");
    }


for (int i=0; i<stringlength;i++) t[i]=proxy[i];
}

    //You are given with an array containing only 0’s and 1’s. Write a
    //function to sort this array. Find a solution which scans the array only
    //once.


}
