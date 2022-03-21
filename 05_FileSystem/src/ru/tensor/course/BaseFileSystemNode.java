package ru.tensor.course;

public class BaseFileSystemNode extends AbstractFileSystemNode {

    public BaseFileSystemNode(String name) {
        super(name);
    }

    public BaseFileSystemNode(FileSystemNode parent, String name){
        super(parent, name);
    }
    
}
