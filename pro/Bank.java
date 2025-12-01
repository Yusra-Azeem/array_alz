class Bank
{
    String name;
    String accno;
    double p;
    Bank(String n,String acc,double pr)
    {
        name =n;
        accno=acc;
        p=pr;
    }
    void display()
    {
        System.out.println("Name "+name);
        System.out.println("Account no "+accno);
        System.out.println("Principle "+p);
    }
}
   