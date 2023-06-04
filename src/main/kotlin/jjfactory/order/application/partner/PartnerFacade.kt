package jjfactory.order.application.partner

import jjfactory.order.domain.partner.PartnerCommand
import jjfactory.order.domain.partner.PartnerService
import org.springframework.stereotype.Service

@Service
class PartnerFacade(
    private val partnerService: PartnerService
) {

    fun get(){

    }

    fun register(command: PartnerCommand) {
        partnerService.register(command)
    }
}