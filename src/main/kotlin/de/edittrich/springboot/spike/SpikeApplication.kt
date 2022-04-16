package de.edittrich.springboot.spike

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpikeApplication

fun main(args: Array<String>) {
	runApplication<SpikeApplication>(*args)
}
