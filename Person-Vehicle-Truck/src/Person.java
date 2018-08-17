/** Person.java
 *  This class defines a Person's attributes.
 */
public class Person {
   private String name;

   /** Empty constructor 
    */
   public Person () {
	   this.name = "no name";
   }

   /** Argument constructor
    * @param theName (String) - name for this Person
    */
   public Person(String theName) {
      this.name = theName;
   }

   /** Copy constructor 
    * @param other (Person) - object whose attributes will be used to
    *  create this new Person instance
    */
   public Person(Person other) {
      if (other != null) {
         this.name = other.getName();
      }
      else{
         try{
            throw new Exception();
         }catch (Exception ex){
         }
      }
   }

   /** Method to print the attributes of this Person instance
    * @return (String) - user displayable String describing this Person
    */
   public String toString() {
       return this.name;
   }

   /** Equals method to compare this Person to another Object. 
    *  @param other - Object being compared to 'this'
    *  @return - TRUE if other contains the same information as 'this'
    */
   public boolean equals(Object other) {
	      if (this == other) {
	          return true;
          }
          else {
	          return false;
          }
   }
   
   public String getName() {
	      return this.name;
   }

   public void setName(String theName) {
	      this.name = theName;
   }
}
