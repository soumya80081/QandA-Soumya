import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class Response {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		URL url = null;
		try {
			url = new URL("http://www.thomas-bayer.com/sqlrest/CUSTOMER/");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HttpURLConnection connection = null;
		try {
			connection = (HttpURLConnection)url.openConnection();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			connection.setRequestMethod("GET");
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			connection.connect();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			int code = connection.getResponseCode();
			String sdp = connection.getResponseMessage();
			System.out.println(code);
			System.out.println(sdp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader((connection.getInputStream())));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		StringBuilder sb = new StringBuilder();
		String output;
		try {
			while ((output = br.readLine()) != null) {
			sb.append(output+"\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sb.toString());

	}

}
