abstract class Bank
{
  abstract void getBalance();
}

class BankA extends Bank
{
	int a=100;
	 void getBalance()
	 {
	System.out.println("Balance in BankA is  "+a);
	 }
}
class BankB extends Bank
{
	int b=150;
	void getBalance()
	{
	System.out.println("Balance in BankaB is  "+b);
	}
}
class BankC extends Bank 
{
	int c=150;
	void getBalance()
	{
	System.out.println("Balane in BankC is  "+c);
	}
}
class A
{
	public static void main(String arg[])
	{
		BankA a1=new BankA();
		a1.getBalance();
		BankB b1=new BankB();
		b1.getBalance();
		BankC c1=new BankC();
		c1.getBalance();
	}
}