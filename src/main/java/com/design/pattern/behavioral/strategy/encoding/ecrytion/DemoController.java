package com.design.pattern.behavioral.strategy.encoding.ecrytion;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.NoSuchAlgorithmException;

@RestController
public class DemoController {

    @Autowired
    EncryptionFactory encryptionFactory;

    @GetMapping("/encryption")
    public void encryptWithEncoder(@RequestParam EncodingPatternEnum encodingPatternEnum) throws NoSuchAlgorithmException {
        encryptionFactory.findEncryptionType(encodingPatternEnum).encrypt("code decode");
    }
}
