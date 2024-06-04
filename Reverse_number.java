public class Reverse_number {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int first = 0;
        int last = arr.length-1;
        for(int i = 0;i<=arr.length-1;i++)
        {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }
        for(int i = 0;i<=arr.length-1;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
