package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        int[] initial= {5};
        recusrsiveStarPrint(1,9,7);



    }

        public static void printFibonacci(int n){

            int i=0;
            if (n<=0) throw new IllegalArgumentException("the parameter n should be higher than 0 ");
            else while (fibonacci(i)<n) System.out.print(fibonacci(i++) + " ");
            System.out.println();

        }

        public static boolean isPrime(int n){
            if (n<=1) throw new IllegalArgumentException("the parameter n should be higher than 1 ");
            else
                for (int k=2; k<n; k++) if (n%k==0) return false;
        return true;

        }

        public static void printPrime(){

            Scanner myInput = new Scanner( System.in );
            System.out.print( "Enter n: " );
            int n = myInput.nextInt();

            if (n<=1) throw new IllegalArgumentException("the parameter n should be higher than 1 ");
            else for (int i=2; i<=n;i++)
                if (isPrime((i))) System.out.print(i+" " );
                System.out.println();
        }


        public static int fibonacci(int n){

        if (n<0) throw new IllegalArgumentException("the parameter n should be positive ");
        else
            if ((n==0) || (n==1)) return (n);
            else return (fibonacci(n-1)+ fibonacci(n-2));
            }

        public static int GCD(){


        Scanner myInput = new Scanner( System.in );
        System.out.print( "Enter first integer: " );
        int a = myInput.nextInt();
        System.out.print( "Enter second integer: " );
        int b = myInput.nextInt();

        int theresult=1;

        int min=a; if (b<a) min=b;

        for (int i=2; i<min; i++)
        if ((b%i==0) && (a%i==0)) theresult = i;

        return theresult;
        }

public static int[] pass(int[] initialArray){
     int []outputArray=new int[initialArray.length/2];
     for (int i=0,j=0;i<initialArray.length-1;i=i+2,j++) outputArray[j]=initialArray[i+1];
     return outputArray;
}

public static int multiplePass(int[] initialArray){
    int []outputArray=initialArray;

    if (initialArray.length==0)  return (0);
    else if (initialArray.length==1) return initialArray[0];
        else for (int i=1; i<log2(initialArray.length);i++) {
            outputArray=pass(outputArray);
            System.out.println(Arrays.toString(outputArray));
                                                        }
            return(outputArray[0]);

}

    public static int log2(int N)
{

    // calculate log2 N indirectly
    // using log() method
    int result = (int)(Math.log(N) / Math.log(2));

    return result;
}


public static int titanic (int n){
 int[] initialList=new int[n];
    for (int i=0;i<n;i++) initialList[i]=i+1;
 return multiplePass(initialList);
}

public static int coordinate(int x, int y){
int result=-1;
if ((x>=0) && (x<=100000) && (y>=0) && (y<=100000))
{
    if (x==y){
        if (x==0) result=0;
        else if (x==1) result=1;
        else {
            if (x%2==0) result=2*x; else result=2*x-1;
            }
    }
    else if (x==y+2){
        if (x%2==0) result=x+y; else result=x+y-1;

    }
}
return result;
}

public static void recusrsiveStarPrint(int countStar, int countIndent, int n){
    if (countStar==n) {
                    printIndent(countIndent);
                    printStar(n);
                    }
    else {
            printIndent(countIndent);
            printStar(countStar);
            recusrsiveStarPrint(countStar+2,countIndent-1,n);
            printIndent(countIndent);
            printStar(countStar);

    }

    }



public static void starPrint(int n){
if (n<=0) throw new IllegalArgumentException(" n should be higher than 0 ");
else {
    for (int i=1,j=n; i<=n; i=i+2,j=j-1) {
        printIndent(j);
        printStar(i);
    }

        for (int i=n-2,j=n-2 ;i>=1; i=i-2,j=j+1){
            printIndent(j);
            printStar(i);

    }
}
}

public static void printIndent(int n){
        for (int i=1; i<=n; i++) System.out.print(" ");

}
public static void printStar(int n){

        for(int j=1; j<=n; j++) System.out.print("*");
        System.out.println();

}
    public static String starString(int n){

        if (n<0)  throw new IllegalArgumentException("Value Should Be higher than 0 ");
        else if (n==0) return("*");
        else return (starString(n-1)+starString(n-1));
                                }



public static void writeNums(int n){
    if (n<=0)  throw new IllegalArgumentException("Value Should Be higher than 0 ");
    else if (n==1) System.out.print("1");
    else {
            writeNums(n-1);
            System.out.print(", "+ n);
        }
}

public static void writeSequence(int n){
    //BJP5 Exercise 12.3: writeSequence (Recursive exercises)

    if (n<0) throw new IllegalArgumentException(" Value should be higher than 0");
    else
    if (n==1) System.out.print(n);
    else if(n==2) System.out.print (n+n);
    else {
        if (n/2==0) System.out.print(n/2 + " "); else System.out.print(n/2+1 + " ");
        writeSequence(n-2);
        if (n/2==0) System.out.print(n/2 + " "); else System.out.print(n/2+1 + " ");
        }


                                    }

    public static void writeSquares(int n){

        // BJP5 Exercise 12.6: writeSquares

        if (n<=0) throw new IllegalArgumentException("Value should be higher than zero");
        else
        {
            if (n==1) System.out.print(1);
            else if (n%2==0) {
                writeSquares(n-1);
                System.out.print(", " + (int)Math.pow(n,2));
            }
            else {
                System.out.print((int)Math.pow(n,2) + ", ");
                writeSquares(n-1);
            }
        }
    }






    public static void writeChars(int n){
        //BJP5 Exercise 12.7
        if (n<=0) throw new IllegalArgumentException("Value should be higher than zero");
       else{
           if (n==1) System.out.print('*');
           else if (n==2) System.out.print("**");
           else {
                    System.out.print('<');
                    writeChars(n-2);
                    System.out.print('>');
                }
        }

    }

    public static long multiplyEvens(int n){
        // BJP5 Exercise 12.8: multiplyEvens

        if (n<=0) throw new IllegalArgumentException("The value should be higher than zero");
        else{

            if (n==1) return (2);
            else return 2*n*multiplyEvens(n-1);
        }

    }

    public static boolean isReverse(String s1, String s2) {
// BJP5 Exercise 12.12: isReverse
        if (s1.length()!=s2.length()) return false;
        else{
            if ((s1.isEmpty()) && (s2.isEmpty())) return true;
            if (s1.length()==1) {
                System.out.println("Je suis l&" + s1 + s2);

                return (s1.charAt(0)==s2.charAt(0));
            }
            else{
            String s1Temp=s1.toUpperCase();
            String s2Temp=s2.toUpperCase();
            System.out.println(s1Temp.charAt(0));
                System.out.println(s2Temp.charAt(s2Temp.length()-1));
            if ((s1Temp.charAt(0))!=(s2Temp.charAt(s2Temp.length()-1)))
                return false;
                else return isReverse(s1Temp.substring(1,s1Temp.length()),s2Temp.substring(0,s2Temp.length()-1));
            }

        }
    }



    public static int indexOf(String s1, String s2){
        if ((s1.isEmpty()) && (s2.isEmpty())) return 0;
        else if ((s1.isEmpty())||(s2.isEmpty())) return -1;
        else {
            int lengths2=s2.length();
            String s1Temp=s1.substring(1,s1.length()-1);
            if (s1.substring(0,lengths2-1).equals(s2)) return 0;
            else return 1+indexOf(s1Temp,s2);
        }

    }


    public static String dedup(String s1)
    {
        if (s1.length()==1) return (s1);
        else if (s1.charAt(0)==s1.charAt(1))
            return (dedup(s1.substring(1)));
        else return (s1.charAt(0)+dedup(s1.substring(1)));

    }



    public static String vowelsToEnd(String s1){
        if (s1.length()==1) return(s1);
        if ((s1.charAt(0)=='a')||(s1.charAt(0)=='e')||(s1.charAt(0)=='i')||(s1.charAt(0)=='o')||(s1.charAt(0)=='u'))
            return (vowelsToEnd(s1.substring(1))+ s1.charAt(0));
            else return(s1.charAt(0)+vowelsToEnd(s1.substring(1)));
    }

//    public static int evenDigit(int a){
// BJP5 Exercise 12.16: evenDigits

        public static int digiMatch(int a, int b){
//BJP5 Exercise 12.10: digitMatch
if (a<0||b<0) throw new IllegalArgumentException("Both parameters should be positive");
else {
    String s1=Integer.toString(a);
    String s2=Integer.toString(b);
    if (s1.length()==0 || s2.length()==0) return (0);
    else
    {
        if ((s1.length()==1)||(s2.length()==1))
        {
            char car1=s1.charAt((s1.length())-1);
            char car2=s2.charAt((s2.length())-1);

            if (car1== car2) return (1);
            else return(0);
        }
     else{
            int c=Integer.parseInt(s1.substring(0,s1.length()-1));
            int d=Integer.parseInt(s2.substring(0,s2.length()-1));
            if (s1.charAt(s1.length()-1)==s2.charAt(s2.length()-1))
                return (1+digiMatch(c,d));

            else return(digiMatch(c,d));

        }

    }

    }

}







}

