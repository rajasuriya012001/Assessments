package Assesment2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Copyfile {

	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("/home/vastpro/s/mio.txt");
			BufferedWriter bw= new BufferedWriter(fw);
			bw.write("hi warn");
			bw.write("\nhello is error");
			bw.write("\nthis is suriya");
			bw.write("\nhow are you");
			bw.write("\nnot bad");

			bw.close();
			System.out.println("contents are saved");
			
			FileReader fr=new FileReader("/home/vastpro/s/mio.txt");
			BufferedReader br=new BufferedReader(fr);
			
			String s=null;
			while((s=br.readLine())!=null) {
				if(s.contains("warn") || s.contains("error") || s.contains("fatal")) {
					FileWriter fww=new FileWriter("/home/vastpro/s/mio1.txt");
					fww.write(s);
					System.out.println(s);
					fw.close();
				}
				else {
					System.out.println("bye bye");
				}
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}

