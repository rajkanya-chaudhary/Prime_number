public class Simple_program {
    public static void main(String[] args) {
        System.out.println("print prime number");
        int n = 3;
        if(n==2)
        {
            System.out.println("Prime Number");
        }
        else
        {
            boolean  isPrime = true;
            for(int i = 2; i<= n-1;i++)
            {
                if(n%i==0)
                {
                    isPrime = false;
                }
            } 
            if(isPrime == true)
            {
                System.out.println("Prime number");
            }
            else
            {
                System.out.println("Not Prime Number");
            }
        }
    }
}
