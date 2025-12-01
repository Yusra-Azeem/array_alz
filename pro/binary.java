class binary
{
    public static void tobinary(int n)
    {
        if(n>1)
        {
           tobinary(n/2);
        }
        System.out.print(n%2);
    }
}
    