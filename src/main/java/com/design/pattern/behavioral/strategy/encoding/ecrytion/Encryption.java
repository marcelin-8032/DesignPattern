package com.design.pattern.behavioral.strategy.encoding.ecrytion;

import java.security.NoSuchAlgorithmException;

public interface Encryption {

    void encrypt(String toBeEncrypted) throws NoSuchAlgorithmException;

    EncodingPatternEnum getEncryptionType();
}
