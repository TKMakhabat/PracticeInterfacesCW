package com.makhabatusen.fabric;

public class Clothing  implements  Fabric{
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Clothing(int size) {
        this.size = size;
    }

    @Override
    public void getFabricName(String fabric) {
        System.out.printf("\nFabric: %s", fabric);
    }
}
