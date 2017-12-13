@file:JvmName("WebServerKt")

package co.herod.template

import io.ktor.application.call
import io.ktor.content.files
import io.ktor.content.static
import io.ktor.http.ContentType
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

object WebServer {

    private const val STATIC_PATH = "static"

    @JvmStatic
    fun main(args: Array<String>) {
        val server = embeddedServer(Netty, 8080) {
            routing {
                static(STATIC_PATH) {
                    files(STATIC_PATH)
                }
                get("/") {
                    call.respondText(
                            "",
                            ContentType.Text.Plain
                    )
                }
            }
        }
        server.start(wait = true)
    }
}