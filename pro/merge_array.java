import java.util.Scanner;
class merge_array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of arrray 1");
        int n=sc.nextInt();
        System.out.println("Enter size of array 2");
        int m=sc.nextInt();
        int ar1[]=new int[n];
        int ar2[]=new int[m];
        int ar3[]=new int[m+n];
        for(int x=0;x<ar1.length;x++)
        {
            System.out.println("Enter value at index in array1 "+x);
            ar1[x]=sc.nextInt();
            if( x>0 && ar1[x]<=ar1[x-1])
            {
                System.out.println("Plz enter again a number greater than first one");
                x--;
            }

        }
        for(int x=0;x<ar2.length;x++)
        {
            System.out.println("Enter value at index in array2 "+x);
            ar2[x]=sc.nextInt();
            if( x>0 && ar2[x]<=ar2[x-1])
            {
                System.out.println("Plz enter again a number greater than first one");
                x--;
            }
        }
        int a=0,b=0,c=0;
        while(a<ar1.length&&b<ar2.length)
        {
            if(ar1[a]<=ar2[b])
            {
                ar3[c]=ar1[a];
                c++;a++;
            }
            else
            {
                ar3[c]=ar2[b];
                c++;b++;
            }
        }
        while(a<ar1.length)
        {
            ar3[c]=ar1[a];
            c++;a++;
        }
        while(b<ar2.length)
        {
            ar3[c]=ar2[b];
            c++;b++;
        }
        System.out.println("arr1");
        for(int x=0;x<ar1.length;x++)
        {
            System.out.print(ar1[x]+"\t\t");
        }
        System.out.println("\narr2");
        for(int x=0;x<ar2.length;x++)
        {
            System.out.print(ar2[x]+"\t\t");
        }
        System.out.println("\narr3");
        for(int x=0;x<ar3.length;x++)
        {
            System.out.print(ar3[x]+"\t\t");
        }
    }
}
 