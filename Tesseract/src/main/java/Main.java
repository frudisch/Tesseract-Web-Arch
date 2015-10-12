import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

/**
 * Tesseract training data: https://code.google.com/p/tesseract-ocr/downloads/list
 *
 * Created by Florian on 12.10.2015.
 */
public class Main {

    public static void main(String[] args){
        File image = new File("./Tesseract/src/main/resources/IMG_20151006_120933.jpg");

        System.out.println(image.exists());
        System.out.println(new File("./").getAbsolutePath());

        Tesseract instance = Tesseract.getInstance();

        instance.setLanguage("deu");
        try {
            String result = instance.doOCR(image);
            System.out.println(result);
        } catch (TesseractException e) {
            e.printStackTrace();
        }


    }
}