import ru.tensor.course.BaseFileSystemNode;

public class Folder extends BaseFileSystemNode {
    
    public Folder(BaseFileSystemNode parent, String name, BaseFileSystemNode... children){
        super(parent, name);
        for(BaseFileSystemNode child : children){
            child.setParent(this);
        }
    }

    public Folder(String name, BaseFileSystemNode... children){
        this(null, name, children);
    }
}
