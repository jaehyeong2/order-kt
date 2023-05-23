package jjfactory.order.domain.partner

import jakarta.persistence.*

@Entity
class Partner(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    var token: String,
    var name: String,
    @Column(unique = true)
    var bizNum: String,
    var email: String,

    @Enumerated(EnumType.STRING)
    var status: Status
) {
    enum class Status(status: String) {
        ENABLE("활성화"), DISABLE("비활성화");
    }

}