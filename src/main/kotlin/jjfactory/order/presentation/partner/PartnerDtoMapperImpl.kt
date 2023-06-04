package jjfactory.order.presentation.partner

import jjfactory.order.domain.partner.PartnerInfo
import org.springframework.stereotype.Component

@Component
class PartnerDtoMapperImpl : PartnerDtoMapper {
    override fun of(view: PartnerInfo.DetailView): PartnerDto.DetailView {
        return PartnerDto.DetailView(
            view.id,
            view.token,
            view.name,
            view.bizNum,
            view.email,
            view.status
        )
    }
}