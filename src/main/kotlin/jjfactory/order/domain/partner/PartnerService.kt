package jjfactory.order.domain.partner

interface PartnerService {
    fun get(token: String): PartnerInfo.DetailView
    fun get(partnerId: Long): PartnerInfo.DetailView
    fun register(command: PartnerCommand)
}