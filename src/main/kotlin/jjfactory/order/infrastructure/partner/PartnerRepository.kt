package jjfactory.order.infrastructure.partner

import jjfactory.order.domain.partner.Partner
import org.springframework.data.jpa.repository.JpaRepository

interface PartnerRepository : JpaRepository<Partner, Long>