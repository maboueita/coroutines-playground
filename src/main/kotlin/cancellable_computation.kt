import kotlinx.coroutines.*

/**
 * Coroutine code has to cooperate to be cancellable. Ideally coroutines
 * check for cancellation and throw CancellationException when cancelled.
 * However, if a coroutine is working in a computation and does not check for cancellation
 * then it cannot be cancelled.
 */

/**
 *
 *
 *
 *
 */

fun main() = runBlocking {
    val startTime = System.currentTimeMillis()
    val job = launch(Dispatchers.Default) {
        var nextPrintTime = startTime
        var i = 0
        while (isActive) { // a cancellable computation loop via using isActive
            // print a message twice a second.
            if (System.currentTimeMillis() >= nextPrintTime) {
                println("job: I'm sleeping ${i++} ...")
                nextPrintTime += 500L
            }
        }
    }
    delay(1300L) // add some delay.
    println("main: I'm tired of waiting!")
    job.cancelAndJoin() // cancels the job and waits for its completion.
    println("main: Now I can quit.")
}