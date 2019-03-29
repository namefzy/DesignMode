package com.gupao.day_0329.demo3;

public class Square extends Rectangle {
    private long length;
    public long getLength() {
        return length;
    }
    public void setLength(long length) {
        this.length = length;
    }
    @Override
    public long getWidth() {
        return getLength();
    }
    @Override
    public long getHeight() {
        return getLength();
    }
    @Override
    public void setHeight(long height) {
        setLength(height);
    }
    @Override
    public void setWidth(long width) {
        setLength(width);
    }
}
