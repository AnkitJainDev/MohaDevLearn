public class PrintNumbers {

    public static void main(String[] args){
    PrintNumbers P=new PrintNumbers();
   // calculInterest(1_000_000,6,2);
    quadratic (5,12,4);
    quadratic(2,4,2);
    }

    // Assignement 2. Exercise 7 :Write the programs to print the following patterns:

    public static void printNumbers(int n){

        if (n<=0) throw new IllegalArgumentException("Parameter N should be higher than 0");
        else for ( int i=1; i<=n;i++){
            for (int k=1;k<=i;k++) System.out.print('1'); System.out.println();
                                    }
        System.out.println("Pattern b");

            if (n==1) System.out.println('1');
            else if (n==2) System.out.println("11");
            else {
                System.out.println('1'); System.out.println("11");

                for (int j=3;j<=n;j++){
                    int numberZeros=j-2;
                    System.out.print('1');
                    for (int l=1;l<=numberZeros;l++) System.out.print('0');
                    System.out.println('1');
                }
            }
        System.out.println("pattern d");


        if (n==1) System.out.println('1');
        else if (n==2) System.out.println("11");
        else {
            System.out.println('1'); System.out.println("11");

            for (int j=3;j<=n;j++){
                int numberZeros=j-2;
                System.out.print(j-1);
                for (int l=1;l<=numberZeros;l++) System.out.print('0');
                System.out.println(j-1);
            }
        }
        System.out.println("pattern e");

        if (n==1) System.out.println('1');
        else if (n==2) System.out.println("11");
        else {
            System.out.println('1'); System.out.println("11");

            for (int j=3;j<=n;j++){
                int numberTwo=j-2;
                System.out.print('1');
                for (int l=1;l<=numberTwo;l++) System.out.print('2');
                System.out.println('1');
            }
        }
        System.out.println("pattern f");
    for (int i=n;i>=1;i--){
        for (int k=1;k<=n-i+1;k++) System.out.print(i); System.out.println();
    }
        System.out.println("pattern c I do not know ?????");
    }


    // Assignement 2. Exercise 1 :Write the programs to print the following patterns:

    public static void calculInterest(int principal, float interest, int time ){

        double i = ((principal * interest/100) * time);
        double  totalAmount=i+principal;

        System.out.println("Interest= " + i + " totalAmount " + totalAmount);

    }

    public static void quadratic(int a,int b,int c){
        double discriminant=Math.pow(b,2)-4*a*c;
        double x1;
        double x2;

if (discriminant<0) System.out.print("There are no real roots");
else if (discriminant==0) {
        x1= ((double)-b)/(2*a);
        System.out.println("there one real root = " + x1);

                            }
        else {
            System.out.println("discriminant = "+ discriminant);
            x1=(-b+ Math.sqrt(discriminant))/(2*a);
            x2=(-b- Math.sqrt(discriminant))/(2*a);
            System.out.println("there are two real roots = " + x1+"  and  "+ x2);
        }

    }
    public static void circularJail(){
        // exercice page 5 Programming Fundamentales 1. pdf

        boolean[] cells=new boolean[101];
        for (int i=1; i<101;i++) cells[i]=true;

        for (int i=1; i<100;i=i+2) cells[i+1]=false;

        for (int j=3;j<101;j=j+1) {
            int k;
            for (k = j; k < 101; k = k + j) if (cells[k] == true) cells[k] = false; else cells[k] = true;
        }

        for (int i=1; i<101;i++) if (cells[i]==true) System.out.print("cell Number "+i+"  ");
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



    //????? Infinite Quarter Sequence
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
