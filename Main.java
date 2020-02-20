package epam.interest;
import java.io.*;

public class Main {
	public double principle,rate,time;
	public double simpleInterest,compoundInterest;
	
	void input_data()  throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("Enter principle:");
		bw.flush();
		principle = Double.parseDouble(br.readLine());
		bw.write("Enter rate:");
		bw.flush();
		rate = Double.parseDouble(br.readLine());
		bw.write("Enter time:");
		bw.flush();
		time = Double.parseDouble(br.readLine());
	}
	
	void Process_data() {
		Simple_interest si = new Simple_interest(principle,rate,time);
		Compound_interest ci = new Compound_interest(principle,rate,time);
		simpleInterest = si.returnInterest();
		compoundInterest = ci.returnInterest();
	}
	
	void Output_data() throws IOException{
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("Simple Interest:" +  simpleInterest + "\n");
		bw.write("Compound Interest:" + compoundInterest + "\n");
		bw.flush();
	}
	
	public static void main(String args[]) throws IOException{
		Main mainRun = new Main();
		try{
			mainRun.input_data();
			mainRun.Process_data();
			mainRun.Output_data();
		}
		catch(IOException e) {
			throw e;
		}
		
	}

}
