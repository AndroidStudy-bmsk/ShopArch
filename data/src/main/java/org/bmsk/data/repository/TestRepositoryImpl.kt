package org.bmsk.data.repository

import org.bmsk.data.datasource.TestDataSource
import org.bmsk.data.model.toDomainModel
import org.bmsk.domain.model.TestModel
import org.bmsk.domain.repository.TestRepository

class TestRepositoryImpl(
    val dataSource: TestDataSource
): TestRepository {
    override fun getTestData(): TestModel {
        return dataSource.getTestModelResponse().toDomainModel()
    }
}