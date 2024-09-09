package com.devsquard.project.memberDomain;

import com.devsquard.project.memberEntity.ProjectMember;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ProjectMemberResponse {
	private String position;
	
	public static ProjectMemberResponse toDTO(ProjectMember projectMember) {
		return ProjectMemberResponse.builder().position(projectMember.getPosition()).build();
	}
}
