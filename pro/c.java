class c
{
    public static void main(String args[])
    {
        int arr[]={10,20,30,40};
        for(int x=0;x<arr.length;x++)
        {
            System.out.println(arr[x]+" ");
        }
        System.out.println();
        Number.change(arr);
        for(int x=0;x<arr.length;x++)
        {
            System.out.println(arr[x]+" ");
        }
        System.out.println();
    }
}
        