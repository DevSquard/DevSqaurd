package com.devsquard.mypage.service;

import java.time.LocalDate;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.devsquard.auth.entity.User;
import com.devsquard.mypage.repository.MyProfileCardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MyProfileCardService {
	private final MyProfileCardRepository myProfileCardRepository;

	public User getUserById(Long id) {
		return myProfileCardRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("회원 정보가 없습니다"));
	}

	public Set<LocalDate> getUserStreaks(Long id) {
		User user = myProfileCardRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("회원 정보가 없습니다"));
		return user.getStreakDates();
	}
}
