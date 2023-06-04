package jjfactory.order.presentation.partner

import jjfactory.order.domain.partner.PartnerInfo

interface PartnerDtoMapper {
    fun of(view: PartnerInfo.DetailView): PartnerDto.DetailView
}