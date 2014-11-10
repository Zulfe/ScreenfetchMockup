/*
 * GNU GPL License
 * This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
    
 */

/* 
 * Contact Information:
 * N/A
 * 
 * 
 */

package SysInfo;

public class TermInfo {
	public static void main(String[] args){
		//Create object from object type Client (specific to this program) which accepts value
		//types of SYSOS, SYSVERS, SYSARCH, USERID, and USERLOC.
		Client currentUser = new Client();
		
		//Super unnecessary JOP used for debugging, disabled by default (you will need to import JOP to use it.
		//#JOptionPane.showMessageDialog(null, "We're now going to pull some system information...");
		
		//A string of arrays that contain the system information. The first three are blanked out
		//so that the useful information is displayed towards the middle of the icon.
		String[] userArray = {
		"",
		"",
		"",
		currentUser.SYSOS = "SYSOS = " + (System.getProperty("os.name"))/*For debugging, add ' + "windows" ' */,
		currentUser.SYSVERS = "SYSVERS = " + (System.getProperty("os.version")),
		currentUser.SYSARCH = "SYSARCH = " + (System.getProperty("os.arch")),
		currentUser.USERID = "USERID = " + (System.getProperty("user.name")),
		currentUser.USERLOC = "USERLOC = " + (System.getProperty("user.country")),
		};
		
		//Just some space to focus the terminal more one the output.
		for(int beginSpace = 0; beginSpace != 4; beginSpace++){
			System.out.println("");
		}
		
		//icons
		if((currentUser.SYSOS).toLowerCase().contains("windows")){
			String icon[] = {"        ,.=:!!t3Z3z.,",
							 "       :tt:::tt333EE3",
							 "       Et:::ztt33EEEL @Ee.,      ..,",
							 "      ;tt:::tt333EE7 ;EEEEEEttttt33#",
							 "     :Et:::zt333EQ. $EEEEEttttt33QL",
							 "     it::::tt333EEF @EEEEEEttttt33F",
							 "    ;3=*^```\"*4EEV :EEEEEEttttt33@",
							 "    ,.=::::!t=.,  ` @EEEEEEtttz33QF",
							 "   ;:::::::::zt33)   \"4EEEtttji3P*",
							 "  :t:::::::::tt33.:Z3z..  `` ,..g.",
							 "  i:::::::::zt33F AEEEtttt::::ztF",
							 " ;::::::::::t33V ;EEEttttt::::t3",
							 " E:::::::::zt33L @EEEtttt::::z3F",
							 "{3=*^```\"*4E3)  ;EEEtttt::::::tZ`",
							 "             `  :EEEEtttt::::z7",
							 "                  \"VEzjt:;;z>*`"};
			iconDisplay(icon, userArray);
		} else if((currentUser.SYSOS).toLowerCase().contains("linux")){
			String icon[] = {"              a8888b.",
							 "             d888888b. ",
							 "             8P\"YP\"Y88",
							 "             8|o||o|88 ",
							 "             8'    .88 ",
							 "             8`._.' Y8. ",
							 "            d/      `8b.",
							 "           dP   .    Y8b. ",
							 "          d8:'  \"  `::88b",
							 "         d8\"         'Y88b",
							 "        :8P    '      :888",
							 "         8a.   :     _a88P",
							 "       ._/\"Yaa_:   .| 88P|",
							 "       \\    YP\"    `| 8P  `.",
							 "       /     \\.___.d|    .'",
							 "       `--..__)8888P`._.'",
							 "",};
			iconDisplay(icon, userArray);
		} else if((currentUser.SYSOS).toLowerCase().contains("mac")){
			String icon[] = {"                 -/+:.",
							 "                :++++.",
							 "               /+++/.",
							 "       .;~::~ .+/:~``.::~",
							 "    .:/++++++/::::/+++++/:`",
							 "  .:///////////////////:`",
							 " /////////////////////`",
							 "-+++++++++++++++++++++'",
							 "/+++++++++++++++++++++/",
							 "/ssssssssssssssssssssss.",
							 " :sssssssssssssssssssssss-",
							 "  ossssssssssssssssssssssso/`",
							 "  `syyyyyyyyyyyyyyyyyyyyyyyy+`",
							 "   `osssssssssssssssssssssss/",
							 "    :ooooooooooooooooooooo+.",
							 "     `:+oo+/:~..~:/+o+o/~",
							 };
			iconDisplay(icon, userArray);
		}
		
		//Debugging sysout's.
		////System.out.println("SYSOS = " + currentUser.SYSOS);
		////System.out.println("SYSVERS = " + currentUser.SYSOS + " v" + currentUser.SYSVERS);
		////System.out.println("USERID = " + currentUser.USERID);
		////System.out.println("USERLOC = " + currentUser.USERLOC);
		
		//More space to focus the terminal on the output.
		for(int endSpace = 0; endSpace != 4; endSpace++){
			System.out.println("");
		}
		
	}
	
	//
	public static void iconDisplay(String[] icon, String[] userArray){
		for(int i = 0; i < icon.length; i++){
			//If the line number is less than the number of Client items, start printing available
			//Client items (by default, 8 (3 blanks and 5 items).
			if(i <= (userArray.length - 1)){
				//Print line of icon.
				System.out.print(icon[i]);
				//Print spaces based on length of line of icon (in characters) to keep information aligned.
				for(int j = 1; j < (49 - icon[i].length()); j++){
					System.out.print(" ");
				}
				//Print information.
				System.out.println(userArray[i]);
			}
			//If there are no Client items available, just print the rest of the icon.
			else
				System.out.println(icon[i]);
		}
	}
}

