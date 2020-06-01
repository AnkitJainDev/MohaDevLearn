public class ScanArrayZeroOneTwo {

    public static void main(String[] args){

        int[] arrayA={0,1,0,0,0,0,0,2,1,2,1,0,1,1,2,2};
        scanarray(arrayA);
        for (int i=0; i<arrayA.length;i++) System.out.print(arrayA[i]);

                                        }

        public static void scanarray(int t[]){

            int stringlength=t.length;
            int[] proxy=new int[stringlength];
            int indexzero= 0;
            int indexun=0;

            int indexdeux=stringlength-1;

            for (int i=0; i<stringlength; i++)
            {
                if (t[i]==0) {
                    shift(proxy,indexun);
                    proxy[indexzero]=t[i];indexun++;
                } else if (t[i]==1){
                     proxy[indexun]=t[i];indexun++;
                                    }
                else

                {
                    proxy[indexdeux]=t[i];
                    indexdeux--;
                }
                //  System.out.print("i= " + i + " "+ t[i] + " "+ proxy[i]+ " ");
            }


            for (int i=0; i<stringlength;i++) t[i]=proxy[i];
        }

        //What if the array has 0’s, 1’s and 2’s. Find another solution which scans
        //the array once.


    public static void shift (int[] t, int index){
        for (int i=index+1;i>0;i--) t[i]=t[i-1];
    }


}
