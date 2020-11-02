package dev.lgmarcos.practicacrudhibernate.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author lgmar
 */
@Entity
@Table(name = "persona")
public class Persona {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombre", length = 100)
    private String nombre;
    
    @Column(name = "persona", length = 100)
    private String persona;

    public Persona() {
    }

    public Persona(String nombre, String persona) {
        this.nombre = nombre;
        this.persona = persona;
    }

    public Persona(Long id, String nombre, String persona) {
        this.id = id;
        this.nombre = nombre;
        this.persona = persona;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", persona=" + persona + '}';
    }
}
