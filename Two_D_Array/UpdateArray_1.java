package Two_D_Array;

public class UpdateArray_1 {
    public static void main(String[] args) {
        int a[][]={
                    {5,2},
                    {8,6},
                    {6,7}
                  };
        
        for(int i=0; i<=2; i++)
        {
            for(int j=0; j<=1; j++)
            {
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
    }
}
