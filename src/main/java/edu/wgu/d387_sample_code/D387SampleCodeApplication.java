package edu.wgu.d387_sample_code;
import edu.wgu.d387_sample_code.messages.ShowMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Locale;

@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class,args);

		ShowMessage showMessageUs = new ShowMessage(Locale.US);
		Thread usThread = new Thread(showMessageUs);

		try {
			usThread.start();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		ShowMessage showMessageFr = new ShowMessage(Locale.CANADA_FRENCH);
		Thread frThread = new Thread(showMessageFr);

			try {
				frThread.start();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
	}
}
