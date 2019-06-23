package yuk.msa.service2

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.openfeign.EnableFeignClients


@EnableFeignClients
@EnableCircuitBreaker
@EnableEurekaClient
@SpringBootApplication
class Service2Application

fun main(args: Array<String>) {
    runApplication<Service2Application>(*args)
}
