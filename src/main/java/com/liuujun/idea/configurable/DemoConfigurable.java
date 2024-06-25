package com.liuujun.idea.configurable;

import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.util.NlsContexts;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class DemoConfigurable implements Configurable {
    @Override
    public @NlsContexts.ConfigurableName String getDisplayName() {
        return "Demo设置";
    }

    @Override
    public @Nullable JComponent createComponent() {
        DemoConfigurableView demoConfigurableView = new DemoConfigurableView();
        return demoConfigurableView.getPanel();
    }

    @Override
    public boolean isModified() {
        //这里可以根据页面的组件数据变化处理
        return false;
    }

    @Override
    public void apply() throws ConfigurationException {
        //这里用来处理用户点击应用按钮动作
    }
}
