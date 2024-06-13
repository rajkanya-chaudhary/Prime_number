
    public class Target_number {
        public static void main(String[] args) {
            int arr[] = {2,3,5,7,5,1};
            int taget = 9;
            for(int i = 0;i<arr.length;i++)
            {
                for(int j = i+1;j<arr.length-1;j++)
                {
                    if(arr[i]+arr[j] == taget)
                    {
                        System.out.print("target number is = " + i + "," +j);
                    }
                }
            }
        } 
    
        
    }