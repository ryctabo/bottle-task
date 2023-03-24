package com.ryctabo.bottle.infrastructure.module

import com.ryctabo.bottle.infrastructure.service.DefaultBottleService

object ServiceProvider {
    val defaultBottleService = DefaultBottleService()
}