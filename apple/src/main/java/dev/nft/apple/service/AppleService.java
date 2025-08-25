package dev.nft.apple.service;

import org.springframework.stereotype.Service;

import dev.nft.apple.repository.AppleRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AppleService {
	private final AppleRepository appleRepository;
}
