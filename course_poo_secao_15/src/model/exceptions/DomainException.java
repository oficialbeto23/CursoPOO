/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.exceptions;

public class DomainException extends RuntimeException{
    
    private static final long serialVersionUID = 1L;
    
    public DomainException(String msg){
        super(msg);
    }
    
}
