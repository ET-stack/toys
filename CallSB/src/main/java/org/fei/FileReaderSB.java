package org.fei;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderSB {

    public static List<String> getSbStr(String filePath) {
        List<String> SBList = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(filePath));
            String str;
            while ((str = in.readLine()) != null) {
                SBList.add(str);
            }
            System.out.println(str);
        } catch (IOException e) {
            System.err.println(e);
        }
        return SBList;
    }


}
