package com.joaodaniel.postgres.backend.repositories

import com.joaodaniel.postgres.backend.models.DataModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import java.util.*
import javax.transaction.Transactional
import kotlin.collections.ArrayList

@Repository
interface DataModelRepository: JpaRepository<DataModel, Long> {
//    @Transactional
//    @Modifying
//    @Query("update DataModel set contents = :contents where id = :id")
//    fun updateContents(@Param(value = "id") id: Long, @Param(value = "contents") contents: ArrayList<ArrayList<Any>>)
}