package jjfactory.order.application.partner

import jjfactory.order.domain.partner.PartnerService
import org.springframework.stereotype.Service

@Service
class PartnerFacade(
    private val partnerService: PartnerService
) {
}