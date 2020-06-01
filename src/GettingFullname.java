public class GettingFullname {

    private String firstName;
    private String lastName;

    public void setFirstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName;
        } else {
            this.firstName = "";
        }
    }

    public void setLastName(String lastName) {
        if (lastName != null) {
            this.lastName = lastName;
        } else {
            this.lastName = "";
        }
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "Unknown";
        } else if (!firstName.isEmpty() && lastName.isEmpty()) {
            return firstName + " " + "(without additional spaces)";
        } else if (firstName.isEmpty() && !lastName.isEmpty()) {
            return "(without additional spaces)" + " " + lastName;
        }  else {
            return firstName + " " + lastName;
        }
    }

    public static void main(String[] args) {

        GettingFullname tim = new GettingFullname();
        tim.setFirstName("Tim");
        tim.setLastName("Towler");
        System.out.println(tim.getFullName()); // Tim Towler

        GettingFullname katie = new GettingFullname();
        katie.setFirstName("Katie");
        katie.setLastName(null);
        System.out.println(katie.getFullName());

        GettingFullname unknown = new GettingFullname();
        unknown.setFirstName(null);
        unknown.setLastName(null);
        System.out.println(unknown.getFullName());
    }
}
