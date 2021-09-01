package org.ada.school.service;

import org.ada.school.dto.UserDto;

import org.ada.school.repository.UserDocument;

import java.util.List;

public class UserServiceHashMap
    implements UserService
{

//    private final HashMap<String, User> usersMap = new HashMap<>();


    @Override
    public UserDocument create( UserDto user )
    {
        //usersMap.put( user.getId(), user );
        //return user;
        return null;
    }

    @Override
    public UserDocument findById( String id )
    {
        /*if ( usersMap.containsKey( id ) )
        {
            return usersMap.get( id );
        }*/
        return null;
    }

    @Override
    public List<UserDocument> all()
    {
        return null;
        //return new ArrayList<>( usersMap.values() );
    }

    @Override
    public boolean deleteById( String id )
    {
        //return usersMap.remove( id ) != null;
        return false;
    }

    @Override
    public UserDocument update( UserDto userDto, String id )
    {
        /*if ( usersMap.containsKey( id ) )
        {
            User user = usersMap.get( id );
            user.update( userDto );
            return user;
        }
        else
        {
            return null;
        }*/
        return null;
    }


}
