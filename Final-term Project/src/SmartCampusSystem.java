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
             "6", "6동 건물 :",
             "8", "8동 건물 : 대학원, 보건의료대학 본관 ",
             "9", "9동 건물 : 경상대학, 교양 과목 수업도 진행 ",
             "11", "11동 건물 : 중앙도서관, 자율 학습 가능 및 도서 대여 가능 ",
             "13", "13동 건물 : 종합강의동, 주로 교양 수업 진행 ",
             "20", "20동 건물 : 사회과학대학, 사범대학 ",
             "42", "42동 건물 : 새천년 종합정보관, 영어 수업 진행 "
         );
    }
    private static void showSchoolcafeteriaMenu()
