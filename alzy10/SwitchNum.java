import java.util.Scanner;
class SwitchNum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        int n=sc.nextInt();
        switch (n)
        {
            case 1:
            System.out.println("one");break;
            case 2:
            System.out.println("Two");break;
            case 3:
            System.out.println("Three");break;
            case 4:
            System.out.println("Four");break;
            case 5:
            System.out.println("Five");break;
            default:
            System.out.println("Invalid");
        }
    }
}