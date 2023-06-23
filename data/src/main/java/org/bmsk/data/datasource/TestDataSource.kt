package org.bmsk.data.datasource

import org.bmsk.data.model.TestModelResponse

class TestDataSource {
    fun getTestModelResponse(): TestModelResponse {
        return TestModelResponse("response")
    }
}