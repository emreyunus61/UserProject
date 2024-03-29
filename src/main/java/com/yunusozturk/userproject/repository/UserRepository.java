package com.yunusozturk.userproject.repository;

import com.yunusozturk.userproject.dto.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDto,Long> {
}
