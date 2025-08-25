package dev.nft.user.entity

import dev.nft.core.entity.BaseEntity
import jakarta.persistence.*

@Entity
@Table(name = "users")
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val userId: Long? = null, // PK는 보통 val (DB가 넣어주는 값)

    @Column(nullable = false)
    var name: String,

    @Column(nullable = false, unique = true)
    var email: String,

    @Column(nullable = false)
    var password: String
) : BaseEntity() {
    companion object {
        @JvmStatic // 이걸 붙이면 자바에서 호출 가능
        fun create(name: String, email: String, password: String) =
            User(name = name, email = email, password = password)
    }
}