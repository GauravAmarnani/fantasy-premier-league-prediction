/*
 * Copyright 2021-2022 Gaurav Amarnani.
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

package ams.com.utility;

import ams.com.annotations.Utility;

/**
 * This class contains SQL Queries which are used by DAO Classes after
 * connecting to database.
 * 
 * @author GauravAmarnani
 * @version 1.0
 */

@Utility
public class SQLUtility {

	/**
	 * This variable contains query which will return the authority for a given
	 * username.
	 */

	public static final String AUTHORITY_BY_USERNAME = "SELECT role FROM ams_staff.users WHERE username = ?;";
	
	public static final String USER_BY_USERNAME = "SELECT * FROM ams_staff.users WHERE username = ?;";
	
	public static final String USER_BY_USERNAME_SPECIAL = "SELECT * FROM fpl_users.users WHERE username = ?;";
	
	public static final String USER_BY_ID = "SELECT * FROM ams_staff.users WHERE id = ?;";
	
	public static final String CHECK_IF_ANOTHER_USER_EXISTS_WITH_SAME_NAME = "SELECT email FROM ams_staff.users WHERE username = ? AND id != ?;";
	
	public static final String UPDATE_USERS = "UPDATE ams_staff.users SET email = ?, phoneNumber = ? WHERE username = ?;";
	
	public static final String PASSWORD_BY_USERNAME = "SELECT password from ams_staff.users WHERE username = ?;";
	
	public static final String UPDATE_PASSWORD = "UPDATE ams_staff.users SET password = ? WHERE username = ?;";
	
	public static final String GET_ALL_USERS_BY_AUTHORITY_OTHER_THAN_LOGGED_IN = "SELECT * FROM ams_staff.users WHERE role = ? AND username != ?;";
	
	public static final String ADD_USER = "INSERT INTO `ams_staff`.`users` (`username`, `password`, `email`, `phoneNumber`, `enabled`, `role`) VALUES (?, ?, ?, ?, '1', ?);";

	public static final String ADD_USER_SPECIAL = "INSERT INTO `fpl_users`.`users` (`username`, `password`, `email`, `phoneNumber`, `favTeam`, 'favTeam_isl, `enabled`) VALUES (?, ?, ?, ?, ?, ?, '1');";
	
	public static final String ADD_USER_AUTHORITY = "INSERT INTO `ams_staff`.`authorities` (`username`, `authority`) VALUES (?, ?);";

	public static final String ADD_USER_AUTHORITY_SPECIAL = "INSERT INTO `fpl_users`.`authorities` (`username`, `authority`) VALUES (?, ?);";
}
