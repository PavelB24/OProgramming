package ru.gb;

public class Truck extends Vehicle{
    private int mass;
    private int length;
    public Truck(int VIN, String color, String kind, int mass, int length){
        super(VIN, color, kind);
        this.mass=mass;
        this.length=length;
    }
    public void setMass( int mass) {
        this.mass=mass;
    }
    public Integer getMass(){
        return mass;
    }
    public void setLength( int length) {
        this.length=length;
}   public Integer getLenght(){
        return length;
    }
}
