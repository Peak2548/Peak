import java.util.ArrayList;

class Lab1Coder {
    private String name;
    int experience = 0;
    ArrayList<String> languages = new ArrayList<>();

    Lab1Coder(String n, int exp) {
        name = n;
        experience = exp;
    }
    Lab1Coder(String n) {
		name = n;
		experience = 0;
	}
    Lab1Coder() {}

    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
    void setExperience(int exp) {
        this.experience = exp;
    }
    int getExperience() {
        return experience;
    }
    void setLanguages(String ... lang) {
        for (var x: lang) {
            languages.add(x);
        }
    }
    ArrayList<String> getLanguages() {
        return languages;
    }
    ArrayList<String> findCommonLanguage(Lab1Coder other) {
        ArrayList<String> common = new ArrayList<>();
        for (int i = 0;i < languages.size(); i++) {
            for (int j = 0; j < other.languages.size(); j++) {
                if (this.languages.get(i).equals(other.languages.get(j))) {
                    common.add(this.languages.get(i));
                }
            }
        }
        if (common.isEmpty()) {
            common.add("none");
        }
        return common;
    }
    public String toString() {
		String lang = String.join(" ", this.getLanguages());
	
        return this.getName() + "(" + this.getExperience() + ")" + " knows " + lang;
    }
}