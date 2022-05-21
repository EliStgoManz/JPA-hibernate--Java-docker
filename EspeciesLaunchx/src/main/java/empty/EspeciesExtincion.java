package empty;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EspeciesExtincion {
    @Id
    @Column(name = "idEspecie")
    private int idEspecie;
    @Basic
    @Column(name = "nombreEspecie")
    private String nombreEspecie;

    public int getIdEspecie() {
        return idEspecie;
    }

    public void setIdEspecie(int idEspecie) {
        this.idEspecie = idEspecie;
    }

    public String getNombreEspecie() {
        return nombreEspecie;
    }

    public void setNombreEspecie(String nombreEspecie) {
        this.nombreEspecie = nombreEspecie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EspeciesExtincion that = (EspeciesExtincion) o;

        if (idEspecie != that.idEspecie) return false;
        if (nombreEspecie != null ? !nombreEspecie.equals(that.nombreEspecie) : that.nombreEspecie != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEspecie;
        result = 31 * result + (nombreEspecie != null ? nombreEspecie.hashCode() : 0);
        return result;
    }
}
