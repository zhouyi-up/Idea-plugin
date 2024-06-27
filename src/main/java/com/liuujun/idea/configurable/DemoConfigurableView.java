package com.liuujun.idea.configurable;

import com.intellij.util.ui.FormBuilder;

import javax.swing.*;

public class DemoConfigurableView {

    private final JPanel mainPanel;

    public DemoConfigurableView(){
        mainPanel = FormBuilder.createFormBuilder()
                .addLabeledComponent("属性A", new JTextField())
                .getPanel();
    }

    public JPanel getPanel(){
        return mainPanel;
    }
}
