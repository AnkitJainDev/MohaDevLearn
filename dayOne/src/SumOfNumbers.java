    public class SumOfNumbers {

        public static void main(String[] args) {
            System.out.println("hello world from main");
            functionName3();
            SumOfNumbers.functionName3();
            SumOfNumbers sobject=new SumOfNumbers();
            sobject.functionName1();
            sobject.functionName2();

            sumUptoN(10);

        }

        private void functionName1(){
            System.out.println("hello world from non static with void return ");
                }

        private int functionName2(){
            System.out.println("hello world from private non static with int return");
            return 1;
        }

        private static int functionName3(){
            System.out.println("hello world from static");
            return 1;
        }

        private static int sumUptoN(int n){
            int sum=0;
           /* for(int i=0;i<=n;i++){
                sum=sum+i;
            }
            */
            int i=0;
            while(i<=n){
                sum=sum+i;
                i++;
            }

            do{

            }while(i<=n)
            System.out.println("hello world from static"+sum);
            return sum;
        }


         for(int i = 1; i <= num; ++i)
        {
            complexity : 1 to n 0(n)
        }

        for(int i = 1; i <= num/2; ++i)
        {
            complexity : 0(n/2)
        }

         for(int i = 1; i <= num; i=i+2)
        {
            complexity : 0(log(N))
        }

    }








