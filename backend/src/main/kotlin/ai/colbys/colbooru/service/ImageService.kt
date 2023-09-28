package ai.colbys.colbooru.service

import ai.colbys.colbooru.model.core.Image
import ai.colbys.colbooru.repository.ImageRepository
import ai.colbys.colbooru.repository.ImageStorage
import org.springframework.http.codec.multipart.FilePart
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import reactor.kotlin.core.publisher.toMono
import java.io.InputStream

@Service
class ImageService(val imageRepository: ImageRepository, val imageStorage: ImageStorage) {
    fun getBatch(): List<Image> {
        TODO("Not yet implemented")
    }

    fun get(): Image {
        TODO("Not yet implemented")
    }

    fun create(file: FilePart): Mono<Image> {
        return file.content()
            .map {
                val contentType = file.headers().contentType?.type
                imageStorage.put(it.asInputStream(), contentType!!)
                return@map Image("", "")
            }
            .toMono()
    }

    fun update(): Image {
        TODO("Not yet implemented")
    }

    fun delete() {
        TODO("Not yet implemented")
    }
}