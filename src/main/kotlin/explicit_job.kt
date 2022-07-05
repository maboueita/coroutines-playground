import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/** A launch coroutine builder returns a job instance
 * which can be used to i.e explicitly wait for the
 * completion of the child coroutine.
 * As in the example below, on line 18
 * the execution waits for the 'job' coroutine, so 'World'
 * is printed out before Done!
 */


fun main() = runBlocking {
    val job = launch {
        delay(1000L)
        println("World")
    }
    println("Hello ")
    job.join()
    println("Done!")
}

