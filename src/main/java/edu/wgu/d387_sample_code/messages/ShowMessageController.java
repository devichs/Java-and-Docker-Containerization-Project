package edu.wgu.d387_sample_code.messages;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ShowMessageController {

    @GetMapping("/welcome/en")
    public ResponseEntity<String> showMappedMessageEn () {
        Locale locale = Locale.US;
        ShowMessage showMessage = new ShowMessage(locale);
        String message = showMessage.getMessage();
        return new ResponseEntity<String> (showMessage.getMessage(),HttpStatus.OK);
    }
    @GetMapping("/welcome/fr")
    public ResponseEntity<String> showMappedMessageFr () {
        Locale locale = Locale.CANADA_FRENCH;
        ShowMessage showMessage = new ShowMessage(locale);
        String message = showMessage.getMessage();
        return new ResponseEntity<String> (showMessage.getMessage(),HttpStatus.OK);
    }
}
