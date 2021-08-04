/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
/**
 *
 * @author Dalia Romero
 * @version 1.0 
 */

import Entidad.EmpleadoAsalariado;
import Entidad.EmpleadoHora;
import Entidad.EmpleadoFactory;
import persistencia.PersistenciaEmpleado;
import java.util.List;

public class Control {

    private final PersistenciaEmpleado PERSISTENCIA;

    public Control() {
        this.PERSISTENCIA = new PersistenciaEmpleado();
    }

    /**
     * agrega un empleado de tipo asalariado.
     *
     * @param id, identificador del empleado
     * @param nombre, nombre del empleado
     * @param salarioSemanal, salario del empleado
     * @return el empleado agregadoa la base de datos.
     */
    public EmpleadoFactory agregarAsalariado(int id, String nombre, double salarioSemanal) {
        EmpleadoFactory empleado = new EmpleadoAsalariado(salarioSemanal, id, nombre);
        PERSISTENCIA.agregarEmpleado(empleado);
        return empleado;
    }

    /**
     * agrega un empleado por horas a la base de datos
     *
     * @param id, identificador del empleado
     * @param nombre , nombre del empleado
     * @param valorHora , valor por cada hora trabajada para el empleado
     * @param horas_trabajadas, numero de horas que ha trabajado
     * @return retorna el empleado que agregamos.
     */
    public EmpleadoFactory agregarEmpHoras(int id, String nombre, double valorHora, int horas_trabajadas) {
        EmpleadoFactory empleado = new EmpleadoHora(id, nombre, valorHora, horas_trabajadas);
        PERSISTENCIA.agregarEmpleado(empleado);
        return empleado;
    }

    /**
     *
     * @return la nomina de la semana segun los datos de la base de datos
     */
    public double calcularSalario() {
        double salary_all_employees = 0;
        List<EmpleadoFactory> empleados = PERSISTENCIA.consultarEmpleados();

        for (EmpleadoFactory empleado : empleados) {
            salary_all_employees = salary_all_employees + empleado.calcularSalario();
        }

        return salary_all_employees;
    }

    /**
     *
     * @param identificador
     * @return el empleado que coincida con el mismo codigo
     */
    public EmpleadoFactory buscarEmpleado(int identificador) {
        EmpleadoFactory empleado = PERSISTENCIA.consultarEmpleado(identificador);
        return empleado;
    }
}
