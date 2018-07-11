package org.codetome.zircon.internal.multiplatform.impl

import org.codetome.zircon.internal.multiplatform.api.Maybe
import org.codetome.zircon.internal.multiplatform.api.ThreadSafeQueue
import java.util.concurrent.BlockingDeque
import java.util.concurrent.LinkedBlockingDeque

class JvmThreadSafeQueue<E>(private val backend: BlockingDeque<E> = LinkedBlockingDeque())
    : ThreadSafeQueue<E>, MutableCollection<E> by backend {

    override fun offer(e: E): Boolean = backend.offer(e)

    override fun drainTo(c: MutableCollection<E>): Int = backend.drainTo(c)

    override fun remove(element: E): Boolean = backend.remove(element)

    override fun pollLast(): Maybe<E> = Maybe.ofNullable(backend.pollLast())
}