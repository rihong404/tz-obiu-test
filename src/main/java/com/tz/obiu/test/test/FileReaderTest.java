package com.tz.obiu.test.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileReaderTest {
	public static String readToChar() {
		//FileReader for char
		FileReader fread = null;
		int n = 0;
		try {
			fread = new FileReader("src/main/resources/templates/billDeliverTemplate.html");
			n = fread.read();
			while(n != -1) {
				System.out.println((char)n);
				n = fread.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (fread != null) {
				try {
					fread.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;
	}
	
	public static String readToCharArray() {
		FileReader fread = null;
		char [] c = new char[1024];
		int n = 0;
		try {
			fread = new FileReader("src/main/resources/templates/billDeliverTemplate.html");
			while((n=fread.read(c)) != -1) {
				System.out.println(new String(c,0,n));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fread != null) {
				try {
					fread.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;
	}
	
	public static String readToBuffReader() {
		FileReader fread = null;
		BufferedReader buf = null;
		try {
			fread = new FileReader("src/main/resources/templates/billDeliverTemplate.html");
			buf = new BufferedReader(fread);
			String line = null;
			while((line = buf.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(buf != null) {
				try {
					buf.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;
	}
}
