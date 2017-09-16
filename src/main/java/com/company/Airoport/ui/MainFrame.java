package com.company.Airoport.ui;


import com.company.Airoport.model.Airoport;
import com.company.Airoport.ui.forms.AiroportForm;
import com.company.Airoport.ui.forms.RouteForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


@org.springframework.stereotype.Component
public class MainFrame extends JFrame {
    @Autowired
   // private RouteForm routeForm;

    public MainFrame(AiroportForm airoportForm) throws HeadlessException {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(400, 400));

        setContentPane(airoportForm.$$$getRootComponent$$$());
                airoportForm.updateData();

        pack();
    }


    }

