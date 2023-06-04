package jjfactory.order.presentation.partner

import jjfactory.order.domain.partner.Partner
import jjfactory.order.domain.partner.PartnerCommand

class PartnerDto {
    data class CreateRequest(
        val name: String,
        var bizNum: String,
        var email: String,
    ) {
        fun toCommand(): PartnerCommand {
            return PartnerCommand(
                name,
                bizNum,
                email
            )
        }
    }

    data class DetailView(
        val id: Long?,
        val token: String?,
        val name: String,
        val bizNum: String,
        val email: String,
        val status: Partner.Status
    )

}