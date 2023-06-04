package jjfactory.order.domain.partner

interface PartnerReader {
    fun get(token: String): Partner
    fun get(partnerId: Long): Partner
}