package ud3.ejerciciosclases;

import java.time.LocalDateTime;

public class User {

    private String username;
    private String password;
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime lastLogin;
    private boolean enabled;
    
    //CONSTRUCTORES

    User (String username, String password, String email, boolean enabled) {

        this.username = username;
        this.password = password;
        this.email = email;
        this.enabled = enabled;
        this.createdAt = LocalDateTime.now();
    }

    User (String username, String password) {

        this(username, password, null, true);
        createdAt = LocalDateTime.now();
    }

    User (String username) {

        this(username, null);
    }

    public String getUsername() {
        return username;
    }

    

     
    }
    

