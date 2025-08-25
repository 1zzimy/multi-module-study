package dev.nft.apple.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.nft.apple.entity.Apple;

public interface AppleRepository extends JpaRepository<Apple, Long> {
}
