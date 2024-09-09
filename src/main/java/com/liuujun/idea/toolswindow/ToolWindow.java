package com.liuujun.idea.toolswindow;

import com.intellij.openapi.ui.popup.ComponentPopupBuilder;
import com.intellij.openapi.ui.popup.JBPopup;
import com.intellij.openapi.ui.popup.JBPopupFactory;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ToolWindow extends JPanel {

    public ToolWindow(){
        JButton btn1 = new JButton("弹出窗口");

        btn1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JBPopupFactory jbPopupFactory = JBPopupFactory.getInstance();

                JPanel jPanel = new JPanel();
                jPanel.add(new JLabel("Test Popup!"));

                ComponentPopupBuilder componentPopupBuilder = jbPopupFactory.createComponentPopupBuilder(jPanel, null);
                JBPopup popup = componentPopupBuilder.createPopup();
                popup.showInFocusCenter();
            }
        });

        add(btn1);
    }
}
