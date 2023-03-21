/*
 * Copyright 2021-2022 the original author.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ams.com.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

/**
 * SecurityConfiguration Class helps us to manage the various security features
 * provided by the Spring Framework.
 * 
 * In this Class we can Authenticate and Authorize the Users. Set
 * PasswordEncoders. Set Custom Login and Logout Pages.
 * 
 * @author GauravAmarnani
 * @version 1.0
 */

@EnableWebSecurity(debug = true)
//Not adding @Configuration because @EnableWebSecurity internally calls it anyways.
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	/**
	 * Used by
	 * {@link org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder}
	 * to set this as DataSource for JDBC Authentication.
	 */

	@Autowired
	private DataSource dataSource;

	/**
	 * Used by
	 * {@link org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder}
	 * to set this as default PasswordEncoder.
	 * 
	 * @see org.springframework.security.crypto.password.PasswordEncoder.
	 */

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@SuppressWarnings("deprecation")
	@Autowired
	private NoOpPasswordEncoder noOpPasswordEncoder;

	/**
	 * It helps us create various Users along with Password and Roles. We can also
	 * set PasswordEncoder in this method using this object.
	 * 
	 * @param {@link org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder}
	 *               object helps us to create the User Authentication.
	 */

	
/* This is the original code to be restored:
   TODO: RESTORE THIS CODE.
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication()
			.dataSource(dataSource)
			.passwordEncoder(bCryptPasswordEncoder);
	}
*/
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication()
			.dataSource(dataSource).passwordEncoder(noOpPasswordEncoder);
	}

	/**
	 * It helps us set Authority for each single page or multiple pages. We can also
	 * use it to set Custom Login and Logout Page. We can disable CSRF Protection if
	 * we want with help of HttpSecurity Object.
	 * 
	 * @param {@link org.springframework.security.config.annotation.web.builders.HttpSecurity}
	 *               object helps us to set Authority rights over Web Pages.
	 */



/* This is the original code to be restored:
   TODO: RESTORE THIS CODE.

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/", "/error/", "/hello", "/processExcel").permitAll()
			.antMatchers("/hod", "/hod/*").hasAuthority("HOD")
			.antMatchers("/teacher", "/teacher/*").hasAuthority("TEACHER")
			.and().formLogin()
			.and().httpBasic();
	}
*/
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/", "/error/").permitAll()
			.antMatchers("/user", "/user/*").hasAuthority("USER")
			.and().formLogin()
			.and().httpBasic();
	}
}
