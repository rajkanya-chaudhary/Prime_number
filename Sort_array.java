public class Sort_array {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,3,9};
        int temp = 0;
        for(int i = 0;i<=arr.length;i++)
        {
            for(int j = 1 + i;j<=arr.length-1;j++)
            {
                if(arr[i] > arr[j]) { 
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                }
            }
        }
        for(int i = 0;i<=arr.length;i++)
        {
        System.out.print(arr[i] + " ");
        }
    }
}
