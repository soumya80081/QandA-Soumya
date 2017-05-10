import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class Q2 {

	private int x;
	private int y;
	
	public Q2(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	public int add(){
		return x+y ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q2 test1 = new Q2(2,4);
		System.out.println(" 2 + 4 = " + test1.add());
		
		Q2 test2 = new Q2(4,3);
		System.out.println(" 4 + 3 = " + test2.add());
		
		Q2 test3 = new Q2(5,7);
		System.out.println(" 5 + 7 = " + test3.add());
		
		Q2 test4 = new Q2(9,8);
		System.out.println(" 9 + 8 = " + test4.add());
	}
}

		