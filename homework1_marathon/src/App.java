public class App {
    public static void main(String[] args) throws Exception {
        String names[] = { "Kadir", "Gokhan", "Hakan", "Suzan", "Pinar", "Mehmet", "Ali", "Emel", "Firat", "James",
                "Jale", "Ersin", "Deniz", "Gözde", "Anil", "Burak" };
        int scores[] = { 341, 273, 278, 329, 445, 402, 388, 270, 243, 334, 412, 393, 299, 343, 317, 265 };

        Marathon cuMarathon = new Marathon(names, scores);
        MarathonManager marathonManager = new MarathonManager();

        int first = marathonManager.first(cuMarathon);
        System.out.println("Birinci: " + names[first] + " " + scores[first] + "'");

        int second = marathonManager.second(cuMarathon);
        System.out.println("Ikinci:  " + names[second] + " " + scores[second] + "'");

        int third = marathonManager.third(cuMarathon);
        System.out.println("Ucuncu:  " + names[third] + " " + scores[third] + "'");

        int[] numbers = marathonManager.studentPerScore(cuMarathon);
        System.out.println("A --> " + numbers[0]);
        System.out.println("B --> " + numbers[1]);
        System.out.println("C --> " + numbers[2]);
    }
}
