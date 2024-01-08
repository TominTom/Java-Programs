import java.util.*;
class evensum
{
public static void main(String args[])
{
int i,s=0; //initialize the variable i for looping,n for storing the limit and s for storing the sum of even numbers
int n=Integer.parseInt(args[0]);
for(i=1;i<=n;i++) //start for loop from 1 upto n
{
if(i%2==0) //using this statement even numbers can be obtained
s+=i;
}
System.out.println("Sum of even numbers from 1 to "+n+" is "+s);
}
}
