package model;

public class UserRole {
    private int roleID;
    private String userName;

    public UserRole() {
    }

    public UserRole(int roleID, String userName) {
        this.roleID = roleID;
        this.userName = userName;
    }

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
