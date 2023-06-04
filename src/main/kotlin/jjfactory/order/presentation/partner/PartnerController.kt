package jjfactory.order.presentation.partner

import jjfactory.core.common.response.CommonResponse
import jjfactory.order.application.partner.PartnerFacade
import org.springframework.web.bind.annotation.*

@RequestMapping("/partner")
@RestController
class PartnerController(
    private val partnerFacade: PartnerFacade,
    private val partnerDtoMapper: PartnerDtoMapper
) {
    @PostMapping
    fun post(@RequestBody registerRequest: PartnerDto.CreateRequest): CommonResponse<Any> {
        val command = registerRequest.toCommand()
        return CommonResponse(partnerFacade.register(command));
    }

    @GetMapping("/{id}")
    fun get(@PathVariable id: Long): CommonResponse<PartnerDto.DetailView> {
        return CommonResponse(partnerDtoMapper.of(partnerFacade.get(id)))
    }

    @GetMapping
    fun get(token: String): CommonResponse<PartnerDto.DetailView> {
        return CommonResponse(partnerDtoMapper.of(partnerFacade.get(token)))
    }
}