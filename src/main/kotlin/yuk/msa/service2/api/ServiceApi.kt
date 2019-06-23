package yuk.msa.service2.api

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient("service")
interface ServiceApi {
    @GetMapping
    @HystrixCommand
    fun hello(): String
}