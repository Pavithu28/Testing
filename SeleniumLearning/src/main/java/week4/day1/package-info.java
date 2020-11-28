package week4.day1;
import java.util.LinkedHashMap;
import java.util.Map;


public class Charcount{
	public static void main(String[] args) {
		String abc= "Most Important";
		String ch="t";
		int count=0;

		char[] chr = abc.toCharArray();
		for(int i=0;i<=abc.length();i++)
		{
			if(chr[i]=='t') {
				count++;

			}
		}
		Map<String,Integer> map = new LinkedHashMap<String,Integer>();
map.put(ch, count);
System.out.println(map);

	}



}
