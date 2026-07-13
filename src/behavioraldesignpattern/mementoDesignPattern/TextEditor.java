package behavioraldesignpattern.mementoDesignPattern;

// 2. Originator - The main object
public class TextEditor {
    private StringBuilder content = new StringBuilder();
    private int cursorPosition = 0;

    public void type(String text) {
        content.append(text);
        cursorPosition += text.length();
        System.out.println("Typed: \"" + text + "\" | Content: " + content);
    }

    public void moveCursor(int position) {
        if (position >= 0 && position <= content.length()) {
            this.cursorPosition = position;
            System.out.println("Cursor moved to position: " + position);
        }
    }

    // Create a snapshot (Memento)
    public EditorMemento save() {
        System.out.println("Saving current state...");
        return new EditorMemento(content.toString(), cursorPosition);
    }

    // Restore from Memento
    public void restore(EditorMemento memento) {
        if (memento != null) {
            this.content = new StringBuilder(memento.getContent());
            this.cursorPosition = memento.getCursorPosition();
            System.out.println("Restored to previous state: " + content);
        }
    }

    public String getContent() {
        return content.toString();
    }
}
