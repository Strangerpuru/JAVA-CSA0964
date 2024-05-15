import java.util.*;
class palindrome
{
public static void main(String[] args)
{
Scanner sc=new Scanner (System.in);
System.out.println("enter the number");
String n=sc.nextLine();
String a="";
for(int i=n.length()-1;i>=0;i--)
{
a=a+n.charAt(i);
}
if(n.equals(a))
{
System.out.println("palindrome");
}
else
{
System.out.println("not palindrome");
}
}
}

