package com.design.pattern.behavioral.command.document;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Document {


    void open() {
        log.info("Document Opened");
    }

    void save() {
        log.info("Document Saved");
    }

    void close() {
        log.info("Document Closed");
    }


}
