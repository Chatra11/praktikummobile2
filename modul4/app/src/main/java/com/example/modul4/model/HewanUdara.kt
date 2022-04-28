package com.example.modul4.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import java.io.Serializable

data class HewanUdara (
    val namaudara : String,
    @DrawableRes val gambarudara : Int,
):Serializable