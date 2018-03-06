package com.jessecorbett.diskord.api.rest

import com.fasterxml.jackson.annotation.JsonProperty
import com.jessecorbett.diskord.api.models.Embed

data class WebhookSubmission(
        @JsonProperty("content") val content: String?,
        @JsonProperty("username") val overrideUsername: String?,
        @JsonProperty("avatar_url") val overrideAvatarUrl: String?,
        @JsonProperty("tts") val tts: Boolean = false,
        @JsonProperty("file") val fileContent: ByteArray? = null,
        @JsonProperty("embed") val embed: Embed? = null,
        @JsonProperty("payload_json") val fileUploadEmbed: String? = null
)