# 操作Action

## 定义操作

```java
public class ActionDemo extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
    }
}
```

## 注册操作

plugin.xml

```xml
<actions>
    <action id="ACTION_DEMO" class="com.liuujun.idea.action.ActionDemo" text="测试消息通知">
        <add-to-group group-id="ToolsMenu" anchor="last"/>
    </action>
</actions>
```