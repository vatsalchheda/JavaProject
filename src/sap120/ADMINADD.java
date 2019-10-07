/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sap120;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
/**

/**
 *
 * @author Vatsal Chheda
 */
public class ADMINADD 
{


    ADMINADD(String OWNER, String MODELNAME, String REGNUMBER, String INSURANCE, String FINES) throws IOException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Files.write(Paths.get("C:\\Users\\Vatsal Chheda\\Desktop\\Local Disk\\OOPM PROJECT\\SAP120\\Info.txt"), (OWNER+"-"+MODELNAME+"-"+REGNUMBER+"-"+INSURANCE+"-"+FINES+"\n").getBytes(), StandardOpenOption.APPEND);

    }
}