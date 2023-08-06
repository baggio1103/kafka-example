package com.baggio

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KafkaApplication {
//
//    @Bean
//    fun commandLineRunner(kafkaTemplate: KafkaTemplate<String, String>): CommandLineRunner = CommandLineRunner {
//        for (i in 0 .. 100) {
//            kafkaTemplate.send("javajedi", "Hello, this is message count: $i")
//        }
//    }

}

fun main(args: Array<String>) {
    runApplication<KafkaApplication>(*args)
}