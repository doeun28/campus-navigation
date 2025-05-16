import java.util.*;

public class SmartCampusSystem {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            printMenu();
            int choice = getChoice();

            switch (choice) {
                case 1:
                    showBuildingInfo();
                    break;
                case 2:
                    showSchoolcafeteriaMenu();
                    break;
                case 3:
                    showShuttleSchedule();
                    break;
                case 4:
                    showTaxiPoints();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("올바른 번호를 입력하세요.");
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("- 스마트 캠퍼스 정보 시스템 -");
        System.out.println("1. 건물 정보 보기");
        System.out.println("2. 식당 메뉴 보기");
        System.out.println("3. 셔틀 시간표 보기");
        System.out.println("4. 택시 승하차 추천 지점 보기");
        System.out.println("0. 종료");
        System.out.print("선택 >> ");
    }


    private static int getChoice() {
        while (true) {
            System.out.print("번호를 입력하세요: ");
            if (scanner.hasNextInt()) {
                return scanner.nextInt(); // 정상 입력이면 리턴
            } else {
                System.out.println("숫자만 입력하세요!");
                scanner.next(); // 잘못된 입력 제거
            }
        }
    }
    private static void showBuildingInfo() {
         Map<String, String> BuildingInfo = Map.of(
             "6", "6동 건물 : 융합관, 행정부서/교수연구실/강의실/세미나실/주차장/편의시설/열람실 로 쓰임 공과대학 수업 진행 ",
             "8", "8동 건물 : 보건의료과학대학, 행정부서/교수연구실/강의실/세미나실/주차장/편의시설/열람실 로 쓰임 보건의료과학대학 수업 진행 ",
             "9", "9동 건물 : 경상대학, 행정부서/교수연구실/강의실/세미나실/주차장/편의시설/열람실 로 쓰임 경상대학 수업과 교양 과목 수업도 진행 ",
             "11", "11동 건물 : 중앙도서관, 도서관/열람실/편의시설/주차장 으로 쓰임 자율 학습 가능 및 도서 대여 가능 ",
             "13", "13동 건물 : 종합강의동, 강의실/주차장/편의시설/열람실 로 쓰임 교양 수업 진행 ",
             "20", "20동 건물 : 인문사회 + 사범대학, 행정부서/교수연구실/강의실/세미나실/주차장/편의시설/열람실 로 쓰임 인문사회 그리고 사범대학 수업 진행",
             "42", "42동 건물 : 새천년 종합정보관, 전산정보/어학교육/교수학습개발 로 쓰임 영어 수업 진행 "
         );
         System.out.print("건물 번호를 입력하세요 : ");
         String code = scanner.nextLine();
    }
