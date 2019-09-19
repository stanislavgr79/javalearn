package work.java_learn.$pattern.$12Proxy.$02;

import java.io.File;

public class ImageImp implements DisplayImage{
    private LoadImage loadImage;
    private String file;
    private File dest;

    public ImageImp(File dest) {
        this.dest = dest;
        load(dest);
    }

    public String getFile() {
        return file;
    }

    public String load(File file){
        LoadImage ld = new LoadImage();
        System.out.println("идет загрузка");
        return this.file = ld.loadImage(file);
    }

    @Override
    public void display() {
        System.out.println("включаем просмотр");
        System.out.println(this.file);
    }
}
