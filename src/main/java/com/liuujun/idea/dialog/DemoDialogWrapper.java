package com.liuujun.idea.dialog;

import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class DemoDialogWrapper extends DialogWrapper {

    public DemoDialogWrapper(){
        super(true);
        setTitle("对话框DEMO");

        init();
    }

    @Override
    protected @Nullable JComponent createCenterPanel() {
        return new JLabel("我是一个对话框~~~~");
    }
}
