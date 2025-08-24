package dev.nft.api.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class SweggerConfig {
	@Bean
	public OpenAPI openAPI() {
		return new OpenAPI()
			.info(new Info()
				.title("특화 프로젝트 API")
				.description("멀티 모듈 기반 블록체인 NFT 프로젝트 API 문서")
			)
			.servers(List.of(
				new Server().url("http://localhost:8080").description("Local")
			));
	}
}
