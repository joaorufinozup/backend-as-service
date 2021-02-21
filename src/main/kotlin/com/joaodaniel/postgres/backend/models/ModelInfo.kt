package com.joaodaniel.postgres.backend.models

import javax.persistence.*

@Entity
@Table(name = "model_info")
data class ModelInfo(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,

        @Column(name = "model_name", nullable = false)
        val modelName: String,

        @Column(name = "structure", nullable = false)
        val structure: HashMap<String, String>,

//        @OneToMany
//        val dataModel: List<DataModel>
)
