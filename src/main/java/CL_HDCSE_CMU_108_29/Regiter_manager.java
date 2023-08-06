package CL_HDCSE_CMU_108_29;

///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.mycompany.gui_login;
//
///**
// *
// * @author Ashen Samarasekera
// */
//
    
    public abstract class Regiter_manager {
    
         private int  tel;
        private String pass;
    private String name;
      private String email; 
         private String user;
    private String address;

    
  
    
    
    /**
     * @return the name_reg
     */
    public String getName() {
        return name;
    }

    /**
     * @param name_reg the name_reg to set
     */
    public void setName_reg(String name) {
        this.name = name;
    }

    /**
     * @return the address_reg
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address_reg the address_reg to set
     */
    public void setAddress(String address_reg) {
        this.address = address;
    }

    /**
     * @return the telreg
     */
    public int getTel() {
        return tel;
    }

    /**
     * @param telreg the telreg to set
     */
    public void setTel(int tel) {
        this.tel = tel;
    }

    /**
     * @return the email_reg
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email_reg the email_reg to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the user_reg
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user_reg the user_reg to set
     */
    public void setUser_reg(String use) {
        this.user = user;
    }

    /**
     * @return the pass_reg
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass_reg the pass_reg to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    // Abstract method (no implementation)
    

}


