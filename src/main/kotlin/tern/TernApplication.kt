package tern

import org.slf4j.LoggerFactory

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import java.time.LocalDateTime

@SpringBootApplication
class TernApplication : CommandLineRunner {
    private val log = LoggerFactory.getLogger(TernApplication::class.java)

    override fun run(vararg args: String?) {
        when (args[0]) {
            "create" -> {
                val currentDate = LocalDateTime.now()
                log.info("run job create at {}", currentDate)
            }

            "update" -> {
                val currentDate = LocalDateTime.now()
                log.info("run job update at {}", currentDate)
            }

            else -> {
                log.error("Unknown job name {}", args[0])
            }
        }
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(TernApplication::class.java, *args)
}