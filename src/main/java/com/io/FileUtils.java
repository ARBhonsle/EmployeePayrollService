package com.io;

import java.io.File;

public class FileUtils {
    public static boolean deleteFiles(File deleteFiles){
        File[] allContent = deleteFiles.listFiles();
        if(allContent!=null){
            for(File file:allContent){
                deleteFiles(file);
            }
        }
        return deleteFiles.delete();
    }
}
