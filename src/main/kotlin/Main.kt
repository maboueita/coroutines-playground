import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

/**
 *  runBlocking and coroutineScope builders look both
 *  wait for their body and all its children to complete. runBlocking however
 *  blocks the current thread for waiting while coroutineScope suspends,
 *  releasing the underling thread for other usages.
 *  runBlocking is a regular function while coroutineScope is a suspending function.
 */

fun main() = runBlocking { // this: coroutine scope
    doWorld()
    println("Hello")
}

suspend fun doWorld() = coroutineScope {
    delay(1000L)
    println("World!")
}


