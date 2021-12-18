package div_2_A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Template_for_cp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastScanner fs= new FastScanner();
		int i= fs.nextInt();
		int j=fs.nextInt();
		System.out.println(j+i+" ");

	}

}
class FastScanner {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st=new StringTokenizer("");
	String next() {
		while (!st.hasMoreTokens())
			try { 
                                    st=new StringTokenizer(br.readLine());				               
                            } catch (IOException e) {}
		return st.nextToken();
	}
	
	int nextInt() {
		return Integer.parseInt(next());
	}
	long nextLong() {
		return Long.parseLong(next());
	}
}
