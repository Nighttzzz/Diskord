package com.jessecorbett.diskord.api.rest

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ModifyUser(
    @SerialName("username") val username: String,
    @SerialName("avatar") val base64AvatarData: String?
)
