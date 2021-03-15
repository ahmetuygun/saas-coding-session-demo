package com.example


import io.micronaut.test.extensions.spock.annotation.MicronautTest
import spock.lang.Specification

@MicronautTest
class DemoSpec extends Specification {

    void 'test it works'() {
        given: 'existing connections between a, d and k'
        def task = new Task()
        task.apply("a", ["d", "k"])

        expect: 'the connections should be listed correctly'
        task.connections*.toString() == [
            'a - d',
            'a - e',
            'a - f',
            'a - k',
            'a - l',
            'b - d',
            'b - e',
            'b - f',
            'b - k',
            'b - l',
            'c - d',
            'c - e',
            'c - f',
            'c - k',
            'c - l',
            'd - a',
            'd - b',
            'd - c',
            'd - k',
            'd - l',
            'e - a',
            'e - b',
            'e - c',
            'e - k',
            'e - l',
            'f - a',
            'f - b',
            'f - c',
            'f - k',
            'f - l',
            'k - a',
            'k - b',
            'k - c',
            'k - d',
            'k - e',
            'k - f'
        ]
    }

}
