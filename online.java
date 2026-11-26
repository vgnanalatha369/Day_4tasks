
import java.util.*;

public class online {
    public static void main(String[] args) {

        TreeSet<String> skills = new TreeSet<>();

        // 1. Store technical skills
        skills.add("Java");
        skills.add("Python");
        skills.add("React");
        skills.add("SQL");
        skills.add("MongoDB");

        // 2. Add new skills
        skills.add("HTML");
        skills.add("CSS");

        // 3. Prevent duplicate skills
        skills.add("Java");

        // 4. Display skills in alphabetical order
        System.out.println("All Technical Skills:");
        System.out.println(skills);

        // 5. Remove a skill
        skills.remove("SQL");

        System.out.println("\nAfter Removing SQL:");
        System.out.println(skills);

        // 6. Search for a particular skill
        String searchSkill = "Python";

        if (skills.contains(searchSkill)) {
            System.out.println("\nSkill Found: " + searchSkill);
        } else {
            System.out.println("\nSkill Not Found");
        }

        // 7. Display first and last skills
        System.out.println("\nFirst Skill: " + skills.first());
        System.out.println("Last Skill: " + skills.last());

        // 8. Display skills in descending order
        System.out.println("\nSkills in Descending Order:");
        System.out.println(skills.descendingSet());
    }
}
