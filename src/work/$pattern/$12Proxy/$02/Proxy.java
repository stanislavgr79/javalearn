package work.$pattern.$12Proxy.$02;

import java.io.File;

public class Proxy implements DisplayImage {
    File file;
    ImageImp imageImp;

    public Proxy(File file) {
        this.file = file;
    }

    @Override
    public void display() {
        if(imageImp==null)
            imageImp = new ImageImp(file);
        imageImp.display();
    }
}
