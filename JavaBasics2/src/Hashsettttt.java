import java.util.HashSet;
import java.util.Iterator;

public class Hashsettttt {

	public static void main(String[] args) {
		
		HashSet<String> h = new HashSet<String>();
		h.add("VICCC");
		h.add("RELF");
		h.add("KJEKKAS");
		h.add("LEL");
		h.remove("LEL");
		
		System.out.println(h.size());
		System.out.println(h.isEmpty());
		System.out.println(h);
		
		HashSet <Integer> hashbrowns = new HashSet<Integer>();
		hashbrowns.add(13);
		hashbrowns.add(24);
		hashbrowns.add(5);
		
		Iterator <Integer> it = hashbrowns.iterator();
	
		while(it.hasNext()) {
			System.out.println(it.next());
		}
			
		
		Object[] h1 = hashbrowns.toArray();
		System.out.println(h1[0]);
		
		

	}

}
