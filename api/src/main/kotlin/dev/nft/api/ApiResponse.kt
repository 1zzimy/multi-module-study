package dev.nft.api;

import com.fasterxml.jackson.annotation.JsonInclude
import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "표준 API 응답 래퍼")
@JsonInclude(JsonInclude.Include.NON_NULL) // null 필드는 JSON에서 제외
data class ApiResponse<T>(
    @Schema(description = "요청 성공 여부", example = "true")
    val success: Boolean,

    @Schema(description = "응답 메시지", example = "success")
    val message: String,

    @Schema(
        description = "응답 데이터(없을 수 있음)",
        nullable = true
    )
    val data: T? = null
) {
    companion object {
        @JvmStatic
        @Schema(hidden = true)
        fun <T> success(data: T): ApiResponse<T> =
            ApiResponse(success = true, message = "success", data = data)

        @JvmStatic
        @Schema(hidden = true)
        fun <T> success(): ApiResponse<T> =
            ApiResponse(success = true, message = "success", data = null)

        @JvmStatic
        @Schema(hidden = true)
        fun <T> error(message: String): ApiResponse<T> =
            ApiResponse(success = false, message = message, data = null)
    }
}
