import java.util.Calendar;
import java.util.Date;

public class Footballer {
    private String lastName;
    private Calendar dateOfBirth;
    private String birthLocation;
    private Role role;
    private int gamesNumber;
    private int yellowCardNumber;

    public int getGamesNumber() {
        return gamesNumber;
    }

    public void setGamesNumber(int gamesNumber) {
        if(gamesNumber > 0) {
            this.gamesNumber = gamesNumber;
        }
    }

    public int getYellowCardNumber() {
        return yellowCardNumber;
    }

    public void setYellowCardNumber(int yellowCardNumber) {
        if(yellowCardNumber > 0) {
            this.yellowCardNumber = yellowCardNumber;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(!lastName.isEmpty()) {
            this.lastName = lastName;
        }
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getBirthLocation() {
        return birthLocation;
    }

    public void setBirthLocation(String birthLocation) {
        if(!lastName.isEmpty()) {
            this.birthLocation = birthLocation;
        }
    }

    public Role getRole() {
        return role;
    }

    public void setRole(String role) {
        switch (role){
            case "защитник":
                this.role = Role.DEFENDER;
                break;
            case "нападающий":
                this.role = Role.ATTACKER;
                break;
            case "вратарь":
                this.role = Role.GOALKEEPER;
                break;
            case "полузащитник":
                this.role = Role.MIDFIELDER;
                break;
            default:
                break;
        }
    }

    
}
