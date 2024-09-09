package com.devsquard.mypage.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsquard.auth.entity.User;
import com.devsquard.mypage.service.MyProfileCardService;

import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/mypage")
@RequiredArgsConstructor
public class MyProfileCardController {
	private final MyProfileCardService mypageProfileService;

	@GetMapping("/{id}")
	public User getUserById(@PathVariable("id") Long id) {
		return mypageProfileService.getUserById(id);
	}

	@GetMapping("/{id}/streaks")
	public Set<LocalDate> getUserStreaks(@PathVariable("id") Long id) {
		return mypageProfileService.getUserStreaks(id);
	}

}
