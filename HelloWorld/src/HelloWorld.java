import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author Tobias
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello ASE2015 - how are you now? :)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter your name: ");
        try {
            String s = br.readLine();
            HelloUser user = new HelloUser(s);
            user.greetUser();
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
