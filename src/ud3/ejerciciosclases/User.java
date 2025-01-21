package ud3.ejerciciosclases;

import java.time.LocalDateTime;

public class User {

    private String username;
    @SuppressWarnings("unused")
    private String password;
    @SuppressWarnings("unused")
    private String email;
    @SuppressWarnings("unused")
    private LocalDateTime createdAt;
    @SuppressWarnings("unused")
    private LocalDateTime lastLogin;
    @SuppressWarnings("unused")
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
    

