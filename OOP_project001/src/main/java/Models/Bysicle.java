/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author IT19785370
 */
public class Bysicle 
{
    public int Gear;
    public double Speed;
    
    public Bysicle(int Gear,double Speed)
    {
        this.Gear=Gear;
        this.Speed=Speed;
    }
    public void ApplyBreakes(double Decrement )
    {
     this.Speed-=Decrement;
    }
    public void Speeds(double Increment)
    {
        this.Speed+=Increment;
    }
    
    @Override
    public String toString()
    {
        return "Speed"+this.Speed+" Gear"+this.Gear;
    }
}
