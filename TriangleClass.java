import java.util.*;
import java.lang.Math;
public class TriangleClass {

  private double sideLength1;
  private double sideLength2;
  private double sideLength3;

  public TriangleClass() {
    sideLength1 = 1;
    sideLength2 = 1;
    sideLength3 = 1;
  }
  
  public void SetSides(double sideA, double sideB, double sideC) {
    sideLength1 = sideA;
    sideLength2 = sideB;
    sideLength3 = sideC;
  }
  
  public double getSemiPer() {
    
    // Delcare variables
    double semiPerimeter = 0;
    
    // Calculate 
    semiPerimeter = (sideLength1 + sideLength2 + sideLength3) / 2;
    
    return semiPerimeter;
  }

  public double getArea(double semiPerimeter) {
    
    // Delcare variables
    double Area = 0;
    
    // Calculate
    Area = Math.sqrt(semiPerimeter * (semiPerimeter - sideLength1) * (semiPerimeter - sideLength2) * (semiPerimeter * sideLength3));
    
    return Area;
  }
  
  public String getName(double sideLength1, double sideLength2, double sideLength3) {
    //declare variables
    String name = "";
    
    //if all 3 sides are equal - equilateral
    //if only 2 sides are equal - isosceles
    //if no sides are equal - scalene
    if (sideLength3 == sideLength1 && sideLength3 == sideLength2) {
      name = "Equilateral";
    } else if (sideLength3 == sideLength2 || sideLength3 == sideLength2 || sideLength1 == sideLength2)  {
      name = "Isosceles";
    } else  {
      name = "Scalene";
    }
    
    //return the name
    return name;
  }
}