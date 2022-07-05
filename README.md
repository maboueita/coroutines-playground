- launch {}:  a coroutine builder, it launches a coroutine which works concurrently with the rest of the code

- delay(timeInMillisL): suspends a coroutine for a specific time, but doesn't block the underlying thread. other coroutines can still
         continue executing and use the same thread for their code

- runBlocking{}: another coroutine builder, that blocks the underlying thread until its completion, it is meant to bring between non-coroutine and 
    coroutine code and isn't supposed to be run from inside a coroutine

- structured concurrency: denotes that coroutines can only run in a specified coroutine scope, which delimits the lifetime of
    a coroutine. 

- coroutineScope: a scope builder, similar to runBlocking in that it launches a new coroutine scope, that 
  waits for all its children to complete before it also complete. they're different in that runBlocking 
  blocks the underlying thread, while coroutineScope {} just suspends. Because of that difference, runBlocking{}
  is a default function while coroutineScope is a suspending one.

 
