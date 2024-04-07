/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salariofinal;
import javax.swing.JOptionPane;


//******************



public class SalarioFinal {
private String nombreEmpleado;
private double cedula;
private int salarioBasico;
private double diasLaborados;
private int ventaMes;
private int prestamos;

//CONSTRUCTOR*******

    public SalarioFinal(String nombreEmpleado, double cedula, int salarioBasico, double diasLaborados, int ventaMes, int prestamos) {
        this.nombreEmpleado = nombreEmpleado;
        this.cedula = cedula;
        this.salarioBasico = salarioBasico;
        this.diasLaborados = diasLaborados;
        this.ventaMes = ventaMes;
        this.prestamos = prestamos;
    }
//GETTERS******

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public double getCedula() {
        return cedula;
    }

    public int getSalarioBasico() {
        return salarioBasico;
    }

    public double getDiasLaborados() {
        return diasLaborados;
    }

    public int getVentaMes() {
        return ventaMes;
    }

    public int getPrestamos() {
        return prestamos;
    }
    //LETTERS********

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public void setCedula(double cedula) {
        this.cedula = cedula;
    }

    public void setSalarioBasico(int salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public void setDiasLaborados(double diasLaborados) {
        this.diasLaborados = diasLaborados;
    }

    public void setVentaMes(int ventaMes) {
        this.ventaMes = ventaMes;
    }

    public void setPrestamos(int prestamos) {
        this.prestamos = prestamos;
    }
    //**************
    
    public static void main(String[] args) {
     String cedula = JOptionPane.showInputDialog("Ingrese la cedula del empleado: ");
     String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado: ");
     double salarioBasico = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario basico del empleado: "));
     int diasLaborados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los dias laborados del empleado: "));
     double ventaMes = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las ventas del mes del empleado: "));
     double prestamos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los descuentos por prestamos del empleado: "));
     
      // OPERACIONES*******
      
      double sueldoDevengado = salarioBasico * diasLaborados / 30;
      double salarioMinimo = 1300000;
      double auxilioTransporte = 0;
      if (salarioBasico <= salarioMinimo * 2){
        auxilioTransporte = 162000 * diasLaborados / 30;
    }
      double comisionesVentas =  ventaMes * 0.2;
      double totalDevengado = sueldoDevengado + comisionesVentas;
      double totalPrestamos = prestamos;
      double salarioNeto = totalDevengado - totalPrestamos;
        System.out.println("La cedula del empleado es: "+ cedula);
        System.out.println("El nombre del empleado es: "+ nombre);
        System.out.println("El salario basico del empleado es: "+ salarioBasico);
        System.out.println("El valor del auxilio de transporte del empleado es: "+ auxilioTransporte);
        System.out.println("Las comisiones del empleado es: "+ comisionesVentas);
        System.out.println("Los prestamos del empleado es: "+ totalPrestamos);
        System.out.println("El salario total a recibir del empleado es: "+ salarioNeto);
              
    }
    
}
