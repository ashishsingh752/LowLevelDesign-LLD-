package structuraldesignpattern.composite;

import java.util.ArrayList;
import java.util.List;

// 3. Composite - Folder
import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystemComponent component) {
        children.add(component);
    }

    public void remove(FileSystemComponent component) {
        children.remove(component);
    }

    @Override
    public void showDetails(int indent) {
        printIndent(indent);
        System.out.println("📁 Folder: " + name + " (" + getSize() + " KB)");

        for (FileSystemComponent child : children) {
            child.showDetails(indent + 1);
        }
    }

    @Override
    public long getSize() {
        long totalSize = 0;
        for (FileSystemComponent child : children) {
            totalSize += child.getSize();
        }
        return totalSize;
    }

    @Override
    public String getName() {
        return name;
    }

    private void printIndent(int indent) {
        for (int i = 0; i < indent; i++) {
            System.out.print("   ");
        }
    }
}