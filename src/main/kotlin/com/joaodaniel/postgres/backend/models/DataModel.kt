package com.joaodaniel.postgres.backend.models

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import org.hibernate.annotations.Type
import javax.persistence.*
import javax.persistence.Table

@Entity
@Table(name = "data_model")
data class DataModel(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,

//        @Column(name = "contents", nullable = false)
//        val contents: ArrayList<ArrayList<Any>>,

        @Column(name = "test_text")
        val testText: String,

        @ManyToOne
        val modelInfo: ModelInfo
)
