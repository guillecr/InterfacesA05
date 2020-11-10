package librerias;

import modelos.Doctore;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArchivoText {
    
    public List<Doctore> leer(String rutaArchivo) {
        List<Doctore> personas_al = new ArrayList<Doctore>();
        File f = null;
        FileReader fr = null;
        BufferedReader br = null;
        String registro = null;
        String[] parte;
        try {
            f = new File(rutaArchivo);
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            while ((registro = br.readLine()) != null) {
                parte = registro.split(";");
                Doctore alumno = new Doctore(parte[0], parte[1], parte[2], parte[3], parte[4]);
                
                personas_al.add(alumno);
            }
        } catch (Exception e) {
            personas_al = null;
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (IOException e) {
                personas_al = null;
            }
        }
        return personas_al;
    }

}
