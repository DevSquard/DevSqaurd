package com.devsquard.mypage.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsquard.auth.entity.User;
import com.devsquard.mypage.dto.MyProfileCardDTO;
import com.devsquard.mypage.service.MyProfileCardService;

import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/devsquad/mypage")
@RequiredArgsConstructor
public class MyProfileCardController {
	private final MyProfileCardService myProfileCardService;

	@GetMapping("/{id}")
	public MyProfileCardDTO getUserById(@PathVariable("id") Long id) {
		return myProfileCardService.getUserById(id);
	}
}
