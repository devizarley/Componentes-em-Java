package br.com.flap.activitys;

import java.io.Serializable;

public class Usuario implements Serializable {

    public String name1;
    public int years2;

    public Usuario(String name1, int years2) {
        this.name1 = name1;
        this.years2 = years2;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public int getYears2() {
        return years2;
    }

    public void setYears2(int years2) {
        this.years2 = years2;
    }
}
