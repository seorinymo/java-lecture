import java.io.*;

public class InputStreamReaderExample {

	public static void main(String[] args) throws Exception {
		
		InputStreamReader reader = new InputStreamReader(System.in);
		char[] input = new char[10];
		reader.read(input);
		System.out.println(input);
		
	}
}
