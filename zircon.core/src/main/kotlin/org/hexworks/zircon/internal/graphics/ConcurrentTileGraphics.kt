package org.hexworks.zircon.internal.graphics

import org.hexworks.zircon.api.data.Size
import org.hexworks.zircon.api.graphics.BaseTileGraphics
import org.hexworks.zircon.api.graphics.StyleSet
import org.hexworks.zircon.api.resource.TilesetResource
import org.hexworks.zircon.platform.factory.ThreadSafeMapFactory

class ConcurrentTileGraphics(
        size: Size,
        tileset: TilesetResource,
        styleSet: StyleSet = StyleSet.defaultStyle())
    : BaseTileGraphics(
        styleSet = styleSet,
        tileset = tileset,
        size = size,
        contents = ThreadSafeMapFactory.create())
