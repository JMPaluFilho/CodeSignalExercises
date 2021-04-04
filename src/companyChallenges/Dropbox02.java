package companyChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Dropbox02 {

    /*
     * Dropbox holds a competition between schools called CampusCup. If you verify
     * an email address from a college, university, or higher education institution,
     * you earn 20 points toward your school's overall ranking. When a school
     * receives at least 100 points, all of its registered members receive an
     * additional 3 Gb of bonus space each. When the school receives at least 200
     * points, its registered members receive an additional 8 Gb. If the school
     * receives at least 300 points, its members receive an additional 15 Gb. And
     * finally, when a school receives at least 500 points, members receive an
     * additional 25 Gb each.
     *
     * You are given n registered emails, all of them unique. Each email has the
     * following format: "<name>@<domain>", where <name> and <domain> are non-empty
     * strings consisting of lowercase letters and a '.'. Identical domains
     * correspond to the same school and vice versa.
     *
     * Your task is to make a scoreboard, i.e. to sort the schools according to the
     * amount of bonus space they each received (per student not in total). School A
     * must be higher in the standings than school B if A received more space than
     * B, or if they received equal number of gigabytes but the domain string of
     * school A is lexicographically smaller than the one of school B.
     *
     * Example
     *
     * For emails = ["john.doe@mit.edu", "admin@rain.ifmo.ru", "noname@mit.edu"],
     * the output should be campusCup(emails) = ["mit.edu", "rain.ifmo.ru"].
     *
     * "mit.edu" scored 40 points, and "rain.ifmo.ru" just 20. Both universities got
     * no additional space, so "mit.edu" must be higher in the standings because it
     * is lexicographically smaller than "rain.ifmo.ru".
     *
     * For
     *
     * emails = ["b@harvard.edu", "c@harvard.edu", "d@harvard.edu", "e@harvard.edu",
     * "f@harvard.edu", "a@student.spbu.ru", "b@student.spbu.ru",
     * "c@student.spbu.ru", "d@student.spbu.ru", "e@student.spbu.ru",
     * "f@student.spbu.ru", "g@student.spbu.ru"] the output should be
     * campusCup(emails) = ["harvard.edu", "student.spbu.ru"].
     *
     * "harvard.edu" - 100 points, 3 Gb of additional space. "student.spbu.ru" - 140
     * points, also 3 Gb of additional space.
     *
     * "harvard.edu" must be higher in the standings because it is lexicographically
     * smaller than "student.spbu.ru".
     *
     * For
     *
     * emails = ["a@rain.ifmo.ru", "b@rain.ifmo.ru", "c@rain.ifmo.ru",
     * "d@rain.ifmo.ru", "e@rain.ifmo.ru", "noname@mit.edu"] the output should be
     * campusCup(emails) = ["rain.ifmo.ru", "mit.edu"].
     *
     * "mit.edu" - 20 points, no additional space. "rain.ifmo.ru" - 100 points, 3 Gb
     * of additional space.
     *
     * Therefore, "rain.ifmo.ru" must be higher in the standings.
     *
     * Input/Output
     *
     * [execution time limit] 3 seconds (java)
     *
     * [input] array.string emails
     *
     * Registered emails.
     *
     * Guaranteed constraints: 2 ≤ emails.length ≤ 40, 5 ≤ emails[i].length ≤ 20.
     *
     * [output] array.string
     *
     * The list of unique school domains sorted as described above.
     */

    public static void main(String[] args) {

        String[] emails = {"a@rain.ifmo.ru", "b@rain.ifmo.ru", "c@rain.ifmo.ru", "d@rain.ifmo.ru", "e@rain.ifmo.ru",
                "noname@mit.edu"};
//		String[] emails = { "admin@rain.ifmo.ru", "john.doe@mit.edu", "admin@rain.ifmo.ru", "noname@mit.edu" };
        System.out.println(Arrays.toString(campusCup(emails)));
    }

    public static String[] campusCup(String[] emails) {

        List<String> uniqueEmails = new ArrayList<>();
        List<Emails> listE = new ArrayList<>();
        List<String> listOrganizedEmails = new ArrayList<>();
        int score = 0;

        for (String email : emails) {
            String domain = email.substring(email.indexOf("@") + 1);

            if (!uniqueEmails.contains(domain)) {
                uniqueEmails.add(domain);

                for (String lookForDomain : emails) {

                    if (lookForDomain.contains(domain)) {
                        score += 20;
                    }
                }

                Emails e = new Emails();
                e.setEmail(domain);
                e.setLength(domain.length());

                if (score < 100) {
                    e.setScore(5);
                } else if (score < 200) {
                    e.setScore(4);
                } else if (score < 300) {
                    e.setScore(3);
                } else if (score < 500) {
                    e.setScore(2);
                } else {
                    e.setScore(1);
                }

                listE.add(e);
                score = 0;
            }
        }

        sortEmail(listE);

        for (Emails value : listE) {
            String s = value.getEmail();
            listOrganizedEmails.add(s);
        }

        return listOrganizedEmails.toArray(new String[0]);
    }

    public static void sortEmail(List<Emails> list) {
        Comparator<Emails> scoreLengthComparator = Comparator.comparing(Emails::getScore)
                .thenComparing(Emails::getLength);
        list.sort(scoreLengthComparator);
    }

    public static class Emails {

        String email;
        int score;
        int length;

        public Emails() {
            super();
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }
    }
}
