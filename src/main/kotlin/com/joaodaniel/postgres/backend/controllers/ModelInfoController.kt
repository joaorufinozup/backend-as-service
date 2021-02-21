package com.joaodaniel.postgres.backend.controllers

import com.joaodaniel.postgres.backend.models.ModelInfo
import com.joaodaniel.postgres.backend.repositories.ModelInfoRepository
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/table")
class ModelInfoController(val modelInfoRepository: ModelInfoRepository) {
    @GetMapping
    fun index(): ResponseEntity<Iterable<ModelInfo>> {
        val modelInfos = modelInfoRepository.findAll()
        return ResponseEntity.ok(modelInfos);
    }

    @PostMapping
    fun create(@RequestBody request: ModelInfo): ResponseEntity<ModelInfo> {
        val table = modelInfoRepository.save(request)
        return ResponseEntity(table, HttpStatus.CREATED)
    }
}