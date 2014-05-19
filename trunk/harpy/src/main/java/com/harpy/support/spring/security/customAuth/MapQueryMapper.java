package com.harpy.support.spring.security.customAuth;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.harpy.support.spring.security.customAuth.MappingSqlQuery;
import com.harpy.support.spring.security.customAuth.UserMapDetailsModel;
import com.harpy.utils.CommonUtil;

public class MapQueryMapper extends MappingSqlQuery {
	
	public MapQueryMapper(DataSource ds, String usersByUsernameQuery) {
		super(ds, usersByUsernameQuery);
	}

	@Override
	protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
		String userid = rs.getString("userid");
		String password = rs.getString("password");
		boolean enabled = rs.getBoolean("enabled");
		
		Map<String, Object> mapData = new HashMap<String, Object>();
		try {
			mapData = CommonUtil.transMapToResultSet(rs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority("HOLDER"));
  
		return new UserMapDetailsModel(userid, password, enabled, authorities, mapData);
	}
}
