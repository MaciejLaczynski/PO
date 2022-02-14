package nr_158809E02.Z2;
import java.io.File;

public class Main {
    public static void main(String[] args){

        File[] findSubDirectories = findSubDirectories(
                path: "D:\\scilab");
        for(File file: findSubDirectories){
            System.out.println(file.getName());
        }
    }
    public static File[] findSubDirectories(String path){
        File mainCatalog = new File(path);
        return mainCatalog.listFiles((file)->{return file.isDirectory();});
    }
}
