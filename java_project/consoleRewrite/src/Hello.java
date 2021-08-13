public class Hello {

	private static String Xbox(int num) {

		System.out.println("Hello Xbox");
        return "Xbox" + num;
	}
public static void main(String[] args) {
    System.out.println("Hello World");
    
    String name = "Kevin";
    System.out.println("Hello World " + name);
    System.out.println(Xbox(360));

    }
}