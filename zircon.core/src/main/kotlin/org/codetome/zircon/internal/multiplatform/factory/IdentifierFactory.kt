package org.codetome.zircon.internal.multiplatform.factory

import org.codetome.zircon.internal.util.Identifier

expect object IdentifierFactory {

    fun randomIdentifier(): Identifier

    fun fromString(str: String): Identifier
}