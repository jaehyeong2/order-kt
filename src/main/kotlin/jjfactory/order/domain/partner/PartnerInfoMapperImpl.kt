package jjfactory.order.domain.partner

import org.springframework.stereotype.Component

@Component
class PartnerInfoMapperImpl : PartnerInfoMapper {
    override fun of(partner: Partner): PartnerInfo.DetailView {
        return PartnerInfo.DetailView(
            partner.id,
            partner.token,
            partner.name,
            partner.bizNum,
            partner.email,
            partner.status
        )
    }
}