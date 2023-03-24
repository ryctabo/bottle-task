package com.ryctabo.bottle.domain

data class Bottle(
    val type: BottleType,
    var state: BottleState = BottleState.NO_STANDARD,
    var size: Int,
    val unitType: String = "oz",
    val color: String
)
