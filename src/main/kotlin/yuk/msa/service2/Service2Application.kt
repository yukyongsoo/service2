package yuk.msa.service2

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.cloud.stream.messaging.Sink
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer


@EnableFeignClients
@EnableCircuitBreaker
@EnableEurekaClient
@EnableResourceServer
@SpringBootApplication
@EnableBinding(Sink::class)
class Service2Application

fun main(args: Array<String>) {
    runApplication<Service2Application>(*args)
}
