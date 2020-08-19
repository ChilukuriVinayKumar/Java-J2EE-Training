import java.util.ArrayList;
import java.io.*;

class Series implements Serializable
{
	String name;
	int noOfSeason;
	String genre;
	transient double rating;      // this is used so that i can now disable the rating to serialize
	
	Series(String name,int noOfSeason,String genre,double rating)
	{
		this.name=name;
		this.noOfSeason=noOfSeason;
		this.genre=genre;
		this.rating=rating;
	}
	
	static void serializeData(ArrayList<Series> arr) throws Exception
	{
		System.out.println("Serialization Started");
		FileOutputStream fout =new FileOutputStream("D:\\SeriesDetails.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		for(Series s:arr)
		{
			out.writeObject(s);
		}
		out.close();
		fout.close();
		System.out.println("Serialized Done sucessfully");
		
	}
	
	static void deserializeData(int n) throws Exception
	{
		System.out.println("DeSerialization Started");
		FileInputStream fin =new FileInputStream("D:\\SeriesDetails.txt");
		ObjectInputStream in=new ObjectInputStream(fin);
		for(int i=0;i<n;i++)
		{
			Series s=null;
			s=(Series)in.readObject();
			System.out.println(s);
		}
		in.close();
		fin.close();
		System.out.println("DeSerialized Done sucessfully");
		
	}
	
	public String toString()
	{
		return name+" - "+noOfSeason+" - "+genre+" - "+rating;
	}
	
	
}
public class TestingSerializability 
{

	public static void main(String[] args) throws Exception 
	{
		ArrayList<Series> arr = new ArrayList<Series>();
		arr.add(new Series("Game of Thrones",10,"Drama/Adventures/Action",9.2));
		arr.add(new Series("Money Heist",4,"Thriller",8.9));
		arr.add(new Series("Chernobyl",1,"Drama",9.5));
		arr.add(new Series("Lost in Space",3,"Adventure/sci-fi",9.5));
		arr.add(new Series("Breaking Bad",8,"Drama/Crime/thriller",9.5));
		arr.add(new Series("The Walking Dead",5,"Drama/Horror/Thriller",8.2));
		arr.add(new Series("The Wire",7,"Drama/Crime/thriller",9.3));
		arr.add(new Series("The West World",3,"Adeventure",9.5));
		
		Series.serializeData(arr);
		Series.deserializeData(arr.size());
		
		
		
	}

}
