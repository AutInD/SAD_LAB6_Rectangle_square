package com.solid.lsp;

public class Square extends Shape {

    Square(int side) {
        this.setSide(side);
    }

    public int getSide() {
        return super.getHeight();
    }

    @Override
    public int getArea() {
        return super.getArea();
    }
 
   
    public void setSide(int side) {
        super.setWidth(side);
        super.setHeight(side);
    }
    
    
    
}
