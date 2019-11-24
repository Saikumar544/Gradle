package HelloWorldGradle;

public class Numbers {
	int x[] = { 1, 2, 3, 4, 5 };

	public void display() throws Exception {
		for (int i = 0; i < x.length; i++) {
			if(x[i]==4) throw new Exception();
			System.out.println("numbers is : " + x[i]);
		}
	}
}
