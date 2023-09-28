package ai.colbys.colbooru.service

import ai.colbys.colbooru.model.view.TagView
import ai.colbys.colbooru.repository.TagRepository
import org.springframework.stereotype.Service

@Service
class TagService(val tagRepository: TagRepository) {

    fun getBatch(): List<TagView> {
        TODO("Not yet implemented")
    }

    fun create(): TagView {
        TODO("Not yet implemented")
    }

    fun update(): TagView {
        TODO("Not yet implemented")
    }

    fun delete() {
        TODO("Not yet implemented")
    }
}