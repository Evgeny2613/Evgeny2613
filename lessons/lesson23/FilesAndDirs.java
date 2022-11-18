package lessons.lesson23;

import java.io.File;
import java.util.Arrays;

public class FilesAndDirs {
    public static void main(String[] args) {
        String homeDir = System.getProperty("user.home");
        System.out.println(homeDir);

        String delim = System.getProperty("file.separator");
        System.out.println(delim);

        File home = new File(homeDir);
        boolean isFile = home.isFile();
        System.out.println("is file: " + isFile + " path: " + home.getAbsolutePath());
        String path = home.getAbsolutePath();

        Arrays.stream(home.list())
                .forEach(e -> {
                    File f = new File(path + delim + e);
                    String type = f.isFile() ? "f" : "d";
                    System.out.println(type + " " + f.length() + " " + e);
                });
    }
}
