package LAB9;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Q3 {
	public static void main(String[] args)throws Exception {  
	    String sDate1="31/12/1998";  
	    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
	    System.out.println(sDate1+"\t"+date1);  
	    //final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
	    //System.out.print(sdf.parse("2018-01-16T00:07:00.000+05:30"));
	}  
}
