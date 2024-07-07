package com.liuujun.idea.statusbar;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.openapi.wm.CustomStatusBarWidget;
import com.intellij.openapi.wm.StatusBarWidget;
import com.intellij.openapi.wm.StatusBarWidgetFactory;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class DemoStatusBarWidgetFactory implements StatusBarWidgetFactory {
    @Override
    public @NotNull @NonNls String getId() {
        return "DEMO_STATUS_ID";
    }

    @Override
    public @NotNull @NlsContexts.ConfigurableName String getDisplayName() {
        return "我是一个状态小组件";
    }

    @Override
    public @NotNull StatusBarWidget createWidget(@NotNull Project project) {
        CustomStatusBarWidget customStatusBarWidget = new CustomStatusBarWidget() {
            @Override
            public JComponent getComponent() {
                return new JLabel("我是小组件~~~~");
            }

            @NotNull
            @Override
            public String ID() {
                return "DEMO_STATUS_ID";
            }
        };
        return customStatusBarWidget;
    }
}
