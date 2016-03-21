package com.itrex.utils;

import com.google.common.base.Joiner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: nikolai.pashkevich.
 */
@Component
public class FileHelper {

    private static final Logger log = LoggerFactory.getLogger(FileHelper.class);

    @Value("${filesDirName} ?: 'files'}")
    private String filesDirName;


    private String[] readCSVFileNames(String rootDir) {
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

    public static void writeToFile(String fileName, List<String> listToWrite){
        BufferedWriter out = null;
        try {
            FileWriter fstream = new FileWriter(fileName, false);
            out = new BufferedWriter(fstream);
            out.write(Joiner.on(System.lineSeparator()).join(listToWrite));
        }
        catch (IOException e) {
            log.error("Error: " + e.getMessage());
        }
        finally {
            if(out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    log.error("Error: " + e.getMessage());
                }
            }
        }
    }

}
