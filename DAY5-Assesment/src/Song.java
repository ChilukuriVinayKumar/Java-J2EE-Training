import java.util.*;

class SongObject
{
	String name;
	double duration;
	boolean hasLogo;
	
	SongObject(String name,double duration, boolean hasLogo)
	{
		this.name=name;
		this.duration=duration;
		this.hasLogo=hasLogo;
	}
	
	public String toString() 
	{
		return "Song name : "+name+" duration : "+duration+" hasLogo : "+hasLogo;
	}
}

class DurationComparator implements Comparator<SongObject>
{
	public int compare(SongObject s1,SongObject s2)
	{
		if(s1.duration==s2.duration)
		{
			return 0;
		}
		else if(s1.duration>s2.duration)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}

public class Song 
{

	public static void main(String[] args) 
	{
		
		Set<SongObject> set = new TreeSet<SongObject>(new DurationComparator());    // we need to use comparator interface when using TreeSet in Java 
		set.add(new SongObject("Dilbar" , 4.5, true));
		set.add(new SongObject("Alone" , 3.1, true));
		set.add(new SongObject("Shaded" , 4.5, false));
		set.add(new SongObject("Sunny Sunny" , 5.5, true));
		set.add(new SongObject("Urvasi Urvasi" , 3.8, false));
		set.add(new SongObject("Brown Rang" , 3.4, false));
		set.add(new SongObject("Aashique" , 4.5, true));
		
		for(SongObject s : set)
		{
			System.out.println(s);
		}
	}

}
