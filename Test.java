import java.io.*;

class Test {

	public static void main(String argv[]) {
		int c = readOneChar();
		System.out.println("The character " + c + "was read");		
	}

	public static int readOneChar() {
		try {
			FileReader f = new FileReader("./temp");
			return f.read();
		} catch (IOException e) {
			System.out.println("I fucked up");
			return 0;
		}
	}

}
