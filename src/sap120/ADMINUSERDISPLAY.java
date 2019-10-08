/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sap120;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Vatsal Chheda
 */
public class ADMINUSERDISPLAY {
    String line = null;
    int c;
    public void  findIt(String code) {
        try{
            File f1 = new File("C:\\Users\\Vatsal Chheda\\Desktop\\Local Disk\\OOPM PROJECT\\SAP120\\Info.txt");
            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                if (line.contains(code)) {

                    Scanner input=new Scanner(line).useDelimiter("-|\n");
                    String username = input.next();
                    String company = input.next();
                    String regNo = input.next().substring(0);
                    String insurance = input.next();
                    String fines = input.nextLine().substring(1);
                    System.out.println("Owner name: "+username+"\nCompany model: "+company+"\nRegistration number: "+regNo+"\nInsurance status: "+insurance+"\nFine payment status: "+fines);    
                    new GUIADMINMODIFY1(username,company,regNo,insurance,fines).setVisible(true);
                    c++;
                    ADMINDELETE ad = new ADMINDELETE();
                    ad.deleteIt(code);
                }



            }
            if(c==0)
            {
                System.out.println("Registration number not found!\nPlease contact Admin!");
                JOptionPane.showMessageDialog(null,"Invalid Car Details","Car Not Found", JOptionPane.ERROR_MESSAGE);
            }
                fr.close();
                br.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
