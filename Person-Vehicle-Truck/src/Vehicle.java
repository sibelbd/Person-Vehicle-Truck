/** Vehicle.java
 * This class defines a Vehicle.  It stores information for the
 * manufacturer, number of cylinders, and owner information. 
 */
public class Vehicle {
   private String manufacturer;
   private int cylinders;
   private Person owner;

   /** Empty constructor 
    */
   public Vehicle () {
	      this.manufacturer = null;
	      this.cylinders = 0;
	      this.owner = null;
   }

   /** Argument constructor 
    *  @param man (String) - manufacturer of this Vehicle
    *  @param cylinders (int) - number of cylinders in this Vehicle
    *  @param owner (Person) - owner of this Vehicle
    */
   public Vehicle(String manufacturer, int cylinders, Person owner) {
	  this.manufacturer = manufacturer;
	  this.cylinders = cylinders;
	  this.owner = owner;
   }

   /** Copy constructor 
    * @param theObject (Vehicle) - object whose attributes will be used to
    *  create this new Vehicle instance
    */
   public Vehicle(Vehicle other) {
       if (other != null) {
           this.manufacturer = other.getManufacturer();
           this.owner = other.getOwner();
           this.cylinders = other.getCylinders();
       }
       else{
           try{
               throw new Exception();
           }catch (Exception ex){
           }
       }

   }

   /** Method to print the attributes of this Vehicle instance
    * @return (String) - user displayable String describing this Vehicle
    */
   public String toString() {
	  return this.manufacturer + ", " + Integer.toString(this.cylinders)+ " cylinders, " + this.owner;
   }

   /** Equals method to compare this Vehicle to another Object. 
    *  @param other - Object being compared to 'this'
    *  @return - TRUE if other contains the same information as 'this'
    */
   public boolean equals( Object other ) {
       if ( this == other ){
           return true;
       }
       else{
           return false;
       }
   }

   public String getManufacturer() {
       return manufacturer;
   }
   
   public void setManufacturer(String man) {
      manufacturer= man;
   }
   
   public int getCylinders() {
      return this.cylinders;
   }
      
   public void setCylinders(int cylinders) {
       this.cylinders= cylinders;
   }

   public Person getOwner() {
	   return owner;
   }
   
   public void setOwner(Person owner) {
      this.owner= owner;
   }
}
