package edu.jpa.TABLE_PER_HIERARCHY.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

// valoarea Customer stocata in coloana TYPE ajuta frameworkul
// sa stie sa instantieze clasa Customer si nu alta care mosteneste clasa Person
@Entity
@DiscriminatorValue("Customer")
public class Customer extends Person {
    private double discount;

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
