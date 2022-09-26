import java.util.Scanner;
public class Voting
{
public static void main(String args[])
{
int age,vote;
Scanner sc = new Scanner(System.in);
System.out.println("Please enter your age:");
age = sc.nextInt();
if(age>=18)
{
System.out.println("Welcome for voting");
}
else
{
vote=(18-age);
System.out.println("sorry you can vote after :"+vote+ "years");
}
}
}
