package jjfactory.order.application.partner

import jjfactory.order.domain.partner.PartnerCommand
import jjfactory.order.domain.partner.PartnerInfo
import jjfactory.order.domain.partner.PartnerService
import org.springframework.stereotype.Service

@Service
class PartnerFacade(
    private val partnerService: PartnerService
) {

    fun get(id: Long): PartnerInfo.DetailView {
        return partnerService.get(id)
    }

    fun get(token: String): PartnerInfo.DetailView {
        return partnerService.get(token)
    }

    fun register(command: PartnerCommand) {
        partnerService.register(command)
    }
}