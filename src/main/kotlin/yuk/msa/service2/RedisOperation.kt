package yuk.msa.service2

import org.springframework.data.redis.core.StringRedisTemplate
import org.springframework.stereotype.Component

@Component
class RedisOperation(private val redis : StringRedisTemplate) {
    fun put(){
        val opsForValue = redis.opsForValue()
        opsForValue.set("key","value")
        val value = opsForValue.get("key")
        redis.delete("key")
    }

}