import java.util.ArrayList;

public class SlackUser {
    private String fullName;
    private String displayName;
    private ArrayList<SlackUser> teamMembers;

    /**
     * Contructor to initialize a SlackUser with a specified full name and display name
     * @param fullName
     * @param displayName
     * Also this creates an empty ArrayList of object SlackUser
     */

    public SlackUser(String fullName, String displayName) {
        this.fullName = fullName;
        this.displayName = displayName;
        teamMembers = new ArrayList<SlackUser>();
    }


    /**
     * Allows the user to get the full name
     * @return fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Allows user to change the full name
     * @param fullName
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Allows user to get the Display name
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Allows user to change Display name
     * @param displayName
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Allows user to add to ArrayList of object SlackUser
     * @param newMember
     */

    public void addTeamMember(SlackUser newMember) {
        teamMembers.add(newMember);
    }

    /**
     * Creates UserOne that is my name and my username.
     * Then creates userTwo SlackUser named Linus Torvalds and display name ThePenguin
     * Finally adds userTwo to my list of object SlackUser
     */

    public static void main(String[] args) {
        SlackUser userOne = new SlackUser("Gabriel Tinsley", "gttinsley");
        SlackUser userTwo = new SlackUser("Linus Torvalds", "ThePenguin");
        userOne.addTeamMember(userTwo);
    } 
}