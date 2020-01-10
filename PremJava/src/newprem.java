import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class newprem {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.append("Java");//now original string is changed  
		int e=sb.codePointAt(0);
		System.out.println(sb);//prints Hello Java
		System.out.println(e);
		System.out.println(sb.substring(4));
		System.out.println(sb.reverse());
		System.out.println(sb.lastIndexOf("Java", 0));
		String s1="prem";
//		String s2=s1.concat("Kumar");
//		System.out.println(s2);
	}

}
