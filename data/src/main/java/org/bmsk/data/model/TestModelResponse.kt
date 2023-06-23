package org.bmsk.data.model

import org.bmsk.domain.model.TestModel

class TestModelResponse(val name: String?)

fun TestModelResponse.toDomainModel(): TestModel? {
    if(name != null) {
        return TestModel(name)
    }
    return null
}