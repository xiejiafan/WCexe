package wcproject;

import java.io.*;
import java.util.regex.*;
import java.util.*;

public class WCproject {
	
	public static void main(String []arg) throws IOException {
		count c=new count();
		String input = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÃüÁî£º");
		while (scan.hasNextLine()) {// ¶ÁÈ¡¿ØÖÆÌ¨µÄÃüÁî
			input = scan.nextLine();			
			String[] arr = input.split("\\s+");
			File file = new File(arr[1]);
			if (file.exists()) {				
				switch (arr[0]) {
				case "-c":
					c.countchars(arr[1]);				
					break;
				case "-l":
					c.countlines(arr[1]);
					break;
				case "-w":
					c.countwords(arr[1]);
					break;
				default:
					System.out.println("ÃüÁîÓĞÎó£¡");
				}
			} else {
				System.out.println("ÃüÁîÓĞÎó£¡");
			}
		}
		scan.close();
	}
}
