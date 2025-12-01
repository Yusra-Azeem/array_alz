import java.util.*;
class Spiral_mat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of matrix");
        int n=sc.nextInt();
        int ar[][]=new int[n][n];
        int i=1; int r=0,c=-1,m=1;
        for(int x=0;x<ar.length;x++)
        {
            int chk=1;
            for(int y=0;y<ar.length-x;y++)
            {
                switch(m)
                {
                    case 1:
                    c++;break;

                    case 2:
                    r++;break;

                    case 3:
                    c--;break;

                    case 4:
                    r--;break;
                }
                ar[r][c]=i++;
                if(y==ar.length-1-x&&chk%2!=0&&x!=0)
                {
                    y=-1;
                }
                if(y==ar.length-1-x||y==-1)
                {
                    m++;
                }
                if(m==5)
                {
                    m=1;
                }
                if(y==-1 && x!=0)
                {
                    chk++;
                }
            }          
        }
        System.out.println("spiral matrix");
        for(int x=0;x<n;x++)
        {
            for(int y=0;y<n;y++)
            {
                System.out.print(ar[x][y]+"\t"); 
            }
            System.out.println();
        }
    }
}