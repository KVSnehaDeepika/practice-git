import java.util.Scanner;
interface I1
{
public int Sum(int a,int b);
public int Sub(int x,int y);
}
class Calci implements I1
{
public int Sum(int a,int b)
{
return a+b;
}
public int Sub(int x,int y)
{
return a-b;
}

class CalciDriver
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
Calci c=new Calci();
System.out.println("Enter 1st number");
int n1=s.nextInt();
System.out.println("Enter 2nd number");
int n2=s.nextInt();
System.out.println(n1+"+"+n2+c.Sum(n1,n2));
System.out.println(n1+"-"+n2+c.Sub(n1,n2));
}
}

