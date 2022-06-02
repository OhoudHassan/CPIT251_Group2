
package cpit251_group2;

public class Client {
    
    //////////////////////////// client variables information ////////////////////////////
    private String userName;
    private String email;
    private String phone;
    
    //////////////////////////////////// Constructor ////////////////////////////////////
    
    public Client(String userName, String email, String phone) {
        this.userName = userName;
        this.email = email;
        this.phone = phone;
    }

    //////////////////////////// Get, Set and toString methods ////////////////////////////

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "\n ------------------------ Client information ------------------------ " 
                + "\n userName: " + userName + "\n email: " + email + "\n phone: " + phone 
                + "\n ------------------------------------------------------------------";
    }
    
    
}
