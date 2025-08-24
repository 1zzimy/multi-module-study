package dev.nft.api.mapper;

import org.mapstruct.Mapper;

import dev.nft.api.dto.ResisterDto;
import dev.nft.user.commend.SignUpCommend;

@Mapper(componentModel = "spring")
public interface UserMapper {
	SignUpCommend toCommend(ResisterDto req);
}
