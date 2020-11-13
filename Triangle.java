
/**.
* Triangle

* @author  Miguel Duarte
* @version 1.0
* @since   2020-11-12
*/
public class Triangle {
  /**
   *.
  */
  public static void main(String[] args) {
    // Create scanner object
    Scanner userInput = new Scanner(System.in);
    
    //Ask the user for the side lengths
    System.out.print("Please enter the first side length: ");
    double sideA = userInput.nextDouble();
    
    System.out.print("Please enter the second side length: ");
    double sideB = userInput.nextDouble();
    
    System.out.print("Please enter the third side length: ");
    double sideC = userInput.nextDouble();
    
    TriangleClass triangleClass = new TriangleClass();
    
    triangleClass.SetSides(sideA, sideB, sideC);
    
    double semiPer = triangleClass.getSemiPer(); 
    
    // Output the semiPer and Area
    System.out.println("The SemiPerimeter is : " + semiPer + " units.");
    System.out.println("The Area is : " + triangleClass.getArea(semiPer) + " units^2.");
    System.out.println("It is an " + triangleClass.getName(sideA, sideB, sideC) + " Triangle.");
  }
}