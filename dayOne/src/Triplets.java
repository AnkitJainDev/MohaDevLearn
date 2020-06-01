import java.util.Arrays;

public class Triplets {

public static void main (String[] args){
int[] intArray={3,1,7,4,5,9,10};
triplets(intArray,12);
}

public static void triplets (int[] A, int x){

    int lengthString=A.length;
    Arrays.sort(A);
for (int k=0; k<lengthString;k++) System.out.print(A[k]+" "); System.out.println();

    for (int i=0; i<lengthString; i++){

        int startIndex = i+1; int endIndex=lengthString-1; int remain=x-A[i];
        while (startIndex<endIndex){
            int sum=A[startIndex]+A[endIndex];
            if (sum == remain){
                System.out.println("triplet = " +A[i]+" "+A[startIndex]+" "+ A[endIndex] + " ");
                System.out.println();
                return;
            }
            else if (sum<remain) startIndex++;
            else endIndex--;
        }

    }

}

}
