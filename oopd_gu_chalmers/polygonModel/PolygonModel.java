package oopd_gu_chalmers.polygonModel;

import oopd_gu_chalmers.polygonModel.adapter.Polygon;
import oopd_gu_chalmers.polygonModel.polygon.PolygonFactory;

import java.awt.*;
import java.util.ArrayList;

public class PolygonModel {
    public ArrayList<Polygon> polygons;
    private boolean direction;
    private int ticker;

    public PolygonModel(){

    }

    public void update(){
        ticker++;
        int value = direction ? 10 : -10;
        for (Polygon p: polygons){
            p.updateCenter(p.getCenterX()+value, p.getCenterY()+value);
        }
        if (ticker > 10) {
            direction = !direction;
            ticker = 0;
        }
    }
}
