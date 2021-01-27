package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> figures = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        figures.add(shape);
    }
    public void removeFigure(Shape shape) {
        figures.remove(shape);
        }

    public Shape getFigure(int n) {
        if(n > 0 && n < figures.size()){
            return figures.get(n);
        } else{
            return null;
        }
    }

    public List<Shape> showFigures(){
        for(Shape show: figures){
        System.out.println(figures);
        }

        return figures;
    }

    @Override
    public String toString() {
        return "ShapeCollector{" +
                "figures=" + figures +
                '}';
    }
    public List<Shape> getFigures(){
        return figures;
    }

}
