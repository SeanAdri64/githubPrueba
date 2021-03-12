package konrad.edu.jpa.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import konrad.edu.jpa.modelo.Persona;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-11T13:59:28")
@StaticMetamodel(TipoDocumento.class)
public class TipoDocumento_ { 

    public static volatile CollectionAttribute<TipoDocumento, Persona> personaCollection;
    public static volatile SingularAttribute<TipoDocumento, String> sigla;
    public static volatile SingularAttribute<TipoDocumento, Integer> id;
    public static volatile SingularAttribute<TipoDocumento, String> nombre;

}