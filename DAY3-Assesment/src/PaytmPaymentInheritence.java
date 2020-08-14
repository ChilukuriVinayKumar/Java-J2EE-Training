class Payment
{
	int accountBalance;
	Payment(int accountBalance)
	{
		this.accountBalance=accountBalance;
	}
	
	void makePayment(int amount)
	{
		if(accountBalance>amount)
		{
			accountBalance-=amount;
		}
		else
		{
			System.out.println("Can't process your payment request");
		}
	}
}

class BhimUpi extends Payment
{
	String upiId;
	int passCode;
	
	
	BhimUpi(String upiId,int accountBalance,int passCode)
	{
		super(accountBalance);
		this.upiId=upiId;
		this.passCode=passCode;
	}
	
	void showDetailsBhimUpi()
	{
		System.out.println("************************************************************");
		System.out.println("                       UPI ID    : "+upiId);
		System.out.println("                     PASSCODE    : "+passCode);
		System.out.println("                 Account Balance : "+accountBalance);
		System.out.println("************************************************************");
	}
}

class PaytmWallet extends Payment
{
	String mobileNumber;
	String password;
	
	PaytmWallet(String mobileNumber,String password,int accountBalance)
	{
		super(accountBalance);
		this.mobileNumber=mobileNumber;
		this.password=password;
	}
	
	void showDetailsPaytmWallet()
	{
		System.out.println("************************************************************");
		System.out.println("                       MobileNumber    : "+mobileNumber);
		System.out.println("                     	password    : "+password);
		System.out.println("                 Account Balance : "+accountBalance);
		System.out.println("************************************************************");
	}
} 
public class PaytmPaymentInheritence 
{
	public static void main(String[] args) 
	{
		System.out.println("PAY BY USING BHIM UPI");
		BhimUpi bu1=new BhimUpi("9834406213@upi", 50000, 1234);
		System.out.println("Before Transaction");
		bu1.showDetailsBhimUpi();
		bu1.makePayment(700);
		System.out.println("After Transaction");
		bu1.showDetailsBhimUpi();
		System.out.println("PAY BY USING PAYTM WALLET");
		PaytmWallet pw1=new PaytmWallet("9834406213","313222",2000);
		System.out.println("Before Transaction");
		pw1.showDetailsPaytmWallet();
		pw1.makePayment(700);
		System.out.println("After Transaction");
		pw1.showDetailsPaytmWallet();
	}

}
