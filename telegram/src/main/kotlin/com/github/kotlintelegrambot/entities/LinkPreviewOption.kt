package com.github.kotlintelegrambot.entities

import com.google.gson.annotations.SerializedName

data class LinkPreviewOption(
    @SerializedName("is_disabled") val isDisabled: Boolean? = null,
    @SerializedName("url") val url: String? = null,
    @SerializedName("prefer_small_media") val preferSmallMedia: Boolean? = null,
    @SerializedName("prefer_large_media") val preferLargeMedia: Boolean? = null,
    @SerializedName("show_above_text") val showAboveText: Boolean? = null,
)
