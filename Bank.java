class Bank1
{
float getRateOfInterest(){return 0;}
}
class SBI extends Bank1{
float getRateOfInterest(){return 8.4f;}
}
class ICICI extends Bank1{
float getRateOfInterest(){return 7.3f;}
}
class AXIS extends Bank1{
float getRateOfInterest(){return 9.7f;}
}
class Bank{
public static void main(String args[]){
Bank1 b1;
b1=new SBI();
System.out.println("SBI Rate of Interest: "+b1.getRateOfInterest());
b1=new ICICI();
System.out.println("ICICI Rate of Interest: "+b1.getRateOfInterest());
b1=new AXIS();
System.out.println("AXIS Rate of Interest: "+b1.getRateOfInterest());
}
}