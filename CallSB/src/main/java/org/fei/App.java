package org.fei;

import java.io.File;
import java.util.List;

/**
 * Hello SB!
 *
 */
public class App {

    public static void main( String[] args ) throws InterruptedException {
        String root = System.getProperty("user.dir");
        String FileName="SB.txt";
        String filePath = root+ File.separator+File.separator+FileName;
        List<String > sbList = FileReaderSB.getSbStr(filePath);
        RobotSB robotSB = new RobotSB();
        for (String s: sbList){
            robotSB.past(s);
            robotSB.enter();
            //控制频率
            Thread.sleep(2000);
        }
        System.out.println(sbList);
    }
}
