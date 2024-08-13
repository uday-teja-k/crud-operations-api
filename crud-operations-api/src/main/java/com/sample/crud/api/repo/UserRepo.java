package com.sample.crud.api.repo;

import com.sample.crud.api.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long>{

}
