public class Missing_number {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        int n = 5;
        int sum = 0;
        for(int i = 1;i<=arr.length;i++)
        {
            sum = sum + arr[i];
        }
        int sum1 = 0;
        for(int j = 1;j<=5;j++)
        {
            sum1 = sum1 + j;
        }
        System.out.println("Missing number " + (sum1 - sum));
    }
}
