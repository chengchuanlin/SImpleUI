package com.example.ccl.androidclass1_simpleui;

import android.content.Context;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by ccl on 2015/7/20.
 */
public class Utils {

    public static void writeFile(Context context,String text,String fileName) {
       try {
           FileOutputStream fos = context.openFileOutput(fileName, Context.MODE_APPEND);
           fos.write(text.getBytes());
           fos.close();

       }catch(FileNotFoundException e){
           e.printStackTrace();
       }catch(IOException e){
           e.printStackTrace();
       }
    }

    public static String readFile(Context context, String fileName) {
        try {
            FileInputStream fis = context.openFileInput(fileName);
                byte[] buffer =new byte[1024];
                fis.read(buffer);
                fis.close();
               return new String(buffer);

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        return "";
    }



}
