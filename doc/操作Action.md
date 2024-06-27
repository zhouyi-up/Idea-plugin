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

> - `id`: ActionID唯一标识，自定义
> - `class`: 实现AnAction的操作类全类名
> - `text`: 操作显示的名称

## Action分组操作

plugin.xml

```xml
<actions>
    <group id="com.liuujun.idea.TestGroup" popup="true" 
           icon="AllIcons.Actions.GroupBy" 
           text="测试">
        <add-to-group group-id="ToolsMenu" anchor="last"/>
        <action id="ACTION_DEMO" class="com.liuujun.idea.action.ActionDemo" text="测试消息通知"/>
    </group>
</actions>
```