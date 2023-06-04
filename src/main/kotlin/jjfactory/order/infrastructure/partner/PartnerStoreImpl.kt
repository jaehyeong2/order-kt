package jjfactory.order.infrastructure.partner

import jjfactory.order.domain.partner.Partner
import jjfactory.order.domain.partner.PartnerStore
import org.springframework.stereotype.Component

@Component
class PartnerStoreImpl(
    private val partnerRepository: PartnerRepository
) : PartnerStore {
    override fun store(partner: Partner) {
        //todo 예외처리

        partnerRepository.save(partner)
    }

}