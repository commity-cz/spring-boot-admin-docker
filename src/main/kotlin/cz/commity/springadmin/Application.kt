package cz.commity.springadmin

import de.codecentric.boot.admin.config.EnableAdminServer
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
@EnableAdminServer
class Application

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}
