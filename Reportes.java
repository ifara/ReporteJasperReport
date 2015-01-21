/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reportes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

/**
 *
 * @author Sandra
 */
public class Reportes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        InputStream inputStream = null;
        JasperPrint jasperPrint= null;
        AsistentesDataSource datasource = new AsistentesDataSource();
        
        
        for(int i = 0; i<=5; i++){
            
            Asistentes asist;
            asist = new Asistentes(i, "AsistenteNombre de "+i,"AsistenteApellidos de "+i, "Asistente dni de "+i);
            datasource.addAsistente(asist);
            
        }
        
       try {
            inputStream = new FileInputStream ("src/reportes/reporte01.jrxml");
        } catch (FileNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Error al leer el fichero de carga jasper report "+ex.getMessage());
        }
         
        try{
            JasperDesign jasperDesign = JRXmlLoader.load(inputStream);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport, null, datasource);

            JasperExportManager.exportReportToPdfFile(jasperPrint, "src/reportes/reporte01.pdf");
            
           
        }catch (JRException e){
            JOptionPane.showMessageDialog(null,"Error al cargar fichero jrml jasper report "+e.getMessage());
        }
        

    }
    
}
