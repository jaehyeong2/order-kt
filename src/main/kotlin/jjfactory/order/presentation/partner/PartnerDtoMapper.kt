package jjfactory.order.presentation.partner

import jjfactory.order.domain.partner.PartnerInfo
import org.mapstruct.InjectionStrategy
import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy

@Mapper(
    componentModel = "spring",
    injectionStrategy = InjectionStrategy.CONSTRUCTOR,
    unmappedTargetPolicy = ReportingPolicy.ERROR
)
interface PartnerDtoMapper {
    fun of(view: PartnerInfo.DetailView): PartnerDto.DetailView
}