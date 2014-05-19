package com.harpy.support.spring.security.customAuth;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class UserMapDetailsModel extends User {

	public UserMapDetailsModel(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired,
			boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
	}

	public UserMapDetailsModel(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 1L;

	private Object mapData;

	public UserMapDetailsModel(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired,
			boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities, Object mapData) throws IllegalArgumentException {

		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);

		this.mapData = mapData;
	}

	public UserMapDetailsModel(String username, String password, boolean enabled, Collection<? extends GrantedAuthority> authorities, Object mapData)
			throws IllegalArgumentException {
		this(username, password, enabled, true, true, true, authorities, mapData);
	}

	public Object getMapData() {
		return mapData;
	}

	public void setMapData(Object mapData) {
		this.mapData = mapData;
	}
}
