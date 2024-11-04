package com.design.pattern.behavioral.strategy.encoding.ecrytion;


import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Service
public class SHA2Encryption implements Encryption{

    @Override
    public void encrypt(String toBeEncrypted) throws NoSuchAlgorithmException {

        MessageDigest md = MessageDigest.getInstance("SHA-256");

        byte[] messageDigest = md.digest(toBeEncrypted.getBytes());

        BigInteger no = new BigInteger(1, messageDigest);
        String hashText = no.toString(16);

        while (hashText.length() < 64) {
            hashText = "0" + hashText;
        }

        System.out.println("Encrypted (SHA-256) Text: " + hashText);
    }

    @Override
    public EncodingPatternEnum getEncryptionType() {
        return EncodingPatternEnum.SHA2;
    }
}
