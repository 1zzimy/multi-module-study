package dev.nft.apple.entity

import dev.nft.entity.BaseEntity
import jakarta.persistence.*

@Entity
@Table(name = "apple")
class Apple(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val appleId: Long? = null,
) : BaseEntity()
