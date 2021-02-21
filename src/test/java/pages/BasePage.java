package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getdriver(),this);
    }

    public  void printToTxt(String info,String fileName) {
        // you can add dynamic file name idForTxtFile
        String idForTxtFile = new SimpleDateFormat("dd.MM.yyyy_HH.mm.ss").format(new Date());
        File file = new File(fileName + idForTxtFile+".txt");
        try {
            FileWriter fw = new FileWriter(file, true);
            //instead you could only use:
            fw.write(info);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getLocalizedMessage());
        }
    }
}
