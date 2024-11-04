package com.design.pattern.behavioral.strategy.encoding.ecrytion;


import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Service
public class SHA1Encryption implements Encryption{

    @Override
    public void encrypt(String toBeEncrypted) throws NoSuchAlgorithmException {

        MessageDigest md = MessageDigest.getInstance("SHA-1");

        byte[] messageDigetst = md.digest(toBeEncrypted.getBytes());

        var no = new BigInteger(1, messageDigetst);
        var hashText = no.toString(16);

        while (hashText.length() < 40) {
            hashText = "0" + hashText;
        }

        System.out.println("Encrypted (SHA-1) Text: " + hashText);
    }

    @Override
    public EncodingPatternEnum getEncryptionType() {
        return EncodingPatternEnum.SHA1;
    }
}
