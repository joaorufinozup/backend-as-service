package com.joaodaniel.postgres.backend.controllers

import com.joaodaniel.postgres.backend.models.DataModel
import com.joaodaniel.postgres.backend.repositories.DataModelRepository
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/model")
class TableController(val dataModelRepository: DataModelRepository) {
    @GetMapping
    fun index(): ResponseEntity<Iterable<DataModel>> {
        val dataModels = dataModelRepository.findAll()
        return ResponseEntity.ok(dataModels);
    }

    @PostMapping
    fun create(@RequestBody request: DataModel): ResponseEntity<DataModel> {
        val table = dataModelRepository.save(request)
        return ResponseEntity(table, HttpStatus.CREATED)
    }

//    @PutMapping("/{id}")
//    fun addContent(@PathVariable("id") id: Long, @RequestBody request: ArrayList<Any>): ResponseEntity<ArrayList<ArrayList<Any>>> {
//        val dataModel = dataModelRepository.findById(id)
//        val contents = dataModel.get().contents
//        contents.add(request)
//        dataModelRepository.updateContents(id, contents)
//        return ResponseEntity.ok(contents)
//    }
}