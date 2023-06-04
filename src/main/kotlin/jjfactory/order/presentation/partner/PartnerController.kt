package jjfactory.order.presentation.partner

import jjfactory.core.common.response.CommonResponse
import jjfactory.order.application.partner.PartnerFacade
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/partner")
@RestController
class PartnerController(
    private val partnerFacade: PartnerFacade
) {
    @PostMapping
    fun post(@RequestBody registerRequest: PartnerDto.CreateRequest): CommonResponse<Any> {
        val command = registerRequest.toCommand()
        return CommonResponse(partnerFacade.register(command));
    }

    fun get() {

    }

    fun getList() {

    }
}