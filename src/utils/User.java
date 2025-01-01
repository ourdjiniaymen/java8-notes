package utils;

import java.util.Objects;
import java.util.Optional;

public class User {
    private String name;
    private Profile profile;

    public User(){}
    public User(String name){
        this.name = name;
    }

    public User(Profile profile){
        this.profile = profile;
    }


    public String getName(){
        return this.name;
    }

    public Optional<Profile> getProfile(){
        return Optional.ofNullable(profile);
    }
}
