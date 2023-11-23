
package com.example;

public class Appliance {
    private String brand;
    private String model;
    private int powerUsage;

    // Attributes
    // TODO: Declare common attributes for electronic devices, such as brand and model and powerUsage.

    // Constructor
    public Appliance(String brand, String model, int powerUsage) {
        // TODO: Initialize all attributes
        this.brand = brand;
        this.model = model;
        this.powerUsage = powerUsage;
    }

    // Getters
    // TODO: Implement getters for brand, model, and powerUsage
    public String getBrand(){
        return this.brand;
    }
    public String getModel(){
        return this.model;
    }
    public int powerUsage(){
        return this.powerUsage;
    }
    public void setBrand(String newBrand){
        this.brand = newBrand;
    }
    public void setModel(String newModel){
        this.model = newModel;

    }
    public void setPowerUsage(int newPowerUsage){
        this.powerUsage = newPowerUsage;
    }
    public String displayInfo(){
        return "Brand: " + this.brand + ", " + "Model: " + this.model + ", " + "Power Usage: " + this.powerUsage + " Watts";
    }




}

