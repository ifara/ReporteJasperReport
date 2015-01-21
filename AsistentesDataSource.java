package reportes;

import java.util.ArrayList;
import java.util.List;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

/**
 *
 * @author Sandra
 */
public class AsistentesDataSource implements JRDataSource{

    private List<Asistentes> listaAsistentes = new ArrayList<Asistentes>();
    private int indiceParticipanteActual = -1;
    
    @Override
    public boolean next() throws JRException {
       return ++indiceParticipanteActual < listaAsistentes.size();
    }
    
    public void addAsistente(Asistentes Asistente){

        this.listaAsistentes.add(Asistente);

    }

    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
       Object valor = null;

        if ("id".equals(jrf.getName())){

            valor = listaAsistentes.get(indiceParticipanteActual).getId();

        }
        else if ("nombre".equals(jrf.getName())){

            valor = listaAsistentes.get(indiceParticipanteActual).getNombre();

        }
        else if ("apellidos".equals(jrf.getName())){

            valor = listaAsistentes.get(indiceParticipanteActual).getApellidos();

        }
        else if ("dni".equals(jrf.getName())){
            valor = listaAsistentes.get(indiceParticipanteActual).getDni();
        }

        return valor;
    }
    
}
