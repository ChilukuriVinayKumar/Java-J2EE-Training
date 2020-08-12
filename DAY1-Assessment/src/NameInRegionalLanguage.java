
public class NameInRegionalLanguage
{
	public static void main(String[] args)
	{
		char name[]= {'\u092E','\u0947','\u0930','\u093E',' ','\u0928','\u093E','\u092E',' ','\u091A','\u093F','\u0932'
				,'\u0941','\u0915','\u0942','\u0930','\u0940',' ','\u0935','\u093F','\u0928','\u092F',' ','\u0915','\u0941','\u092E','\u093E','\u0930',' ','\u0939','\u0948','\u0964'};
		System.out.println("My name in my Regional Language");
		for(int i=0;i<name.length;i++)
		{
			System.out.print(name[i]);
		}
	}
}
