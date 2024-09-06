package AnonymousArray;

public class Example {
    // public int add(int a, int b)
    // {
    //     int res = a+b;
    //     return res;
    // }
    // to create the anonymous array 
    public int add(int arr[])
    {    int res = 0;
        for(int n: arr)
        {
            res=res+n;
        }
        return res;
    }

    public static void main(String[] args) {
        // Example obj = new Example();
        // int res = obj.add(5,6);
        // System.out.println(res);

        // Example obj =new Example();
        // int arr[]= {9,7,3};
        // int res = obj.add(arr);
        // System.out.println(res);
        Example on= new Example();
        int res = on.add(new int[]{51,5,6});
        System.out.println(res);
    }
}
