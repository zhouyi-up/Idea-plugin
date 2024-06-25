package com.liuujun.idea.configurable;

import com.intellij.util.ui.FormBuilder;

import javax.swing.*;

public class DemoConfigurableView {

    private final JPanel mainPanel;

    public DemoConfigurableView(){
        mainPanel = FormBuilder.createFormBuilder()
                .getPanel();
    }

    public JPanel getPanel(){
        return mainPanel;
    }
}
