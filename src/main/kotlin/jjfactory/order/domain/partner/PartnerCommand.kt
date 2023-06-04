package jjfactory.order.domain.partner

class PartnerCommand(
    val name: String,
    var bizNum: String,
    var email: String,
) {
    fun toEntity(): Partner {
        return Partner(
            null,
            null,
            name,
            bizNum,
            email,
            Partner.Status.ENABLE
        )
    }
}