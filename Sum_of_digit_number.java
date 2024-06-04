public class Sum_of_digit_number {
    public static void main(String[] args) {
        int n = 1223;
        int sum = 0 ;
        while(n != 0)
        {
            sum += n % 10;
            n = n / 10;
        }
        System.out.println("sum of digit number " +sum);
    }
}
