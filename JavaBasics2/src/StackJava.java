

import java.util.Stack;

public class StackJava {

	public static void main(String[] args) {
		
		Stack<String> games = new Stack<String>();
		
		games.add("Call of Duty");
		games.add("Gitar Hero");
		games.add("Super Monkey Ball");
		
		System.out.println(games.pop());
		System.out.println(games.pop());
		
		System.out.println(games);
		
		
		// LEGO EXAMPLE 
		
		// Y 
		// B 
		// R
		
		Stack <Character> tower = new Stack<Character>();
		
		tower.add('R');
		tower.add('B');
		tower.add('Y');
		
		System.out.println(tower.get(0));
		System.out.println(tower.set(1, 'V'));
		

	}

}
