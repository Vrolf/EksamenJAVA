import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLister {

	public static void main(String[] args) {
	LinkedList<String> linky = new LinkedList<String>();
	
	linky.add("Yohan");
	linky.add("ALEX");
	linky.add("JOSE");
	
	linky.remove();
	
	// linky.clear();
	

	
	
	System.out.println(linky);
	
	LinkedList<Integer> talleneerballene = new LinkedList<Integer>();
	
	talleneerballene.add(100);
	talleneerballene.add(110);
	talleneerballene.add(1000);
	
	Iterator it = talleneerballene.iterator();
	
	while(it.hasNext()) {
		if((int) it.next() == 100) {
			System.out.println("We found 78");
			{
				
			}
			
		}
	}
	
	
	

	}

}
