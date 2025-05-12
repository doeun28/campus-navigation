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
                    showCafeteriaMenu();
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
        System.out.println("\n===== 스마트 캠퍼스 정보 시스템 =====");
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
    private static void showBuildingInfo() {}
