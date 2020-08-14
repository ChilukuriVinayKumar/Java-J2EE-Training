import java.util.Scanner;
public class PromoCodeForEcommerce
{

	public static void main(String[] args)
	{
		System.out.println("#########################################");
		System.out.println("           Welcome to Amazon.com ");
		int priceOfItem=600;
		System.out.println(" @AVAILABLE OFFERS PROMOCODE@ ");
		System.out.println("->Press ICICI21 to avail 20% off");
		System.out.println("->Press LOOT1 to avail 60% off");
		System.out.println("->Press PUNJAB9 to avail 30% off");
		System.out.println("->Press AXIS11 to avail 10% off");
		System.out.println("->Press BOI2 to avail 40% off");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the PromoCode ::  ");
		String choice=sc.nextLine();
		sc.close();
		double discount;
		System.out.println("Price of the Item in Cart : "+priceOfItem);
		switch(choice)
		{
			
			case "ICICI21":
				discount = 0.20 * priceOfItem;
				System.out.println("Selected Promo Code ICICI21");
				System.out.println("You will get a discount of \u20b9 "+discount);
				System.out.println("You have to pay only \u20b9 "+(priceOfItem-discount));
				System.out.println("You would have Applied LOOT1 PromoCode to avail high discount");
				break;
			case "LOOT1":
				discount = 0.60 * priceOfItem;
				System.out.println("Selected Promo Code LOOT1");
				System.out.println("You will get a discount of \u20b9 "+discount);
				System.out.println("You have to pay only \u20b9 "+(priceOfItem-discount));
				break;
			case "PUNJAB9":
				discount = 0.30 * priceOfItem;
				System.out.println("Selected Promo Code PUNJAB9");
				System.out.println("You will get a discount of \u20b9 "+discount);
				System.out.println("You have to pay only \u20b9 "+(priceOfItem-discount));
				System.out.println("You would have Applied LOOT1 PromoCode to avail high discount");
				break;
			case "AXIS11":
				discount = 0.10 * priceOfItem;
				System.out.println("Selected Promo Code AXIS11");
				System.out.println("You will get a discount of \u20b9 "+discount);
				System.out.println("You have to pay only \u20b9 "+(priceOfItem-discount));
				System.out.println("You would have Applied LOOT1 PromoCode to avail high discount");
				break;
			case "BOI2":
				discount = 0.20 * priceOfItem;
				System.out.println("Selected Promo Code BOI2");
				System.out.println("You will get a discount of \u20b9 "+discount);
				System.out.println("You have to pay only \u20b9 "+(priceOfItem-discount));
				System.out.println("You would have Applied LOOT1 PromoCode to avail high discount");
				break;
			default:
				System.out.println("INVALID PROMOCODE!!!!");
				System.out.println("There is No such promo code");
				
		}
		System.out.println("#########################################");
		
	}

}
