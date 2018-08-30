package com.funproject.developer.RegistrationServer

import com.netflix.appinfo.InstanceInfo
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRegisteredEvent
import org.springframework.context.ApplicationListener

@SpringBootApplication
@EnableEurekaServer
@EnableConfigServer
class RegistrationServerApplication : ApplicationListener<EurekaInstanceRegisteredEvent> {

    override fun onApplicationEvent(instance: EurekaInstanceRegisteredEvent) {
//        val instanceInfo = instance.instanceInfo
//        val builder = InstanceInfo.Builder(instanceInfo)
//        builder.setPort(8090)
//        instance.instanceInfo = builder.build()
    }

}

fun main(args: Array<String>) {
    runApplication<RegistrationServerApplication>(*args)
}
