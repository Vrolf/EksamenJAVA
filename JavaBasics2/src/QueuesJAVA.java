

import java.util.LinkedList;
import java.util.Queue;

public class QueuesJAVA {

	public static void main(String[] args) {
		
		Queue <String> bbqLine = new LinkedList <String>();
		

		bbqLine.add("JACKSON");
		bbqLine.add("Tyreek");
		bbqLine.add("Susan");
		
		bbqLine.poll();
		bbqLine.poll();
		
		System.out.println(bbqLine);
		
		
		Queue <String> q = new LinkedList <String> ();
		
		q.add("A");
		q.add("B");
		q.add("C");
		
		System.out.println(q);
		System.out.println(q.size());
		System.out.println(q.contains("D"));
		System.out.println(q.contains("A"));
		System.out.println(q.containsAll(q));
		System.out.println(q.toArray()[1]);
	}

}
