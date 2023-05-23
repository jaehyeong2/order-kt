package jjfactory.order.domain.partner

import org.springframework.stereotype.Component

@Component
class PartnerServiceImpl(
    private val partnerReader: PartnerReader,
    private val partnerStore: PartnerStore
) : PartnerService{

}