/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sap120;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Vatsal Chheda
 */
public class ADMINDELETE {
      List<String> lines = new ArrayList<String>();
    String line = null;
    String reqdLine=null;
    int c=0;

    public void  deleteIt(String code) {
        try {
            File f1 = new File("C:\\Users\\Vatsal Chheda\\Desktop\\Local Disk\\OOPM PROJECT\\SAP120\\Info.txt");
            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                reqdLine=line;
                if (line.contains(code)){
                    System.out.println("Details "+line +" deleted");
                    line="";
                    c++;


            }
            if(line!=""){
            lines.add(line+"\n");}


            }

            if(c==0)
            {
                System.out.println("Registration number not found!");
                JOptionPane.showMessageDialog(null,"Car Not Found","Invalid Details", JOptionPane.ERROR_MESSAGE);
            }
            fr.close();
            br.close();

            FileWriter fw = new FileWriter(f1);
            BufferedWriter out = new BufferedWriter(fw);
            for(String s : lines)
                out.write(s);
            out.flush();
            out.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
