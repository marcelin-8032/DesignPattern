package com.design.pattern.behavioral.strategy.encoding.ecrytion;

import org.springframework.stereotype.Service;

import java.awt.event.MouseAdapter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Service
public class MD5Encryption implements Encryption {

    @Override
    public void encrypt(String toBeEncrypted) throws NoSuchAlgorithmException {

        MessageDigest md = MessageDigest.getInstance("MD5");

        byte[] messageDigetst = md.digest(toBeEncrypted.getBytes());

        var no = new BigInteger(1, messageDigetst);
        var hashText = no.toString(16);

        while (hashText.length() < 32) {
            hashText = "0" + hashText;
        }

        System.out.println("Encrypted (MD5) Text: " + hashText);
    }

    @Override
    public EncodingPatternEnum getEncryptionType() {
        return EncodingPatternEnum.MD5;
    }
}
