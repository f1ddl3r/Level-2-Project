import javax.swing.JOptionPane;

public class AroundTheWorld {
	public void CountryValidator() {
		String UserInput = JOptionPane.showInputDialog("Enter a Country!");
		
 		//JOptionPane.showMessageDialog(null, UserInput.length() - 1);

		if (ValidCountry(UserInput)) {
			JOptionPane.showMessageDialog(null,"That country is in our database");
		} else {
			JOptionPane.showMessageDialog(null, "Sorry, Not in our database!");
		}
	}

	public static boolean ValidCountry(String CountryInput) {
		int i;
		for (i = 0; i < Countries.length; i++) {
			if (CountryInput.equalsIgnoreCase(Countries[i])) {
				break;

			}
		}
		if (i == Countries.length) {
			return false;
		} else {
			return true;
		}
	}
        
	
	public static String[] Countries = { "Afghanistan", "Albania","Algeria","American Samoa","Andorra","Angola","Anguilla","Antigua and Barbuda","Argentina","Armenia","Aruba","Australia","Austria",
		"Azerbaijan","Bahamas","Bahrain","Bangladesh","Barbados","Belarus","Belgium","Belize","Benin","Bermuda","Bhutan","Bolivia","Bosnia","Botswana","Bougainville","Brazil",
		"British Indian Ocean","British Virgin Islands","Brunei","Bulgaria","Burkina Faso","Burundi","Cambodia","Cameroon","Canada","Cape Verde Islands","Cayman Islands","Central African Republic",
		"Chad","Chile","China","Colombia","Comoros","Democratic Republic of the Congo","Cook Islands",
		"Costa Rica","Cote deIvoire","Croatia","Cuba","Cyprus","Czech Republic","Denmark","Djibouti","Dominica","Dominican Republic","Ecuador","Egypt","El Salvador","Equatorial Guinea","Eritrea",
		"Estonia","Ethiopia","Faeroe Islands","Falkland Islands","Federated States of Micronesia","Fiji","Finland","France","French Guiana","French Polynesia","Gabon","Gambia","Georgia",
		"Germany","Ghana","Gibraltar","Greece","Greenland","Grenada","Guadeloupe","Guam","Guatemala","Guinea","Guinea-Bissau","Guyana","Haiti","Holy See (Vatican City State)","Honduras","Hungary",
		"Iceland","India","Indonesia","Iran","Iraq","Ireland","Israel","Italy","Jamaica","Japan","Jordan","Kazakhstan","Kenya","Kiribati","Korea","Korea","Kosovo","Kuwait  Kyrgyzstan","Laos",
		"Latvia","Lebanon","Lesotho","Liberia","Libya","Liechtenstein","Lithuania","Luxembourg","Macedonia","Madagascar","Malawi","Malaysia","Maldives","Mali","Malta","Martinique","Mauritania",
		"Mauritius","Mayotte","Mexico","Moldova","Monaco","Mongolia","Montenegro","Montserrat","Morocco Mozambique","Myanmar","Namibia","Nauru","Nepal","Netherlands","Netherlands Antilles",
		"New Caledonia","New Zealand","Nicaragua","Niger","Nigeria","Norway","Oman","Pakistan","Palestine","Panama","Papua New Guinea","Paraguay","Peru","Philippines","Poland","Portugal",
		"Puerto Rico","Qatar","Reunion","Romania","Russia","Rwanda  Saint Barthelemy","Saint Helena","Saint Kitts & Nevis","Saint Lucia","Saint Martin","Saint Pierre & Miquelon","Saint Vincent",
		"Samoa","San Marino","Sao Tome & Principe","Saudi Arabia","Senegal","Serbia","Seychelles","Sierra Leone","Singapore","Slovakia","Slovenia","Solomon Islands","Somalia","South Africa","Spain",
		"Sri Lanka","Sudan","Suriname","Swaziland","Sweden","Switzerland","Syria","Tajikistan","Tanzania","Thailand","Timor Leste","Togo","Tokelau Islands","Tonga","Trinidad & Tobago","Tunisia",
		"Turkey","Turkmenistan","Turks & Caicos Islands","Tuvalu","Uganda","Ukraine","United Arab Emirates","United Kingdom","United States of America","Uruguay","US Virgin Islands",
		"Uzbekistan","Vanuatu","Venezuela","Vietnam","Wallis & Futuna Islands","Yemen","Yugoslavia","Zambia","Zimbabwe", "Cookie"};
	
	
}
    
