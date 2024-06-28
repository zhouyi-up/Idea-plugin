package com.liuujun.idea.configurable;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.util.NlsContexts;
import com.liuujun.idea.state.DemoSettingState;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class DemoConfigurable implements Configurable {

    private DemoConfigurableView demoConfigurableView = new DemoConfigurableView();

    @Override
    public @NlsContexts.ConfigurableName String getDisplayName() {
        return "Demo设置";
    }

    @Override
    public @Nullable JComponent createComponent() {
        return demoConfigurableView.getPanel();
    }

    @Override
    public boolean isModified() {
        //这里可以根据页面的组件数据变化处理
        return demoConfigurableView.isModify();
    }

    @Override
    public void apply() throws ConfigurationException {
        //这里用来处理用户点击应用按钮动作

        DemoSettingState service = ApplicationManager.getApplication().getService(DemoSettingState.class);
        DemoSettingState.State state = service.getState();
        state.setParamA(demoConfigurableView.getParamA());

        demoConfigurableView.restartModify();
    }
}
