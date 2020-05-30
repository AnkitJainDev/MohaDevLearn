import java.util.Scanner;

public class PrintNumbers {

    public static void main(String[] args){
    PrintNumbers P=new PrintNumbers();
   // calculInterest(1_000_000,6,2);
    //quadratic (5,12,4);
    //quadratic(2,4,2);
        // System.out.println(calculator());
       // sum_even_odd_digits(1279);
        firstTwenty();
    }


    // Assignement 2. Exercise 1 :Interest Computation:

    public static void calculInterest(int principal, float interest, int time ){

        double i = ((principal * interest/100) * time);
        double  totalAmount=i+principal;

        System.out.println("Interest= " + i + " totalAmount " + totalAmount);

    }


    //Assignment 2. Exercise 2 :calculator Write a program to input name and marks of three tests of any student and calculate
    //and print the name and average of best two test marks

    public static void student(){

        int grade;
        Scanner sc=new Scanner(System.in);
        System.out.print("kindly input the Student Name   ");
        String name = sc.nextLine();
        System.out.print("kindly input mark1   ");
        int mark1=sc.nextInt();
        System.out.print("kindly input mark2   ");
        int mark2=sc.nextInt();

        if (mark2>= mark1) {
            grade=mark1;
            mark1=mark2;
            mark2=grade;
        }

        System.out.print("kindly input mark3   ");

        int mark3=sc.nextInt();

        if (mark3>= mark1) {
            grade=mark3;
            mark3=mark1;
            mark1=grade;
        }

        if (mark3>= mark2) {
            grade=mark3;
            mark3=mark2;
            mark2=grade;
        }

        System.out.println("Name of Student is  " + name);
        System.out.println("Average of grades = " + (mark1+mark2)/2);
    }

    // Assignment 2. Exercise 3 :calculator

    public static int calculator(){

        Scanner scan=new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        char c = scan.next().charAt(0);

        switch (c) {
            case '+' :
                return (a+b);

            case '-' :
                return (a-b);

            case '*' :
                return (a*b);

            case '/' :
                return (a/b);


        }
return (-1);
    }

    // Assignement 2. Exercise 4

    public static void typeChar(){

        Scanner scan=new Scanner(System.in);
        char c = scan.next().charAt(0);
        if (Character.isUpperCase(c)) System.out.println("the Character is UpperCase");
        else if (Character.isLowerCase(c)) System.out.println("the Character is lowerCase");
        else System.out.println("Incorrect Character");


    }


    // Assignement 2. Exercise 5


    public static double totalSalary(int basic, char grade){
        double t_sal;
        int allow;

        if (grade=='A') allow=1700;
        else if (grade=='B') allow=1500;
        else allow = 1300;

        t_sal=basic*(1+0.7-0.11) + allow;
        return (t_sal);
    }

    public static void quadratic(int a,int b,int c){

        // Assignement 2. Exercise 6

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

    public static int sum_product(){

        // Assignement 2a. Exercise 1 Write a program that asks the user for a number n and gives him the possibility to
        //choose between computing the sum and computing the product of 1,...,n.

        int sum=0;
        int product=1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Kindly input N ");
        int n=scan.nextInt();
        System.out.println("Kindly choose between Sum 1 and Product 2 ");
        if (scan.nextInt()==1){
            for (int i=0;i<=n;i++) sum+=i; return sum;
        }
        else {
            if (n==0) return (0); else for (int i=1;i<=n;i++) product*=i; return product;
        }
    }

    // Exercice 2 Assignment 2-a, Write a program to input a number and print the sum of all it’s even digits and sum of
    //all its odd digits; separately.

    public static void sum_even_odd_digits(int n){
        int even_digits=0;
        int odd_digits=0;
        int modus=0;
if (n<10) {
    if (even(n)) even_digits++; else odd_digits++;
}
    else {
        while (n!=0){

            modus=n%10;
        if (even(modus)) even_digits++; else odd_digits++;
        n/=10;
    }
}
    System.out.println("even_digits= " + even_digits);
    System.out.println("odd_digits= " + odd_digits);
}

public static boolean even (int n){

if ((n==0)||(n==2)||(n==4)||(n==6)||(n==8)) return true; else return false;

}

public static double xPowern(double x, double n){
// Exercise 3. Assignment 2-a : Write a program to find x n . Take x and n from the user.
        return(Math.pow(x,n));

}

public static double reverse (int x){
        //Exercise 4. Assignment 2-a Write a program to generate the reverse of a given number.
        return (1.0/x);

}

public static void firstTwenty(){
 for (int i=0; i<=20; i++) if (((3*i+2) % 4)==0) System.out.println(" " + (3*i+2) + " ");



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
