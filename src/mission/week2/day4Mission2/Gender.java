package mission.week2.day4Mission2;

public enum Gender {
    FEMALE("FEMALE","여성"),
    MALE("MALE","남성"),
    UNKNOWN("UNKNOWN","미정");

    private String englishTerm;
    private String koreanTerm;

     Gender(String englishTerm, String koreanTerm) {
        this.englishTerm = englishTerm;
        this.koreanTerm = koreanTerm;
    }

    public static Gender valueOfGender(String str) {
        String genderStr = str.toUpperCase();
        for(Gender gender : values()){
            if(gender.englishTerm.equals(genderStr)||gender.koreanTerm.equals(genderStr)){
                return gender;
            }
        }
        return UNKNOWN;
    }
}
