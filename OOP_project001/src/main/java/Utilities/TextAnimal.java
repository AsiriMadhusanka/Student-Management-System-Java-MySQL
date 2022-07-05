/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;
import Models.Animal;
/**
 *
 * @author IT19785370
 */
public class TextAnimal 
{
  public static void main(String args[])
  {
      Animal sampleAnimal=new Animal();
      sampleAnimal.Name = "cat";
      sampleAnimal.Species="Canis";
      sampleAnimal.Genus="Familiaris";
      sampleAnimal.PrintName();
      sampleAnimal.generateScientificName();
      System.out.println(" Sientific name is :"+sampleAnimal.generateScientificName());
  }
}
