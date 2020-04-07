package filesystemexamples;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileExample {

	public static void main(String[] args) {
		FileSystem fs = FileSystems.getDefault();
		Path ps = fs.getPath("FileExample.java");
		System.out.println(" path : "+ps);
	}
}
