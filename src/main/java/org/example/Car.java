package org.example;

class Car {

    String color;
    String model;
    int year;

    private String name ;

    public void set_name(String name)
    {
        this.name = name;
    }

    public String get_Name()
    {
        return name;
    }

    public void start()
    {
        System.out.println("Starting");
    }

    public void stop()
    {
        System.out.println("Stopping");
    }

    public Car(String color, String model, int year)
    {
        this.color=color;
        this.model=model;
        this.year=year;
    }


}
