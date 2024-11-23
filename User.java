enum UserType {
    CLIENT,
    LIBRARIAN
}

class User {
    private int id;
    private String name;
    private int contactInfo;
    private UserType role;

    public User (int id,String name,int contactInfo,UserType role){
        this.id = id;  
        this.name = name;  
        this.contactInfo = contactInfo; 
        this.role = role; 
    }

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for phone
    public int getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(int contactInfo) {
        this.contactInfo = contactInfo;
    }

    // Getter and Setter for role (UserType)
    public UserType getRole() {
        return role;
    }

    public void setRole(UserType role) {
        this.role = role;
    }
}
