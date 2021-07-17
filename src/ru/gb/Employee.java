package ru.gb;

public class Employee extends Human {
    private static int EmployeeCounter=0;
    private String name;
    private String position;
    private String email;
    private long phoneNumber;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, long phoneNumber, int salary, int age){
    this.name=name;
    this.position=position;
    this.email=email;
    this.phoneNumber=phoneNumber;
    this.salary=salary;
    this.age=age;
    EmployeeCounter++;

}
//    public Employee(){};
    public void getInfo(){
        System.out.println("Имя: " +name );
        System.out.println("Должность: " +position );
        System.out.println("Е-мейл: " +email );
        System.out.println("Номер телефона: " +phoneNumber );
        System.out.println("Зарплата " +salary );
        System.out.println("Возраст " +age );
    }

    public Integer getAge(){
        return age;
    }
    @Override
    public void saySomething(){
        System.out.println("Привет, я тут работаю за еду");
    }

    @Override
    public void toDoSomething(){
        System.out.println("*Работник поковырялся в носу");
    }

    public void setName(String name){
        this.name=name;
    }

    public void setPosition(String position){
        this.position=position;}

    public void setEmail(String email){
        this.email=email;}

    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber=phoneNumber;}

    public void setSalary(int salary){
        this.salary=salary;}

    public void setAge( int age){
        this.age=age;}


    public static Integer getCount(){
        return EmployeeCounter;
    }
}

