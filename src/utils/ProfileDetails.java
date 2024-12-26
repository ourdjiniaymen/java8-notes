package utils;

import java.util.Optional;

public class ProfileDetails {
    private String email;
    public ProfileDetails(){}
    public ProfileDetails(String email){
        this.email = email;
    }
    public Optional<String> getEmail(){
        return Optional.ofNullable(email);
    }
}
