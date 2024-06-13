public class Largest_number {
    public static void main(String[] args) {
        int arr[] = {20,30,40,50,10,};
        int largest = arr[0];
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] < largest)
            {
                largest = arr[i];
            }
        }
        System.out.println("largest number = " +largest);
    }
}
