package com.liuujun.idea.state;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.Service;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Service
@State(name = "demo-setting-data", storages = @Storage("demo-setting.xml"))
public final class DemoSettingState implements PersistentStateComponent<DemoSettingState.State> {

    private State state = new State();

    @Nullable
    @Override
    public DemoSettingState.State getState() {
        return state;
    }

    @Override
    public void loadState(@NotNull DemoSettingState.State state) {
        this.state = state;
    }

    public static class State{
        private String paramA;

        public String getParamA() {
            return paramA;
        }

        public void setParamA(String paramA) {
            this.paramA = paramA;
        }
    }
}
