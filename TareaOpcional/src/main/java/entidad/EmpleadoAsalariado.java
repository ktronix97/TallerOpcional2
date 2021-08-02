/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

/**
 *
 * @author Dalia Romero
 * @version 1.0
 */
@Entity
@DiscriminatorValue("empAsalariado")

public class EmpleadoAsalariado extends EmpleadoFactory {

    private double salario_semanal;

    public EmpleadoAsalariado() {
    }

    /**
     * inicializa la variable de tipo EmpAsalariado
     *
     * @param salario_semanal
     * @param identificador
     * @param nombre
     */
    public EmpleadoAsalariado(double salario_semanal, int identificador, String nombre) {
        super(identificador, nombre);
        this.salario_semanal = salario_semanal;
    }

    /**
     * @return the salario_semanal
     */
    public double getSalario_semanal() {
        return salario_semanal;
    }

    /**
     * @param salario_semanal the salario_semanal to set
     */
    public void setSalario_semanal(double salario_semanal) {
        this.salario_semanal = salario_semanal;
    }

    /**
     *
     * @return el salario del empleado.
     */
    @Override
    public double calcularSalario() {
        return salario_semanal;
    }

}
