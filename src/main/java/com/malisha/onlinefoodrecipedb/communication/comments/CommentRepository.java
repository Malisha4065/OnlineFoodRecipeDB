package com.malisha.onlinefoodrecipedb.communication.comments;

import com.malisha.onlinefoodrecipedb.users.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
