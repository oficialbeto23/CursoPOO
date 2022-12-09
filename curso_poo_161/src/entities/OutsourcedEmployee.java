/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author CHFS
 */
public class OutsourcedEmployee extends Employee  {
    private Double additionalCharge;
    
    public OutsourcedEmployee(){
        super();
    }

    public OutsourcedEmployee( String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
    
    @Override
    public double payment(){
        return super.payment()+1.1*additionalCharge;
    }
    
    
    
}
