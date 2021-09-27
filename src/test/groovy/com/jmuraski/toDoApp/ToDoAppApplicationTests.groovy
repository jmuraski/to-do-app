package com.jmuraski.toDoApp

import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class ToDoAppApplicationTests extends Specification{

	def "when I load the web context"() {
		expect:
		1 == 1
	}

}
