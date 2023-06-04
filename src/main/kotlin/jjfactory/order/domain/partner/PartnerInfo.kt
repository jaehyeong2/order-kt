package jjfactory.order.domain.partner

class PartnerInfo {
    data class DetailView(
        val id: Long?,
        val token: String?,
        val name: String,
        val bizNum: String,
        val email: String,
        val status: Partner.Status
    )
}