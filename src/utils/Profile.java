package utils;

import java.util.Optional;

public class Profile {
    private ProfileDetails profileDetails;

    public Profile(){}
    public Profile(ProfileDetails profileDetails){
        this.profileDetails = profileDetails;
    }

    public Optional<ProfileDetails> getProfileDetails(){
        return Optional.ofNullable(this.profileDetails);
    }
}
