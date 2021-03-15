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
            'a - b',
            'a - c',
            'a - d',
            'a - e',
            'a - f',
            'a - k',
            'a - l',
            'b - a',
            'b - c',
            'b - d',
            'b - e',
            'b - f',
            'b - k',
            'b - l',
            'c - a',
            'c - b',
            'c - d',
            'c - e',
            'c - f',
            'c - k',
            'c - l',
            'd - a',
            'd - b',
            'd - c',
            'd - e',
            'd - f',
            'd - k',
            'd - l',
            'e - a',
            'e - b',
            'e - c',
            'e - d',
            'e - f',
            'e - k',
            'e - l',
            'f - a',
            'f - b',
            'f - c',
            'f - d',
            'f - e',
            'f - k',
            'f - l',
            'k - a',
            'k - b',
            'k - c',
            'k - d',
            'k - e',
            'k - f',
            'k - l',
            'l - a',
            'l - b',
            'l - c',
            'l - d',
            'l - e',
            'l - f',
            'l - k',
        ]
    }

}
