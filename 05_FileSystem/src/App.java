import ru.tensor.course.*;

public class App {
    public static void main(String[] args) throws Exception {
        File readme = new File("readme","md");
        File bash_rc = new File("","bashrc");
        Folder user = new Folder("User", readme, bash_rc);
        Folder home = new Folder("home", user);
        Folder opt = new Folder("opt");

        System.out.println("Readme path: " + readme.getPath());
        System.out.println("User folder path: " + user.getPath());
        System.out.println("Bashrc name: " + bash_rc.getName());
        System.out.println("Readme extension: " + readme.getExtension());
    }
}
