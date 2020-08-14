import java.util.Scanner;
public class OlaRideBooking 
{

	public static void main(String[] args) 
	{
		int baseFare=20,distanceTravelled=10,amountToPay=0,farePerKm=10;
		System.out.println("#########################################");
		System.out.println("           Welcome to OLA Riding App");
		System.out.println(" @ AVAIABLE VEHICLE'S @");
		System.out.println("->Press 1 to book OLA MICRO");
		System.out.println("->Press 2 to book OLA MINI");
		System.out.println("->Press 3 to book OLA SEDAN");
		System.out.println("->Press 4 to book OLA BIKE");
		System.out.println("->Press 5 to book OLA SHARED");
		int cab;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Cab Number you wish to ride :: ");
		cab=sc.nextInt();
		switch(cab)
		{
			case 1:
				baseFare+=20;
				amountToPay=baseFare+(farePerKm*distanceTravelled);
				System.out.println("Choosen CAB : OLA MICRO ");
				break;
			case 2:
				baseFare+=30;
				amountToPay=baseFare+(farePerKm*distanceTravelled);
				System.out.println("Choosen CAB : OLA MINI ");
				break;
			case 3:
				baseFare+=40;
				amountToPay=baseFare+(farePerKm*distanceTravelled);
				System.out.println("Choosen CAB : OLA SEDAN ");
				break;
			case 4:
				baseFare+=8;
				amountToPay=baseFare+(farePerKm*distanceTravelled);
				System.out.println("Choosen CAB : OLA BIKE ");
				break;
			case 5:
				baseFare+=6;
				amountToPay=baseFare+(farePerKm*distanceTravelled);
				System.out.println("Choosen CAB : OLA SHARED ");
				break;
			default:
				System.out.println("INVALID CAB NUMBER!!!!");
				System.out.println("NO such cab available with provided Number");
		}
		if(amountToPay>=100)
		{
			System.out.println("YOU ARE ELIGIBLE TO AVAIL PROMO CODES");
			System.out.println(" @AVAILABLE OFFERS PROMOCODE@ ");
			System.out.println("->Press ICICI21 to avail 20% off");
			System.out.println("->Press LOOT1 to avail 60% off");
			System.out.println("->Press PUNJAB9 to avail 30% off");
			System.out.print("Enter the PromoCode ::  ");
			String choice;
			sc.nextLine();
			choice=sc.nextLine();
			double discount;
			switch(choice)
			{
				
				case "ICICI21":
					discount = 0.20 * amountToPay;
					amountToPay-=discount;
					System.out.println("Discount availed \u20b9 : "+discount);
					break;
				case "LOOT1":
					discount = 0.60 * amountToPay;
					amountToPay-=discount;
					System.out.println("Discount availed \u20b9 : "+discount);
					break;
				case "PUNJAB9":
					discount = 0.30 * amountToPay;
					amountToPay-=discount;
					System.out.println("Discount availed \u20b9 : "+discount);
					break;
				default:
					System.out.println("INVALID PROMOCODE!!!!!!!!");
					
			}
			
		}
		sc.close();
		System.out.println("FINALLY you have to pay \u20b9 : "+amountToPay);
				

	}

}
