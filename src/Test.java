import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by eros14 on 2017-01-20.
 */
public class Test {
    public static void main(String[] args) throws Exception {
        URL oracle = new URL("https://www.oracle.com/index.html");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        inputLine.contains("<a");
        in.close();

    }
}

