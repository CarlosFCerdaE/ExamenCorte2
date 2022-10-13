/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author labc205
 */
public class Empleado {
    private int Codigo;
    private String Nombre;
    private String Apellidos;
    private String Cargo;
    private double Salario;

    public Empleado() {
    }

    public Empleado(int Codigo, String Nombre, String Apellidos, String Cargo, double Salario) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Cargo = Cargo;
        this.Salario = Salario;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }
}
