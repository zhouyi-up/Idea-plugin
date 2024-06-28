package com.liuujun.idea.configurable;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.util.ui.FormBuilder;
import com.liuujun.idea.state.DemoSettingState;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class DemoConfigurableView {

    private final JPanel mainPanel;

    private JTextField paramA;
    private boolean isModify = false;

    public DemoConfigurableView(){

        paramA = new JTextField();
        paramA.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                isModify = true;
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                isModify = true;
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                isModify = true;
            }
        });

        DemoSettingState service = ApplicationManager.getApplication().getService(DemoSettingState.class);
        DemoSettingState.State state = service.getState();
        paramA.setText(state.getParamA());

        mainPanel = FormBuilder.createFormBuilder()
                .addLabeledComponent("属性A", paramA)
                .getPanel();
    }

    public JPanel getPanel(){
        return mainPanel;
    }

    public boolean isModify(){
        return isModify;
    }

    public void restartModify(){
        this.isModify = false;
    }

    public String getParamA() {
        return this.paramA.getText();
    }
}
