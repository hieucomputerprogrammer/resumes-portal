package ai.tech.user.application.mapper;

import ai.tech.user.application.dto.UserDto;
import ai.tech.user.domain.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(UserDto userDto);
}