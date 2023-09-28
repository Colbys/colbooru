package ai.colbys.colbooru.resource

import ai.colbys.colbooru.model.core.Image
import ai.colbys.colbooru.service.ImageService
import org.springframework.http.MediaType
import org.springframework.http.codec.multipart.FilePart
import org.springframework.http.codec.multipart.Part
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/images")
class ImagesController(val imageService: ImageService) {

    @GetMapping
    fun getBatch(): List<Image> {
        return imageService.getBatch()
    }

    @GetMapping("/{id}")
    fun get(@PathVariable("id") id: String): Image {
        return imageService.get()
    }

    @PostMapping(consumes = [MediaType.MULTIPART_FORM_DATA_VALUE])
    fun create(@RequestPart("file") file: FilePart): Mono<Image> {
        return imageService.create(file)
    }

    @PutMapping("/{id}")
    fun update(@PathVariable("id") id: String): Image {
        return imageService.update()
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") id: String) {
        imageService.delete()
    }
}