/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author s114e17
 */
public class Moto extends Vehiculo{
    private String color;

    public Moto(String color, String placa, String marca, double valorpeaje) {
        super(placa, marca, valorpeaje);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Moto{" + " color= " + color + " ,placa= " + super.getPlaca()+ ", marca=" + super.getMarca()+ ", valorpeaje=" + super.getValorpeaje();
    }

   
    
    
    
}
