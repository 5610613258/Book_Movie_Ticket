package Customer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public final class User {

    // field
    protected String name;
    protected String Tel;

    //constructor
    User(String name, String Tel) {
        this.setName(name);
        this.setTel(Tel);
    }

    //method
    public void setName(String name) {
        this.name = name;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return Tel;
    }
    
   
    
}
