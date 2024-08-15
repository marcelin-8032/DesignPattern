package com.design.pattern.behavioral.memento.textmemento;

class TextEditor {

    private StringBuilder text;

    public TextEditor() {
        this.text = new StringBuilder();
    }

    public void write(String newText) {
        text.append(newText);
    }

    public String getText() {
        return text.toString();
    }

    public TextMemento save() {
        return new TextMemento(text.toString());
    }

    public void restore(TextMemento memento) {
        text = new StringBuilder(memento.text());
    }
}
