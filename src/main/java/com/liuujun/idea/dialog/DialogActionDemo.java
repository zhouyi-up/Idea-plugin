package com.liuujun.idea.dialog;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;

public class DialogActionDemo extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        DemoDialogWrapper demoDialogWrapper = new DemoDialogWrapper();

        boolean flag = demoDialogWrapper.showAndGet();
        //获取用户点击结果
        System.out.println("用户点击结果：" + flag);
    }
}
