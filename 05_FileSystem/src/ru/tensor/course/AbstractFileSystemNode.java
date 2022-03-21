package ru.tensor.course;

public abstract class AbstractFileSystemNode implements FileSystemNode {

    private FileSystemNode parent;
    private String name;

    public AbstractFileSystemNode(FileSystemNode parent, String name){
        this.parent = parent;
        this.name = name;
    }

    public AbstractFileSystemNode(String name){
        this(null, name);
    }

    @Override
    public final FileSystemNode getParent() {
        return parent;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public final String getPath() {
        String parent_path = new String();
        if(parent != null)
            parent_path = parent.getPath();
        return parent_path + "/" + getName();
    }

    public void setParent(FileSystemNode parent){
        this.parent = parent;
    }
    
}
