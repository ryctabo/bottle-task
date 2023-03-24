package com.ryctabo.bottle.infrastructure.module

import com.ryctabo.bottle.infrastructure.module.ServiceProvider.defaultBottleService
import com.ryctabo.bottle.usecases.FinishBottleProcess
import com.ryctabo.bottle.usecases.ProcessBottle
import com.ryctabo.bottle.usecases.ReprocessNoStandardBottle

object UseCaseProvider {
    val finishBottleProcess by lazy {
        FinishBottleProcess(defaultBottleService)
    }

    val processBottle by lazy {
        ProcessBottle(defaultBottleService)
    }

    val reprocessNoStandardBottle by lazy {
        ReprocessNoStandardBottle(
            defaultBottleService,
            processBottle
        )
    }
}