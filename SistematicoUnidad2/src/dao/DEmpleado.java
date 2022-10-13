/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import modelos.Empleado;

/**
 *
 * @author labc205
 */
public class DEmpleado {
    private ArrayList <Empleado> listEmpleado = new ArrayList<>();

    public DEmpleado() {
    }
    
    public DEmpleado(ArrayList<Empleado> listEmpleado) {
        this.listEmpleado = listEmpleado;
    }

    public ArrayList <Empleado> getListEmpleado() {
        return listEmpleado;
    }

    public void setListEmpleado(ArrayList <Empleado> listEmpleado) {
        this.listEmpleado = listEmpleado;
    }
    
    public void agregarEmpleado(int codigo, String nombres, String apellidos, String cargo, double salario){
    
        Empleado emp = new Empleado (codigo,nombres,apellidos,cargo, salario);
        listEmpleado.add(emp);
    }
}
