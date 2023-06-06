package jjfactory.order.domain.partner

import jjfactory.core.common.util.TokenGenerator

class PartnerCommand(
    val name: String,
    var bizNum: String,
    var email: String,
) {
    fun toEntity(): Partner {
        return Partner(
            null,
            TokenGenerator.randomCharacterWithPrefix("ptn_"),
            name,
            bizNum,
            email,
            Partner.Status.ENABLE
        )
    }
}