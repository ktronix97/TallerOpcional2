/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.MappedSuperclass;

/**
 * clase EmpleadoFactory
 *
 * @author Dalia Romero
 * @version 1.0
 */
@MappedSuperclass
@Inheritance(strategy
        = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name
        = "tipo")
public abstract class EmpleadoFactory {

    @Id
    private int identificador;
    private String nombre;

    public EmpleadoFactory() {
    }

    /**
     *
     * @param identificador, identica al empleado
     * @param nombre , nombre del empleado
     */
    public EmpleadoFactory(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
    }
    

    /**
     * @return el identificador del empleado
     */
    public int getIdentificador() {
        return identificador;
    }

    /**
     * @param identificador 
     */
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    /**
     * @return nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularSalario();
}
