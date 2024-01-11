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
