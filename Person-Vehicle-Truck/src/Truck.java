/**
 * Created by thatp on 8/27/2017.
 */
public class Truck extends Vehicle {

    private String manufacturer;
    private int cylinders;
    private Person owner;
    private double towingCap;
    private double loadCap;

    public Truck(){
        this.manufacturer = null;
        this.cylinders = 0;
        this.owner = null;
        this.towingCap = 0;
        this.loadCap = 0;
    }

    public Truck( String manufacturer, int cylinders, Person owner, double towingCap, double loadCap){
        this.manufacturer = manufacturer;
        this.cylinders = cylinders;
        this.owner = owner;
        this.towingCap = towingCap;
        this.loadCap = loadCap;
    }

    public Truck(Truck other){
        if (other != null) {
            this.manufacturer = other.getManufacturer();
            this.cylinders = other.getCylinders();
            this.owner = other.getOwner();
            this.towingCap = other.getTowingCap();
            this.loadCap = other.getLoadCap();
        }
        else{
            try{
                throw new Exception();
            }catch (Exception ex){
            }
        }

    }

    public double getTowingCap(){
        return this.towingCap;
    }

    public void setTowingCap(double towingCap){
        this.towingCap = towingCap;
    }

    public double getLoadCap(){
        return this.loadCap;
    }

    public void setLoadCap(double loadCap){
        this.loadCap = loadCap;
    }

}
