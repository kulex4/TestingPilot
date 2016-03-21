package com.itrex.utils;

import org.springframework.beans.factory.annotation.Value;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: nikolai.pashkevich.
 */
public class FileHelper {

    @Value("#{config['filesDirName'] ?: 'files'}")
    private String filesDirName;


    public String[] readCSVFileNames(String rootDir){
        List<String> files = new ArrayList<>();

        if(rootDir == null){
            rootDir = filesDirName;
        }

        File folder = new File(rootDir);
        File[] listOfFiles = folder.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".csv");
            }
        });

        for (File file: listOfFiles) {
            if (file.isFile()) {
                files.add(file.getAbsolutePath());
            }
        }
        String[] finalList = new String[files.size()];
        return files.toArray(finalList);
    }

    public String[] readCSVFileNames(){
        return readCSVFileNames(filesDirName);
    }
}
