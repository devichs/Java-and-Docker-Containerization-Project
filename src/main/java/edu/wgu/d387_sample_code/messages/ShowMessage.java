package edu.wgu.d387_sample_code.messages;
import java.util.Locale;
import java.util.ResourceBundle;

public class ShowMessage implements Runnable{

    private Locale locale;
    private String message;

    public ShowMessage(Locale locale){

        this.locale = locale;

    }
    public String getMessage(){
        ResourceBundle rb = ResourceBundle.getBundle("translation", locale);
        return rb.getString("translation");
    }
    @Override
    public void run(){
        message = getMessage();
        System.out.println(message);
    }
}
