package com.sena.microservicesEdwin.sv.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="mascotas")
public class Mascotas {

    @Id
    @Column
    private Integer id_mascotas;
    @Column
    private String nombre;
    @Column
    private Integer edad;
    @Column
    private String condiciones;


    public Integer getId_mascotas() {
        return id_mascotas;
    }

    public void setId_mascotas(Integer id_mascotas) {
        this.id_mascotas = id_mascotas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(String edad) {this.edad = Integer.valueOf(edad);}

    public String getCondiciones() {return condiciones;
    }

    public void setCondiciones(String condiciones) {
        this.condiciones = condiciones;
    }

}


