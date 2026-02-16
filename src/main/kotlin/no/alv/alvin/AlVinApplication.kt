package no.alv.alvin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AlVinApplication

fun main(args: Array<String>) {
    runApplication<AlVinApplication>(*args)
}
