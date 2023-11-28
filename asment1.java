import java.util.Scanner;
class commission
{
double sales;
commission( double sale)
{
this.sales=sale;
}
void cal_commission(double sale)
{
if(sale<0)
{
System.out.println("invalid value :" + sale);
}
else if(sale>0 && sale <500)
{

System.out.println("commission is :" + sale*0.02);
}
else if(sales>500)
{

System.out.println("commission :" + sale* 0.08);
}
}
}
class sales_commission
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the sales: ");
double sales=sc.nextDouble();
commission com=new commission(sales);
com.cal_commission(sales);
}
}