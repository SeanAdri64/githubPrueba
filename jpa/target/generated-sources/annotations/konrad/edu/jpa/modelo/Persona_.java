package konrad.edu.jpa.modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import konrad.edu.jpa.modelo.Ciudad;
import konrad.edu.jpa.modelo.TipoDocumento;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-11T13:59:28")
@StaticMetamodel(Persona.class)
public class Persona_ { 

    public static volatile SingularAttribute<Persona, String> apellidos;
    public static volatile SingularAttribute<Persona, Ciudad> ciudadNacimiento;
    public static volatile SingularAttribute<Persona, TipoDocumento> tipoDocumento;
    public static volatile SingularAttribute<Persona, Date> fechaNacimiento;
    public static volatile SingularAttribute<Persona, String> documento;
    public static volatile SingularAttribute<Persona, Integer> id;
    public static volatile SingularAttribute<Persona, String> nombres;

}