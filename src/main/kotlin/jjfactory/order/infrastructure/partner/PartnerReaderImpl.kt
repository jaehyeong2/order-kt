package jjfactory.order.infrastructure.partner

import jjfactory.order.domain.partner.Partner
import jjfactory.order.domain.partner.PartnerReader
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class PartnerReaderImpl(
    private val partnerRepository: PartnerRepository
) : PartnerReader {

    override fun get(partnerId: Long): Partner {
        return partnerRepository.findByIdOrNull(partnerId) ?: throw NotFoundException()
    }

    override fun get(token: String): Partner {
        return partnerRepository.findByToken(token) ?: throw NotFoundException()
    }
}