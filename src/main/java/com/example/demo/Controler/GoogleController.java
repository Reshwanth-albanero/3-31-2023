package com.example.demo.Controler;
import com.example.demo.Model.Notes;
import com.example.demo.Service.GoogleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class GoogleController {
    @Autowired
    GoogleService googleService;

    @PutMapping("/create-notes")
    public ResponseEntity<String> addNotes(@RequestBody Notes notes) {
        googleService.addNotes(notes);
        return new ResponseEntity<>("Success", HttpStatus.ACCEPTED);
    }
}
