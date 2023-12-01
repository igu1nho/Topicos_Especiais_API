package com.cursoandroid.navigationdrawer.ui.principal;

public class Item {

    private String itemName;
    private String registro;
    private int itemImage;

    public Item(String itemName, int itemImage, String registro) {
        this.itemName = itemName;
        this.itemImage = itemImage;
        this.registro = registro;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public int getItemImage() {
        return itemImage;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }
}
