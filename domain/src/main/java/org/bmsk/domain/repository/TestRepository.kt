package org.bmsk.domain.repository

import org.bmsk.domain.model.TestModel

interface TestRepository {
    fun getTestData(): TestModel
}