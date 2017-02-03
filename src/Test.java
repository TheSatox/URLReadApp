import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by eros14 on 2017-01-20.
 */
public class Test {
    public static void main(String[] args) throws Exception {
        URL oracle = new URL("https://www.oracle.com/index.html");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            if (inputLine.contains("href=")) {
                int start = inputLine.indexOf("href=");
                int stop = inputLine.indexOf(">", start);
                String link = inputLine.substring(start+6, stop-1);
                System.out.println(link);
            }
            //System.out.println(inputLine);

        }
        in.close();

    }
}

