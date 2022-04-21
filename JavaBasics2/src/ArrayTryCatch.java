
public class ArrayTryCatch {

	public static void main(String[] args) {
		
		try {
			int[] a = {4};
			System.out.println(a[1]);
		} catch(NullPointerException e) {
			System.out.println("You Array IS NULL");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Your Index is out of bounds");
			
		}catch(Exception e) {
			System.out.println("Something else went wrong");
		}

	}

}
