public class PrintNumbers {

    public static void main(String[] args){
    PrintNumbers P=new PrintNumbers();
    P.printall(10);

    }

    private void printall(int n){
        // exercice page 12 Programming Fundamentales 1. pdf

        if (n<=0) throw new IllegalArgumentException("Parameter N should be higher than 0");
        else {
            int i=1; int j=1;
            while (i<=n){
                for (int k=1; k<=j;k++) System.out.print(i++ + " ");
                j++;
                System.out.println();

            }
        }
    }

    private void printAll(int n){
        // exercice page 13 Programming Fundamentales 1. pdf
        if (n<=0) throw new IllegalArgumentException("Parameter N should be higher than 0");
        else for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=n-i;j++) System.out.print(' '); printLine(i);System.out.println();

        }

    }

    private void printLine(int n){

        int count=0;
        for ( count=0;count<n;count++) {
            System.out.print(n+count);
        }
        count=n+count;
        for (int i=1;i<n;i++) System.out.print(count-i-1);


    }

}
