/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import javax.lang.model.SourceVersion;

/**
 *
 * @author Dalia Romero
 * @version 1.0
 */
@Entity
@DiscriminatorValue("empleadoHora")

public class EmpleadoHora extends EmpleadoFactory {

    private double valorHora;
    private int horasTrabajadas;

    public EmpleadoHora() {
    }

    /**
     *
     * @param identificador
     * @param nombre
     * @param valorHora
     * @param horas_trabajadas
     */
    public EmpleadoHora(int identificador, String nombre, double valorHora, int horas_trabajadas) {
        super(identificador, nombre);
        this.valorHora = valorHora;
        this.horasTrabajadas = horas_trabajadas;
    }

    /**
     * @return el valor de las horas
     */
    public double getValor_horas() {
        return valorHora;
    }

    /**
     * @param valorHora
     */
    public void setValor_horas(double valorHora) {
        this.valorHora = valorHora;
    }

    /**
     * @return horas trabajadas
     */
    public float getHoras_trabajadas() {
        return horasTrabajadas;
    }

    /**
     * @param horasTrabajadas  horas trabajadas to set
     */
    public void setHoras_trabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    /**
     * calcula el salario de cada empleadode tipo empleado por horas.
     *
     * @return
     */
    @Override
    public double calcularSalario() {
        double salario = this.valorHora * this.horasTrabajadas;

        if (this.horasTrabajadas > 40) {
            salario = salario + 200000;
        }

        return salario;
    }

    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.RELEASE_16;
    }

 


}
