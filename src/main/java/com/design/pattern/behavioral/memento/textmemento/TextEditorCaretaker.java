package com.design.pattern.behavioral.memento.textmemento;

import lombok.extern.slf4j.Slf4j;

import java.util.Stack;

@Slf4j
class TextEditorCaretaker {

    private Stack<TextMemento> history = new Stack<>();

    public void save(TextEditor editor) {
        history.push(editor.save());
    }

    public void undo(TextEditor editor) {
        if (!history.isEmpty()) {
            editor.restore(history.pop());
        } else {
            log.info("No states to undo");
        }
    }

    public static void main(String[] args) {

        var editor = new TextEditor();
        var caretaker = new TextEditorCaretaker();

        editor.write("Hello, ");
        caretaker.save(editor);

        editor.write("World!");
        caretaker.save(editor);

        log.info("Current Text: " + editor.getText());

        caretaker.undo(editor);
        log.info("After Undo: " + editor.getText());

        caretaker.undo(editor);
        log.info("After Second Undo: " + editor.getText());

        caretaker.undo(editor);
    }
}