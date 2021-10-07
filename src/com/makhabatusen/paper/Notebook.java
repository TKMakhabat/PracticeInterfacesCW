package com.makhabatusen.paper;

public class  Notebook  implements Paper{
    @Override
    public void getFormat(String format) {
        System.out.printf("\nThe format of Notebook is: %s ", format);
    }
}
