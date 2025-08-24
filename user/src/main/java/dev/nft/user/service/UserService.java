package dev.nft.user.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import dev.nft.user.Repository.UserRepository;
import dev.nft.user.commend.SignUpCommend;
import dev.nft.user.entity.User;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;

	// 회원가입
	public void register(SignUpCommend commend) {
		String encodedPassword = passwordEncoder.encode(commend.getPassword());
		User user = User.create(commend.getName(), commend.getEmail(), encodedPassword);
		userRepository.save(user);
	}
}
