package ai.colbys.colbooru.model.view

import ai.colbys.colbooru.model.core.Tag

data class TagView(val id: String, val name: String, val count: Int) {
    constructor(tag: Tag, count: Int) : this(tag.id, tag.name, count)
}
