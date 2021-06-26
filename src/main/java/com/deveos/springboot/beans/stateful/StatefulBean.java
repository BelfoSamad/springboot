package com.deveos.springboot.beans.stateful;

import java.util.ArrayList;

//@Stateful(name = "PanierEJB")
public class StatefulBean implements StatefulBeanInterface {

    //this variable is maintained
    public ArrayList<String> PanierItems;

    @Override
    public void addProductItem(String p) {
        PanierItems.add(p);
    }

    @Override
    public void removeProductItem(String p) {
        PanierItems.remove(p);
    }

    @Override
    public void setPanierItems(ArrayList<String> Items) {
        this.PanierItems = Items;
    }

    @Override
    public ArrayList<String> getPanierItems() {
        return PanierItems;
    }
}
