package ai.colbys.colbooru

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ColbooruApplication

fun main(args: Array<String>) {
	runApplication<ColbooruApplication>(*args)
}
