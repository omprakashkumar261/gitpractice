// anonymous array in java explain it easly

package AnonymousArray;

public class Example1 {
    public int add(int arr[])
    {
        int sum= 0;
        for(int n: arr){
            sum =sum + n;
        }
        return sum; 
    }
    public static void main(String[] args) {
        Example1  temp = new Example1();
        // int arr[]= {8,7,5};
        // int res = temp.add(arr);
        int res = temp.add(new int[]{9,7,6,4});
        System.out.println(res);
    }
}
