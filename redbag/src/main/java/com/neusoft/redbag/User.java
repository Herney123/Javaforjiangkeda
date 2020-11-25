package com.neusoft.redbag;

import javax.persistence.Id;

public class User {
    @Id

    private String id;
    private String username;
    private String password;
    private String email;

}
