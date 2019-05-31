package com.artear.cover.coveritem.repository.model.media

import com.artear.cover.coveritem.repository.deserializer.media.MCYoutubeDeserializer
import com.google.gson.annotations.JsonAdapter

@JsonAdapter(MCYoutubeDeserializer::class)
data class MediaContentYoutube(
        val id: String,
        val url: String,
        val title: String,
        val image: MediaContentPicture
) : MediaContent()