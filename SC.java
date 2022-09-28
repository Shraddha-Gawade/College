import java.util.*;
class SC
{
public static void main(String[] args){
Scanner sc=new Scanner (System.in);
System.out.println("enter the string");
String s=sc.nextLine();
List<Character> str=new ArrayList<>();
int a=0;
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)>='A'&&s.charAt(i)<='Z'||s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='0'&&s.charAt(i)<='9'||s.charAt(i)==' ')
{
continue;
}
else
{
str.add(s.charAt(i));
a++;
}
}
System.out.println(a);
System.out.println(str);
}
}