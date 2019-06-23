package yuk.msa.service2.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("service2")
class Service2Controller {
    @GetMapping
    fun test() = "Hello"

}