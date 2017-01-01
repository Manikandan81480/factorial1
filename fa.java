import java.util.*;
public class factorial
{
public static void main(String...args)
{
Scanner x=new Scanner(System.in);
int fact=1;
int z=x.nextInt();
for(int i=1;i<=z;i++)
{
fact=fact*i;
}
System.out.println(fact);
}
}
