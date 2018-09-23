package wcproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class count {
	public void countchars(String path) throws IOException{
		BufferedReader br=new BufferedReader(new FileReader(path));
		int chars = 0;
		String str = "";
		while ((str = br.readLine()) != null) {
			Pattern p = Pattern.compile("\\S");
			Matcher m = p.matcher(str);
			while (m.find()) {
				chars++;
			}
		}
		System.out.println("字符数：" + chars);
		br.close();
	}
	
	public void countlines(String path) throws IOException{
		BufferedReader br=new BufferedReader(new FileReader(path));
		int lines = 0;
		String str = "";
		while ((str = br.readLine()) != null) {
			lines++;
		}
		System.out.println("行数：" + lines);
		br.close();
	}
	
	public void countwords(String path) throws IOException{
		BufferedReader br=new BufferedReader(new FileReader(path));
		int words = 0;
		String str = "";
		while ((str = br.readLine()) != null) {	
			Pattern q = Pattern.compile("\\w+'*\\w+|[\\u4e00-\\u9fa5]");
			Matcher n = q.matcher(str);
			while (n.find()) {
				words++;
			}
		}
		System.out.println("词数：" + words);
		br.close();
	}
}