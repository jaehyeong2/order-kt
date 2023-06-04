package jjfactory.order.domain.partner

import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
class PartnerServiceImpl(
    private val partnerReader: PartnerReader,
    private val partnerStore: PartnerStore,
    private val partnerInfoMapper: PartnerInfoMapper
) : PartnerService {

    @Transactional(readOnly = true)
    override fun get(partnerId: Long): PartnerInfo.DetailView {
        return partnerInfoMapper.of(partnerReader.get(partnerId))

    }

    @Transactional
    override fun register(command: PartnerCommand) {
        partnerStore.store(command.toEntity())
    }

    @Transactional(readOnly = true)
    override fun get(token: String): PartnerInfo.DetailView {
        return partnerInfoMapper.of(partnerReader.get(token))
    }


}