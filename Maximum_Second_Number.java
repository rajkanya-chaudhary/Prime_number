public class Maximum_Second_Number {
    public static void main(String[] args) {
        int arr[] = {12,44,77,11,88,22};
        int Max = arr[0];
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] > Max)
            {
                Max = arr[i];
            }
        }
        System.out.println("Maximum Number print in array = " + Max);
    }
}

