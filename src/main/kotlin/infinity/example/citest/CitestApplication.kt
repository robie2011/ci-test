package infinity.example.citest

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@SpringBootApplication
class CitestApplication

fun main(args: Array<String>) {
    SpringApplication.run(CitestApplication::class.java, *args)
}


@RestController
@RequestMapping(value = "/")
class HomeController {

    @GetMapping()
    fun hello() = "Hello ${Date()}"
}