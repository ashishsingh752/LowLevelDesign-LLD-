package behavioraldesignpattern.mementoDesignPattern;

public class MementoPatternDemo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        HistoryCaretaker caretaker = new HistoryCaretaker();

        System.out.println("=== Text Editor with Undo (Memento Pattern) ===\n");

        editor.type("Hello ");
        caretaker.saveState(editor);

        editor.type("World! ");
        caretaker.saveState(editor);

        editor.type("This is Ashish learning Design Patterns.");
        caretaker.saveState(editor);

        System.out.println("\nCurrent Content: " + editor.getContent());

        System.out.println("\n--- Performing Undo ---");
        caretaker.undo(editor);

        System.out.println("\n--- Performing Undo Again ---");
        caretaker.undo(editor);

        System.out.println("\n--- Performing Undo Again ---");
        caretaker.undo(editor);

        System.out.println("\nFinal Content: " + editor.getContent());
    }
}
