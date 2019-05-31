package com.artear.cover.coveritem.repository.deserializer.media


import com.artear.cover.coveritem.repository.getModelObject
import com.artear.cover.coveritem.repository.model.media.MediaContentPicture
import com.artear.tools.media.Size
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.lang.reflect.Type

class MCPictureDeserializer : JsonDeserializer<MediaContentPicture> {

    override fun deserialize(
            json: JsonElement,
            typeOfT: Type,
            context: JsonDeserializationContext
    ): MediaContentPicture {

        val url = json.asJsonObject.get("url").asString
        val title = json.asJsonObject.get("title").asString
        val description = json.asJsonObject.get("description").asString
        val alt = json.asJsonObject.get("alt").asString

        val size = json.getModelObject("size", context, Size::class.java)


        return MediaContentPicture(url, title, description, alt, size)
    }

}
