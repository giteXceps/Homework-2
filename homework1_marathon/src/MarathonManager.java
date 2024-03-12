public class MarathonManager {

    // birinci kosucunun arraydeki yerini donduren fonksiyon
    public int first(Marathon marathon) {
        int[] scores = marathon.getScores();
        int min = scores[0];
        for (int score : scores) { // 1. olan kisinin skorunu bulur
            if (score < min)
                min = score;
        }

        int i = 0;
        for (i = 0; i < 16; i++) { // 1. olan kisinin dizideki konumunu bulur
            if (scores[i] == min) {
                break;
            }
        }
        return i;
    }

    // ikinci kosucunun arraydeki yerini donduren fonksiyon
    public int second(Marathon marathon) {
        int[] scores = marathon.getScores();
        int min = scores[0];
        MarathonManager marathonManager = new MarathonManager();
        int first = marathonManager.first(marathon);

        for (int i = 0; i < 16; i++) { // 2. olan kisinin skorunu bulur
            if (i == first) {
                continue;
            }

            else if (scores[i] < min)
                min = scores[i];
        }

        int i = 0;
        for (i = 0; i < 16; i++) { // 2. olan kisinin dizideki konumunu bulur
            if (scores[i] == min) {
                break;
            }
        }
        return i;
    }

    // ucuncu kosucunun arraydeki yerini donduren fonksiyon
    public int third(Marathon marathon) {
        int[] scores = marathon.getScores();
        int min = scores[0];

        MarathonManager marathonManager = new MarathonManager();
        int first = marathonManager.first(marathon);
        int second = marathonManager.second(marathon);

        for (int i = 0; i < 16; i++) { // 3. olan kisinin skorunu bulur
            if (i == first) {
                continue;
            }

            if (i == second) {
                continue;
            }

            else if (scores[i] < min)
                min = scores[i];
        }

        int i = 0;
        for (i = 0; i < 16; i++) { // 3. olan kisinin dizideki konumunu bulur
            if (scores[i] == min) {
                break;
            }
        }
        return i;
    }

    // skorlara gore siniflara dusen ogrenci sayisini bulan fonksiyon
    public int[] studentPerScore(Marathon marathon) {
        int[] numbers = { 0, 0, 0 };
        int[] scores = marathon.getScores();
        int temp = 0;

        for (int score : scores) {
            temp = score / 100;
            numbers[temp - 2]++;
        }
        return numbers;
    }
}
