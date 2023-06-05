package jjfactory.order.infrastructure.partner

import jjfactory.order.domain.partner.Partner
import jjfactory.order.domain.partner.PartnerWriter
import org.springframework.stereotype.Component

@Component
class PartnerWriterImpl(
    private val partnerRepository: PartnerRepository
) : PartnerWriter {
    override fun write(partner: Partner) {
        //todo 예외처리

        partnerRepository.save(partner)
    }

}