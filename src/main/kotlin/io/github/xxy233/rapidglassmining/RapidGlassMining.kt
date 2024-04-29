package io.github.xxy233.rapidglassmining

import io.github.oshai.kotlinlogging.KotlinLogging
import net.fabricmc.api.ModInitializer


object RapidGlassMining: ModInitializer {
    private val logger = KotlinLogging.logger {}

    override fun onInitialize() {
        logger.info { "RapidGlassMining initialized!" }
    }
}