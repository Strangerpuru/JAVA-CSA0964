import java.util.*;
class exception
{
public static void main(String[] args)
{
try
{
Scanner sc=new Scanner (System.in);
int n,m,result;
System.out.println("enter the 2 number");
n=sc.nextInt();
m=sc.nextInt();
result=n%m;
System.out.println(+result);
}
catch(Exception e)
{
System.out.println(e.getmessage());
}
finally
{
System.out.println("invalid input");
}
}
}

