public class PrintNumbers {

    public static void main(String[] args){
    PrintNumbers P=new PrintNumbers();
    P.printAll(5);

    }

    private void printAll(int n){
        if (n<=0) throw new IllegalArgumentException("Parameter N should be higher than 0");
        else for (int i=1;i<=n;i++)
        {
            for (int j=1;j<n-i;j++) System.out.print(j); printLine(i);System.out.println();

        }

    }

    private void printLine(int n){
        for (int i=0;i<=n;i++) System.out.print(n+i);
        for (int i=1;i<n;i++) System.out.print(n-i);


    }

}
