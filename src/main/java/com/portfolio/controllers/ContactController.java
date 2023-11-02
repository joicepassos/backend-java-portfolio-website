package com.portfolio.controllers;

import com.portfolio.util.Constants;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(Constants.API_ROOT)
public class ContactController {

    @PostMapping(Constants.SEND_MESSAGE)
    public ResponseEntity<?> sendMessage(@RequestBody String contactDetails) {
        return ResponseEntity.ok().body("Mensagem enviada");
    }

}
