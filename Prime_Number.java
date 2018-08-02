//package --- 

import static java.lang.System.out; 
import static java.lang.Math.sqrt;
//import java.io.*; 

public class Prime_Number
{// Class Open 

public static void main(String arg[]) 
	 { //main open
 //write code here 

//int a=50;

int a=100;
int count=0;
while(a!=0)
{
boolean b=true;

for(int x=2;x<=sqrt(a);x++)
{
if(a%x==0)
b=false;
}

if(b)
{
count++;
out.println("Prime Number is \t"+ a );
}
a--;
}

out.println("\n there are   "+ count+"  Prime Numbers");
	 } //main close 
  } //Class Close
