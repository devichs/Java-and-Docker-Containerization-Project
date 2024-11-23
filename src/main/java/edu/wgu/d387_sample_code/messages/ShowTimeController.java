package edu.wgu.d387_sample_code.messages;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ShowTimeController {

    @GetMapping("/presentation")
    public ResponseEntity<String> showLivePresentation() {
        String presentationTimes = "Join us for an online live streaming event at: " + ShowTime.getTimeZone();
        return new ResponseEntity<String>(presentationTimes, HttpStatus.OK);
    }

}
