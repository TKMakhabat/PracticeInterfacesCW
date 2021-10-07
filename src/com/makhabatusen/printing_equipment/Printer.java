package com.makhabatusen.printing_equipment;

public class Printer  implements PrintingEquipment{
    private String manufacture;

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public Printer(String manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public void getPrintingColor(String color) {
        System.out.printf("\nThe printing color: %s", color);
    }
}
