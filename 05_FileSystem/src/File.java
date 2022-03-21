import ru.tensor.course.BaseFileSystemNode;
import ru.tensor.course.FileSystemNode;

public class File extends BaseFileSystemNode {

    private String extension;

    public File(FileSystemNode parent, String name, String extension) {
        super(parent, name);
        this.extension = extension;
    }

    public File(String name, String extension) {
        this(null, name, extension);
    }

    public String getExtension(){
        return extension;
    }
    
    @Override
    public String getName(){
        return super.getName() + "." + getExtension();
    }
}
