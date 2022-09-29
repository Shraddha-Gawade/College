import java.util.Scanner;
public class Factor 
{
   public static void main(String[] args) 
{
      int num;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number : ");
      num = sc.nextInt();
      System.out.print("Number of factors of is " + result(num) );
}
public static int result(int number)
{
int count = 0,i;
      for (i = 1; i <= (int)Math.sqrt(number); i++)
 {
         if (number % i == 0  && i*i!=number) 
{
count+=2;
}
else if(i*i==number)
{
count++;
}
}
return count;
 }
   }
