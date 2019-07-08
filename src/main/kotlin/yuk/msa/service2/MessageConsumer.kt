package yuk.msa.service2

import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.cloud.stream.messaging.Sink
import org.springframework.stereotype.Component

@Component
class MessageConsumer {
    @StreamListener(Sink.INPUT)
    fun consume(input : String){
        println(input)
    }
}