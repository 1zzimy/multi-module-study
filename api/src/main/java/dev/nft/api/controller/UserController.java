package dev.nft.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.nft.api.ApiResponse;
import dev.nft.api.dto.ResisterDto;
import dev.nft.api.mapper.UserMapper;
import dev.nft.user.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@Tag(name = "User", description = "사용자 관련 API")
@RestController
@RequestMapping("api/user")
@RequiredArgsConstructor
public class UserController {
	private final UserService userService;
	private final UserMapper userMapper;

	@Operation(summary = "회원가입", description = "사용자 정보를 입력받아 회원 등록")
	@PostMapping("/signup")
	public ResponseEntity<?> signup(@RequestBody ResisterDto req) {
		userService.register(userMapper.toCommend(req));
		return ResponseEntity.ok(ApiResponse.success());
	}
}
