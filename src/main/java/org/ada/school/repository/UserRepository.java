package org.ada.school.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<UserDocument,String>{

    List<UserDocument> findByNameOrLastNameLike(String queryText,String last);

    List<UserDocument> findByCreatedAtAfter(Date createdAt);
}


