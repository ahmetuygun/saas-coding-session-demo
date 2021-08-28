package com.example;

import java.util.*;
import java.util.stream.Collectors;

public class Task {
    private final Map<String, List<String>> input = Map.of("a", List.of("b", "c"), "d", List.of("e", "f"), "k", List.of("l"), "x", List.of("y", "z"));

    private final List<Connection> connections = new ArrayList<>();

    public void apply(String connectFrom, List<String> connectTos) {

        List<String> candidates = new ArrayList<String>();
        candidates.add(connectFrom);
        candidates.addAll(connectTos);

        Stack<String> stack = new Stack<String>();

        //Finding visited nodes
        Set<String> wholeVisited = candidates
                .stream()
                .flatMap(item -> search(item, stack).stream())
                .collect(Collectors.toSet());

        // Getting combination of visited nodes with stream
        connections.addAll(wholeVisited
                .stream()
                .sorted()
                .flatMap(from -> wholeVisited
                        .stream()
                        .sorted()
                        .filter(to -> !to.equals(from)) // prevent possible duplication
                        .map(to -> new Connection(from, to)))
                .distinct()
                .collect(Collectors.toList())) ;

    }

    private Set<String> search(String item, Stack<String> stack) {
        //deep first search -> iterative
        stack.push(item);
        Set<String> visited = new HashSet<>();
        while (!stack.isEmpty()) {
            String current = stack.pop();
            visited.add(current);
            if (input.get(current) != null)
                for (String dest : input.get(current)) {
                    if (!visited.contains(dest))
                        stack.push(dest);
                }
        }
        return visited;
    }


    public List<Connection> getConnections() {
        return connections;
    }


}
