package com.design.pattern.behavioral.strategy.encoding.ecrytion;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EncryptionFactory {

    Map<EncodingPatternEnum, Encryption> encryptionMap;

    @Autowired
    public EncryptionFactory(Set<Encryption> encryptionTypeSet) {
        createStrategy(encryptionTypeSet);
    }

    private void createStrategy(Set<Encryption> encryptionTypeSet) {
        encryptionMap = new HashMap<>();
        encryptionTypeSet.forEach(encryptionTypes ->
                encryptionMap.put(encryptionTypes.getEncryptionType(), encryptionTypes));
    }
    
    public Encryption findEncryptionType(EncodingPatternEnum encodingPatternEnum){
        return getEncryption(encodingPatternEnum);
    }

    private Encryption getEncryption(EncodingPatternEnum encodingPatternEnum) {
        return encryptionMap.get(encodingPatternEnum);
    }
}
