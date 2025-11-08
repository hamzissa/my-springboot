package com.example.myspringboot.model;

public class Modification {
    private String stage;
    private boolean turbo;
    private boolean nitro;

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    public boolean isNitro() {
        return nitro;
    }

    public void setNitro(boolean nitro) {
        this.nitro = nitro;
    }
}
