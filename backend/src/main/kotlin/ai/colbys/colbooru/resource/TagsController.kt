package ai.colbys.colbooru.resource

import ai.colbys.colbooru.model.view.TagView
import ai.colbys.colbooru.service.TagService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/tags")
class TagsController(val tagService: TagService) {

    @GetMapping
    fun getBatch(): List<TagView> {
        return tagService.getBatch()
    }

    @PostMapping
    fun create(): TagView {
        return tagService.create()
    }

    @PutMapping("/{id}")
    fun update(@PathVariable("id") id: String): TagView {
        return tagService.update()
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") id: String) {
        tagService.delete()
    }
}