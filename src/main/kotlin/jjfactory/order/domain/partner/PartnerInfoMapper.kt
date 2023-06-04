package jjfactory.order.domain.partner

interface PartnerInfoMapper {
    fun of(partner: Partner): PartnerInfo.DetailView
}