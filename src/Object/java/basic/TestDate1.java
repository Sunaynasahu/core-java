package Object.java.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate1 {
	public static void main(String[] args) throws ParseException {
		StringBuffer sb =new StringBuffer("20/06/2023");
		String str =sb.toString();
		//String str ="20/06/2023";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = sdf.parse(str);
		
		
		System.out.println(d);
	}

}
