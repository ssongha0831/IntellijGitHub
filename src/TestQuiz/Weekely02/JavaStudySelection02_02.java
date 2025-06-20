/*
송하연
 */
package TestQuiz.Weekely02;
import java.util.*;
import java.util.Random;

class Candidate {
    private int candidateNumber;
    private String candidateName;
    private int votes = 0;

    public Candidate(int candidateNumber, String candidateName) {
        this.candidateNumber = candidateNumber;
        this.candidateName = candidateName;
    }

    public int votes() {
        return ++votes;
    }

    public int getCandidateNumber() {
        return candidateNumber;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public int getVotes() {
        return votes;
    }


}

public class JavaStudySelection02_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Map<Integer, Candidate> candidateMap = new HashMap<>();
        Set<String> nameSet = new HashSet<>();

        int totalVotes = 0;

        while (true) {

            System.out.print("총 진행할 투표수를 입력해 주세요. (1~10000) : ");
            totalVotes = scanner.nextInt();
            if (totalVotes >= 1 && totalVotes <= 10000) {
                break;
            }
            System.out.println("잘못된 입력입니다. 1~10000 사이의 값을 입력하세요.");
        }

        int candidateCount = 0;

        while (true) {
            System.out.print("가상 선거를 진행할 후보자 인원을 입력해 주세요. (2~10): ");
            candidateCount = scanner.nextInt();
            if (candidateCount >= 2 && candidateCount <= 10) {
                break;
            }
            System.out.println("잘못된 입력입니다. 2~10 사이의 값을 입력하세요.");
        }

        // 이름 중복 확인
        for (int i = 1; i <= candidateCount; i++) {
            System.out.print(i + "번째 후보자 이름을 입력해 주세요. ");
            String name = scanner.next();

            if (nameSet.contains(name)) {
                System.out.println("중복된 이름입니다. 다시 입력하세요.");
                i--;
                continue;
            }

            nameSet.add(name);
            candidateMap.put(i, new Candidate(i, name));
        }

        // 투표진행률
        for (int i = 1; i <= totalVotes; i++) {
            int selected = random.nextInt(candidateCount) + 1;
            Candidate voted = candidateMap.get(selected);
            voted.votes();

            double progress = (double) i / totalVotes * 100;
            System.out.printf("[투표 진행률] %.1f%% %d명 투표 -> %s\n", progress, i, voted.getCandidateName());


            for (Map.Entry<Integer, Candidate> entry : candidateMap.entrySet()){
                int number = entry.getKey();
                Candidate c = entry.getValue();

                int voteCount = c.getVotes();
                double voteRate = (double) voteCount / totalVotes * 100;

                System.out.printf("[기호:%d] %s: %.2f%% (투표수 : %d)\n", c.getCandidateNumber(), c.getCandidateName(), voteRate, voteCount);
            }
            System.out.println();
        }

        int maxVotes = 0;
        List<Candidate> winners = new ArrayList<>();

        for (Candidate c : candidateMap.values()) {
            int voteCount = c.getVotes();
            if (voteCount > maxVotes) {
                maxVotes = voteCount;
            }
        }

        // 동점일 경우
        for (Candidate c : candidateMap.values()) {
            if (c.getVotes() == maxVotes) {
                winners.add(c);
            }
        }


        if (winners.size() == 1) {
            System.out.printf("[투표결과] 당선인 : %s", winners.get(0).getCandidateName());
        } else {
            System.out.print("[투표결과] 동점 당선인 : ");
            for (int i = 0; i < winners.size(); i++) {
                System.out.print(winners.get(i).getCandidateName());
                if (i != winners.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
