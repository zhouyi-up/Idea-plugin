package com.liuujun.idea.action;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationGroup;
import com.intellij.notification.NotificationGroupManager;
import com.intellij.notification.NotificationType;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class ActionDemo extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here

        NotificationGroup notificationGroup = NotificationGroupManager.getInstance()
                .getNotificationGroup("PLUGIN-DEMO-ID");

        Notification notification = notificationGroup
                .createNotification("通知标题", "我是一个通知", NotificationType.INFORMATION);

        notification.notify(e.getProject());
    }
}
