package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Task {
    private final Map<String, List<String>> input = Map.of("a", List.of("b", "c"), "d", List.of("e", "f"), "k", List.of("l"), "x", List.of("y", "z"));

    private final List<Connection> connections = new ArrayList<>();

    public void apply(String connectFrom, List<String> connectTos) {
        // TODO: implement me!
    }

    public List<Connection> getConnections() {
        return connections;
    }
}
