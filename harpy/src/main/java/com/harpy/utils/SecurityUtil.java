package com.harpy.utils;

import java.util.Map;

import org.springframework.security.core.context.SecurityContextHolder;

import com.harpy.support.spring.security.customAuth.UserMapDetailsModel;

public class SecurityUtil {
	public static Map<String, Object> getLoginDetailMap() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal instanceof UserMapDetailsModel) {
			UserMapDetailsModel data = (UserMapDetailsModel) principal;
			return (Map<String, Object>) data.getMapData();
		} else {
			return null;
		}
	}

}
