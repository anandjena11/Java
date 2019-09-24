package CoreJava;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterClass {

	public static void main(String[] args) throws IOException {
		String text="This is 1st line";
		BufferedWriter writer = new BufferedWriter(new FileWriter ("F:\\Testing\\BufferWriterclss.txt"));
		writer.write(text);
		writer.close();

	}

}
