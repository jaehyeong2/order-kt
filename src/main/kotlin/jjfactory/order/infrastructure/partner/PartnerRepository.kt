package jjfactory.order.infrastructure.partner

import jakarta.servlet.http.Part
import jjfactory.order.domain.partner.Partner
import org.springframework.data.jpa.repository.JpaRepository

interface PartnerRepository : JpaRepository<Partner, Long>{
    fun findByToken(token: String) : Partner?
}