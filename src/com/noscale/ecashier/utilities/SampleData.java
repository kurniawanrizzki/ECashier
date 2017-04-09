package com.noscale.ecashier.utilities;

import com.noscale.ecashier.models.Login;

/**
 * Created by rizkikurniawan on 06/04/17.
 */
public class SampleData {

    public static SampleData instance;

    public static SampleData getInstance() {

        if (null == instance) {
            instance = new SampleData();
        }

        return instance;
    }

    public Login getDummyLoginPerson() {

        Login loginPerson = new Login();
        loginPerson.setUsername("admin");
        loginPerson.setName("TOKO BAHAGIA");
        loginPerson.setPassword(TrippleDES.getInstance().encrypt("#1rstwap"));
        loginPerson.setLevel(1);
        loginPerson.setCreatedBy(1);

        return loginPerson;

    }

}
