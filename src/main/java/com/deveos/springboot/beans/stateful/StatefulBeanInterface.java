package com.deveos.springboot.beans.stateful;

import java.util.ArrayList;

//@Remote
public interface StatefulBeanInterface {
    public void addProductItem(String p) ;
    public void removeProductItem(String p) ;
    public void setPanierItems(ArrayList<String> Items) ;
    public ArrayList<String> getPanierItems() ;
}
