package structuraldesignpattern.composite;
// 2. Leaf - File
public class File implements FileSystemComponent {
    private String name;
    private long size;   // in KB

    public File(String name, long size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void showDetails(int indent) {
        printIndent(indent);
        System.out.println("📄 File: " + name + " (" + size + " KB)");
    }

    @Override
    public long getSize() {
        return size;
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