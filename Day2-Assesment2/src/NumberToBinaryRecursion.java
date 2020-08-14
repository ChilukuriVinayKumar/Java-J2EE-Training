import java.util.Scanner;
public class NumberToBinaryRecursion 
{
	int numberToBinary(int number)
	{
		if(number==0)
		{
			return 0;
		}
		return (number%2)+10*numberToBinary(number/2);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int number;
		NumberToBinaryRecursion n=new NumberToBinaryRecursion();
		System.out.print("Enter the number to be converted to Binary : ");
		number=sc.nextInt();
		int limit=0;
		while(1!=0)
		{
			if(Math.pow(2,limit)>number)
			{
				break;
			}
			limit++;
		}
		int binary=n.numberToBinary(number);
		System.out.println("Number In binary Code is: "+binary);
		
	}

}

