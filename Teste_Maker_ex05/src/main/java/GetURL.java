import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetURL {

	protected HttpsURLConnection con;
	protected int responseCode;
	protected String responseMsg;
	protected StringBuffer sb = new StringBuffer();
	protected String json;

	public String trazURL() throws IOException {

		URL get_url = new URL("https://mockbin.org/bin/14df27ac-12bc-45b9-bd0c-93cb3b81fdfd");

		con = (HttpsURLConnection) get_url.openConnection();

		responseCode = con.getResponseCode();
		responseMsg = con.getResponseMessage();

		BufferedReader bf = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String input;

		if (responseCode == 200) {

			while ((input = bf.readLine()) != null) {
				sb.append(input);
							}
			bf.close();

		}
			
		return json = sb.toString();
	}

}
