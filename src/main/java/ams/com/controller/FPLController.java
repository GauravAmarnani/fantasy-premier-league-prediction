package ams.com.controller;

import java.security.Principal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ams.com.dao.FixtureDAO;
import ams.com.dao.PlayerDAO;
import ams.com.dao.StaffDAOImpl;
import ams.com.dto.Defenders;
import ams.com.dto.Forwards;
import ams.com.dto.GoalKeepers;
import ams.com.dto.MidFielder;
import ams.com.dto.Players;
import ams.com.dto.RankedPlayers;
import ams.com.dto.User;
import ams.com.validation.StaffValidation;

@SuppressWarnings("unused")
@Controller
public class FPLController {
	
	private ArrayList<Players> playersList = new ArrayList<Players>();
	
	@Autowired
	private PlayerDAO playerDAO;
	
	@Autowired
	private FixtureDAO fixtureDAO;
	
	@Autowired
	private StaffValidation staffValidation;
	
	@Autowired
	private StaffDAOImpl staffDAOImpl;

	@Value("#{servletContext.contextPath}")
	private String servletContextPath;
	
	@GetMapping("/")
	public String getHomePage(Model model, Principal principal) {
		if(principal == null) {
			return "redirect:/login";
		}
		return "redirect:/user";
	}
	
	@GetMapping("/registration")
	public String getRegistration(Model model, Principal principal) {
		return "registration-page";
	}
	
	@RequestMapping("/registration/process-registration")
	public String processRegistration(	@RequestParam("firstName") String firstName, 
										@RequestParam("lastName") String lastName, 
										@RequestParam("email") String email, 
										@RequestParam("phoneNumber") Long phoneNumber, 
										@RequestParam("password") String password, Principal principal) {
		System.out.println(firstName + lastName + email + phoneNumber + password);
		User user = new User(firstName+" "+lastName, email, String.valueOf(phoneNumber), password);
		String message = staffValidation.isTheUserApproved(user);
		if(message != null)
			return "redirect:/registration/?error" + message;
		if(staffDAOImpl.findUser(user.getUsername()) != null) 
			return "redirect:/registration/?errorunae";
		if(staffDAOImpl.addTheUser(user) == 1) {
			if(principal == null) 
				return "redirect:/user";
			return "redirect:/registration?dfkdnfkndk";
		}
		return "redirect:/registration?error";
	}
	
	@RequestMapping("/process-registration")
	public String processRegistrationAnotherMethod(	@RequestParam("firstName") String firstName, 
										@RequestParam("lastName") String lastName, 
										@RequestParam("email") String email, 
										@RequestParam("phoneNumber") Long phoneNumber, 
										@RequestParam("password") String password) {
		User user = new User(new String(firstName+" "+lastName).stripTrailing(), email, String.valueOf(phoneNumber), password);
		String message = staffValidation.isTheUserApproved(user);
		if(message != null)
			return "redirect:/registration/?error" + message;
		if(staffDAOImpl.findUser(user.getUsername().trim()) != null) 
			return "redirect:/registration/?errorunae";
		if(staffDAOImpl.addTheUser(user) == 1)
			return "redirect:/user";
		return "redirect:/registration?error";
	}
	
	@GetMapping("/user")
	public String getUserPage(Model model, Principal principal) {
		playersList = playerDAO.generate();
		if(playersList == null) {
			System.out.println("List is null due to some issue.");
			//Write the code to fetch it from the personal database.
		}
		model.addAttribute("username", principal.getName());
		model.addAttribute("path", servletContextPath);
		return "fpl-app-home-page";
	}
	
	@GetMapping("/aboutus")
	public String getAboutUs(Model model, Principal principal) {
		model.addAttribute("username", principal.getName());
		model.addAttribute("path", servletContextPath);
		return "aboutus_page";
	}
	
	@GetMapping("/contact")
	public String getContactUs(Model model, Principal principal) {
		model.addAttribute("username", principal.getName());
		model.addAttribute("path", servletContextPath);
		return "contactus_page";
	}
	
	@GetMapping("/user/fpl")
	public String getFPLPage(Model model, Principal principal) {
		model.addAttribute("username", principal.getName());
		model.addAttribute("path", servletContextPath);
		return "fpl-home-page";
	}
	
	@GetMapping("/user/fpl/stats")
	public String getFPLStatsPage(Model model, Principal principal) {
		System.out.println("Inside Stats Method.");
		model.addAttribute("username", principal.getName());
		model.addAttribute("path", servletContextPath);
		return "fpl-stats-page";
	}
	
	public String mapTeam(String team) {
		switch (team) {
			case "1": {
				return "ARS";
			}
			case "2": {
				return "AVL";
			}
			case "3": {
				return "BOU";
			}
			case "4": {
				return "BRE";
			}
			case "5": {
				return "BHA";
			}
			case "6": {
				return "CHE";
			}
			case "7": {
				return "CRY";
			}
			case "8": {
				return "EVE";
			}
			case "9": {
				return "FUL";
			}
			case "10": {
				return "LEE";
			}
			case "11": {
				return "LEI";
			}
			case "12": {
				return "LIV";
			}
			case "13": {
				return "MCI";
			}
			case "14": {
				return "MUN";
			}
			case "15": {
				return "NEW";
			}
			case "16": {
				return "NFO";
			}
			case "17": {
				return "SOU";
			}
			case "18": {
				return "TOT";
			}
			case "19": {
				return "WHU";
			}
			case "20": {
				return "WOL";
			}
		} return null;
	}
	
	
	@GetMapping("/user/fpl/stats/g")
	public String getFPLStatsPageForGoals(Model model, Principal principal) {
		playerDAO.generate();
		System.out.println("Inside Stats Method.");
		model.addAttribute("username", principal.getName());
		model.addAttribute("path", servletContextPath);
		ArrayList<RankedPlayers> listOfPlayers = playerDAO.fetchListOfPlayersForGoals(playersList);
		for(int i = 0; i < listOfPlayers.size(); i++) 
			listOfPlayers.get(i).setTeam(listOfPlayers.get(i).getTeam());
		model.addAttribute("listOfPlayers", listOfPlayers);
		if(listOfPlayers == null)
			System.out.println("Null list received.");
		return "fpl-stats-page";
	}
	
	@GetMapping("/user/fpl/stats/a")
	public String getFPLStatsPageForAssists(Model model, Principal principal) {
		System.out.println("Inside Stats Method.");
		model.addAttribute("username", principal.getName());
		model.addAttribute("path", servletContextPath);
		ArrayList<RankedPlayers> listOfPlayers = playerDAO.fetchListOfPlayersForAssists(playersList);
		for(int i = 0; i < listOfPlayers.size(); i++) 
			listOfPlayers.get(i).setTeam(listOfPlayers.get(i).getTeam());
		model.addAttribute("listOfPlayers", listOfPlayers);
		if(listOfPlayers == null)
			System.out.println("Null list received.");
		return "fpl-stats-page";
	}
	
	@GetMapping("/user/fpl/stats/r")
	public String getFPLStatsPageForRedCards(Model model, Principal principal) {
		System.out.println("Inside Stats Method.");
		model.addAttribute("username", principal.getName());
		model.addAttribute("path", servletContextPath);
		ArrayList<RankedPlayers> listOfPlayers = playerDAO.fetchListOfPlayersForRedCards(playersList);
		for(int i = 0; i < listOfPlayers.size(); i++) 
			listOfPlayers.get(i).setTeam(listOfPlayers.get(i).getTeam());
		model.addAttribute("listOfPlayers", listOfPlayers);
		if(listOfPlayers == null)
			System.out.println("Null list received.");
		return "fpl-stats-page";
	}
	
	@GetMapping("/user/fpl/stats/y")
	public String getFPLStatsPageForYellowCards(Model model, Principal principal) {
		System.out.println("Inside Stats Method.");
		model.addAttribute("username", principal.getName());
		model.addAttribute("path", servletContextPath);
		ArrayList<RankedPlayers> listOfPlayers = playerDAO.fetchListOfPlayersForYellowCards(playersList);
		for(int i = 0; i < listOfPlayers.size(); i++) 
			listOfPlayers.get(i).setTeam(listOfPlayers.get(i).getTeam());
		model.addAttribute("listOfPlayers", listOfPlayers);
		if(listOfPlayers == null)
			System.out.println("Null list received.");
		return "fpl-stats-page";
	}
	
	@GetMapping("/user/fpl/stats/cs")
	public String getFPLStatsPageForCleanSheets(Model model, Principal principal) {
		System.out.println("Inside Stats Method.");
		model.addAttribute("username", principal.getName());
		model.addAttribute("path", servletContextPath);
		ArrayList<RankedPlayers> listOfPlayers = playerDAO.fetchListOfPlayersForCleanSheets(playersList);
		for(int i = 0; i < listOfPlayers.size(); i++) 
			listOfPlayers.get(i).setTeam(listOfPlayers.get(i).getTeam());
		model.addAttribute("listOfPlayers", listOfPlayers);
		if(listOfPlayers == null)
			System.out.println("Null list received.");
		return "fpl-stats-page";
	}
	
	@GetMapping("/user/fpl/fixtures")
	public String getFPLFixturesPage(Model model, Principal principal) {
		model.addAttribute("username", principal.getName());
		model.addAttribute("path", servletContextPath);
		return "fpl-fixtures-page";
	}
	
	@GetMapping("/user/fpl/favteam")
	public String getFPLFavTeamPage(Model model, Principal principal) {
		model.addAttribute("username", principal.getName());
		model.addAttribute("path", servletContextPath);
		return "fpl-fav-team-page";
	}
	
	@GetMapping("/user/fpl/favteam/picked")
	public String saveFPLFavTeam(Model model, Principal principal) {
		return "fpl-home-page";
	}
	
	@GetMapping("/user/fpl/predictions")
	public String predictTeam(Model model, Principal principal) {
		model.addAttribute("username", principal.getName());
		model.addAttribute("path", servletContextPath);
		fixtureDAO.initializeTeamFixtures();
		ArrayList<GoalKeepers> listOfGoalies = playerDAO.generatePredictionForGoalKeepers();
		Collections.sort(listOfGoalies, new Comparator<GoalKeepers>() {
	        public int compare(GoalKeepers o2, GoalKeepers o1) {
	            return Double.compare(o1.getPerformance(), o2.getPerformance());
	        }
	    });
		ArrayList<Defenders> listOfDefenders = playerDAO.generatePredictionForDefenders();
		Collections.sort(listOfDefenders, new Comparator<Defenders>() {
	        public int compare(Defenders o2, Defenders o1) {
	            return Double.compare(o1.getPerformance(), o2.getPerformance());
	        }
	    });
		ArrayList<MidFielder> listOfMidfielders = playerDAO.generatePredictionForMidFielders();
		Collections.sort(listOfMidfielders, new Comparator<MidFielder>() {
	        public int compare(MidFielder o2, MidFielder o1) {
	            return Double.compare(o1.getPerformance(), o2.getPerformance());
	        }
	    });
		ArrayList<Forwards> listOfForwards = playerDAO.generatePredictionForForwards();
		Collections.sort(listOfForwards, new Comparator<Forwards>() {
	        public int compare(Forwards o2, Forwards o1) {
	            return Double.compare(o1.getPerformance(), o2.getPerformance());
	        }
	    });
		ArrayList<RankedPlayers> finalGoalies = playerDAO.createFinalTeam1(listOfGoalies);
		ArrayList<RankedPlayers> finalDefenders = playerDAO.createFinalTeam2(listOfDefenders);
		ArrayList<RankedPlayers> finalMidfielders = playerDAO.createFinalTeam3(listOfMidfielders);
		ArrayList<RankedPlayers> finalForwards = playerDAO.createFinalTeam4(listOfForwards);
		
		model.addAttribute("g1", finalGoalies.get(0).getTeam());
		model.addAttribute("g1_team", finalGoalies.get(0).getName());
		model.addAttribute("g2", finalGoalies.get(1).getTeam());
		model.addAttribute("g2_team", finalGoalies.get(1).getName());
		model.addAttribute("d1", finalDefenders.get(0).getTeam());
		model.addAttribute("d1_team", finalDefenders.get(0).getName());
		model.addAttribute("d2", finalDefenders.get(1).getTeam());
		model.addAttribute("d2_team", finalDefenders.get(1).getName());
		model.addAttribute("d3", finalDefenders.get(2).getTeam());
		model.addAttribute("d3_team", finalDefenders.get(2).getName());
		model.addAttribute("d4", finalDefenders.get(3).getTeam());
		model.addAttribute("d4_team", finalDefenders.get(3).getName());
		model.addAttribute("d5", finalDefenders.get(4).getTeam());
		model.addAttribute("d5_team", finalDefenders.get(4).getName());
		model.addAttribute("m1", finalMidfielders.get(0).getTeam());
		model.addAttribute("m1_team", finalMidfielders.get(0).getName());
		model.addAttribute("m2", finalMidfielders.get(1).getTeam());
		model.addAttribute("m2_team", finalMidfielders.get(1).getName());
		model.addAttribute("m3", finalMidfielders.get(2).getTeam());
		model.addAttribute("m3_team", finalMidfielders.get(2).getName());
		model.addAttribute("m4", finalMidfielders.get(3).getTeam());
		model.addAttribute("m4_team", finalMidfielders.get(3).getName());
		model.addAttribute("m5", finalMidfielders.get(4).getTeam());
		model.addAttribute("m5_team", finalMidfielders.get(4).getName());
		model.addAttribute("f1", finalForwards.get(0).getTeam());
		model.addAttribute("f1_team", finalForwards.get(0).getName());
		model.addAttribute("f2", finalForwards.get(1).getTeam());
		model.addAttribute("f2_team", finalForwards.get(1).getName());
		model.addAttribute("f3", finalForwards.get(2).getTeam());
		model.addAttribute("f3_team", finalForwards.get(2).getName());
		return "temp-page";
	}
	
	@GetMapping("/user/isl")
	public String getISLPage(Model model, Principal principal) {
		model.addAttribute("username", principal.getName());
		model.addAttribute("path", servletContextPath);
		return "isl-home-page";
	}
	
	@GetMapping("/user/isl/stats")
	public String getISLStatsPage(Model model, Principal principal) {
		model.addAttribute("username", principal.getName());
		model.addAttribute("path", servletContextPath);
		return "isl-stats-page";
	}
	
	@GetMapping("/user/isl/fixtures")
	public String getISLFixturesPage(Model model, Principal principal) {
		model.addAttribute("username", principal.getName());
		model.addAttribute("path", servletContextPath);
		return "isl-fixtures-page";
	}
	
	@GetMapping("/user/isl/favteam")
	public String getISLFavTeamPage(Model model, Principal principal) {
		model.addAttribute("username", principal.getName());
		model.addAttribute("path", servletContextPath);
		return "isl-fav-team-page";
	}
	
	@GetMapping("/user/isl/favteam/picked")
	public String saveISLFavTeam(Model model, Principal principal) {
		return "isl-home-page";
	}
	
	@GetMapping("/user/fpl/temp")
	public String temp(Model model) {
		model.addAttribute("path", servletContextPath);
		model.addAttribute("g1_team", "ARS");
		return "temp-page";
	}
}
