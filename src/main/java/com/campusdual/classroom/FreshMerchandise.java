package com.campusdual.classroom;

import com.campusdual.classroom.Merchandise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int i, String c, String s, int i1, Date date) {
        super(name, uniqueId, responsibleId, i, c, s, i1, date);  // Usar el constructor que acepta fecha de caducidad
    }

    public String getFormattedDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return sdf.format(date);
    }

    public void printSpecificData() {
        System.out.println(getSpecificData());
    }

    @Override
    public Object getSpecificData() {
        return "Name: " + this.getName() +
                " UniqueID: " + this.getUniqueId() +
                " ResponsibleId: " + this.getResponsibleId() +
                " Quantity: " + this.getQuantity() +
                " Location: " + this.getLocation() +
                " Expiration Date: " + getFormattedDate(this.getExpirationDate()) +
                " Area: " + this.getArea() +
                " Zone: " + this.getZone() +
                " Shelf: " + this.getShelf();
    }
}
