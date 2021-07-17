package ru.gb;

public class Car extends Vehicle{
private int horsePowers;
private String number;

    public Car(int VIN, String color, String kind, int horsePowers, String number ){
        super(VIN, color, kind);
        this.horsePowers=horsePowers;
        this.number=number;
    }
    public Car(){};
    public Car( int VIN){
        this.VIN=VIN;
    }
    public void getInfo(){
        System.out.println(VIN);
        System.out.println(color);
        System.out.println(kind);
        System.out.println(horsePowers);
        System.out.println(number);
    }
    public String toString(){
        return VIN+ "";
    }
}
