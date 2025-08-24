package dev.nft.api.dto;

import io.swagger.v3.oas.annotations.media.Schema
import jakarta.validation.constraints.*
import jakarta.validation.constraints.Size

@Schema(description = "회원가입 요청 DTO")
data class ResisterDto(

    @Schema(description = "사용자 이름", example = "홍길동")
    @field:NotBlank @field:Size(max = 255)
    var name: String,

    @Schema(description = "이메일", example = "hong@example.com")
    @field:NotBlank @field:Email @field:Size(max = 255)
    var email: String,

    @Schema(description = "비밀번호", example = "password1234")
    @field: NotBlank @field:Size(min = 8, max = 255)
    var password: String
)