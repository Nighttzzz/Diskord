package com.jessecorbett.diskord.api.gateway.events

import com.fasterxml.jackson.annotation.JsonProperty

data class UnavailableGuild(
        @JsonProperty("id") val id: String,
        @JsonProperty("unavailable") val unavailable: Boolean
)