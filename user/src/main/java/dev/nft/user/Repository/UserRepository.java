package dev.nft.user.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.nft.user.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
