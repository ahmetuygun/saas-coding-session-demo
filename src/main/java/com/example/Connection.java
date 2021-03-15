package com.example;

public class Connection {
    private String connectFrom;
    private String connectTo;

    public Connection(String connectFrom, String connectTo) {
        this.connectFrom = connectFrom;
        this.connectTo = connectTo;
    }

    @Override
    public String toString() {
        return connectFrom + " - " + connectTo;
    }

    public String getConnectFrom() {
        return connectFrom;
    }

    public void setConnectFrom(String connectFrom) {
        this.connectFrom = connectFrom;
    }

    public String getConnectTo() {
        return connectTo;
    }

    public void setConnectTo(String connectTo) {
        this.connectTo = connectTo;
    }
}
