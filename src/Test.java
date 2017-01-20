import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by eros14 on 2017-01-20.
 */
public class Test {
    public static void main(String[] args) throws Exception {
        URL oracle = new URL("http://www.oracle.com/");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}

