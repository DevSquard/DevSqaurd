package com.devsquard.mypage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsquard.auth.entity.User;
import com.devsquard.mypage.entity.MyProjectCard;

@Repository
public interface MyProfileCardRepository extends JpaRepository<User, Long>{

}
