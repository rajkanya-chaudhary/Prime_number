public class Maximum_number {
    public static void main(String[] args) {
        int a[] = {23,56,89,12,10,22};
        int max = a[0];
        for(int i = 1;i<a.length-1;i++)
        {
            if(a[i] > max)
            {
                max = a[i];
            }
        }
        System.out.println("Maximum number = " + max);
    }
}
