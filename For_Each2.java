public class For_Each2 {
    public static void main(String[] args) {
        int arr[][]= {
                        {4,5,5},
                        {6,5,3},
                        {4,5,7}
                     };
       // to print this array by using enhanced loop 
       for(int a[]: arr)
       {
            for(int b: a)
            {
                System.out.print(b+ " ");
            }
            System.out.println();
       }
    }
}
