package com.funproject.developer.RegistrationServer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class RegistrationServerApplication

fun main(args: Array<String>) {
    runApplication<RegistrationServerApplication>(*args)
}
