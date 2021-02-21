package com.joaodaniel.postgres.backend.repositories

import com.joaodaniel.postgres.backend.models.ModelInfo
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ModelInfoRepository: CrudRepository<ModelInfo, Long> {
}