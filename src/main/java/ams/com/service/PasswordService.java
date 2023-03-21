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

package ams.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import ams.com.dao.PasswordDAOImpl;
import ams.com.dto.PasswordDTO;

/**
 * This class will provide many utility functions which will help in dealing
 * with the functionality revolving the password of the user.
 * 
 * @author GauravAmarnani
 * @version 1.0
 */

@Component
public class PasswordService {

	@Autowired
	private PasswordDAOImpl passwordDAOImpl;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public String changePassword(String userName, PasswordDTO passwordDTO) {
		String currentPassword = passwordDTO.getCurrentPassword();
		String newPassword = passwordDTO.getNewPassword();
		String confirmPassword = passwordDTO.getConfirmPassword();
		String encodedNewPassword = passwordEncoder.encode(newPassword);
		
		if ((!(currentPassword.isBlank())) && (!(newPassword.isBlank())) && (!(confirmPassword.isBlank()))) {

			if (passwordDAOImpl.checkIfPasswordIsCorrect(userName, currentPassword)) {

				if (!(currentPassword.equals(newPassword))) {

					if (newPassword.equals(confirmPassword)) {

						if (passwordDAOImpl.updatePassword(userName, encodedNewPassword))
							return "success";
						else
							return "unknownError";
					} else 
						return "newAndConfirmTypo";
				} else
					return "samePassword";
			} else 
				return "wrongPassword";
		} else 
			return "whiteSpaces";
	}
	
	public String encodePassword(String password) {
		return passwordEncoder.encode(password);
	}
}
