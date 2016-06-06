import java.util.*;
class Arr
{
public static void main(String[] args)
{
int a[]=new int[5];
int b[]={1,2,3,4,5};
a[0]=1;
Scanner s=new Scanner(System.in);
System.out.println("enter 4 numbers");
for(int i=1;i<5;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<5;i++)
{
System.out.println(a[i]);
}
for(int i=0;i<=5;i++)
{
System.out.println(b[i]);
}
}
}