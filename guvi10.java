import java.util.*;
class guvi10
{
public static void main(String args[])
{
int i,k=0,j;
Scanner s1=new Scanner(System.in);
System.out.println("enter the array size");
int num=s1.nextInt();
int arr[]=new int[num];
for(i=0;i<num;i++)
{
arr[i]=s1.nextInt();
}
for(i=0;i<num;i++)
{
for(j=0;j<num;j++)
{
    if(i==j)
      {
	k++;
	continue;
      }
else
{
if(arr[i]==arr[j])
{
k=0;
break;
}
else
{
k++;
continue;
}
}
}
if(k==num)
{
System.out.println("");
System.out.println(arr[i]);
break;
}
else
{
k=0;
continue;
}
}




}
}
