import java.io.*;

class Test2 {

	public static void main(String argv[]) {
		try {
			int c = readOneChar();
			System.out.println("The character " + c + " was read");
		} catch (FileNotFoundException e) {
			System.out.println("File did not exist");
		} catch (IOException e) {
			System.out.println("Well i could not read, sorry");
		}
	}

	public static int readOneChar() throws IOException {
		InputStreamReader file = openTempFile();
		try {
			return file.read();
		} finally {
			file.close();
		}
	}

	public static InputStreamReader openTempFile() throws FileNotFoundException {
		return new FileReader("./temp");
	}


}
