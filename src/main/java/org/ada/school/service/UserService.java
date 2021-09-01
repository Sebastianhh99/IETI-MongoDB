package org.ada.school.service;

import org.ada.school.dto.UserDto;
import org.ada.school.repository.UserDocument;

import java.util.List;

public interface UserService
{
    UserDocument create( UserDto userDto );

    UserDocument findById( String id );

    List<UserDocument> all();

    boolean deleteById( String id );

    UserDocument update( UserDto userDto, String id );
}
