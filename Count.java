# Count
import java.io.*;
import java.util.*;
public class Count
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i=0;
int n=sc.nextInt();
while(n>0)
{
n=n/10;
i++;
}
System.out.println(i);
}
}
