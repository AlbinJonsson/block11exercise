package oopd_gu_chalmers.controller;

import oopd_gu_chalmers.polygonModel.PolygonModel;
import oopd_gu_chalmers.polygonModel.adapter.PolygonFactory;
import oopd_gu_chalmers.view2d.PolygonView;

import javax.swing.*;
import java.util.ArrayList;

public class PolygonController extends JFrame {
    private JFrame frame;
    private PolygonModel model;
    private PolygonView view;

    public PolygonController(PolygonModel model, PolygonView view){
        model.polygons = new ArrayList<>(10);

        model.polygons.add(oopd_gu_chalmers.polygonModel.adapter.PolygonFactory.createSquare(50,50));
        model.polygons.add(oopd_gu_chalmers.polygonModel.adapter.PolygonFactory.createTriangle(100,100));
        model.polygons.add(oopd_gu_chalmers.polygonModel.adapter.PolygonFactory.createRectangle(50,150));

    }

    public static void main(String[] args) {

    }
}


