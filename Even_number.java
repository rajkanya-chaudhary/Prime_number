public class Even_number {
    public static void main(String[] args) {
        int n = 20;
        int i,sum = 0;
        if(n%2==0)
        {
            for(i = 0;i<=n;i=i+2)
            {
                sum = sum + i;
            }
            System.out.println("Sum of Even Number  = " + sum);
        }
        else
        {
            for(i=1;i<=n;i=i+2)
            {
                sum = sum + i;
            }
            System.out.println("Sum of Odd Number  = " + sum);
        }


    }
}
