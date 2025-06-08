import java.util.*;

public class SmartCampusSystem {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            printMenu();
            int choice = getChoice();

            switch (choice) {
                case 1:
                    BuildingInfo();
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
                return scanner.nextInt();
            } else {
                System.out.println("숫자만 입력하세요");
                scanner.next();
            }
        }
    }

    class BuildingInfo {
        private final Scanner scanner;
        private final Map<String, String> buildingMap = Map.of(

            "6", "6동 건물 : 융합관, 행정부서/교수연구실/강의실/세미나실/주차장/편의시설/열람실 로 쓰임 공과대학 수업 진행 ",
                "8", "8동 건물 : 보건의료과학대학, 행정부서/교수연구실/강의실/세미나실/주차장/편의시설/열람실 로 쓰임 보건의료과학대학 수업 진행 ",
                "9", "9동 건물 : 경상대학, 행정부서/교수연구실/강의실/세미나실/주차장/편의시설/열람실 로 쓰임 경상대학 수업과 교양 과목 수업도 진행 ",
                "11", "11동 건물 : 중앙도서관, 도서관/열람실/편의시설/주차장 으로 쓰임 자율 학습 가능 및 도서 대여 가능 ",
                "13", "13동 건물 : 종합강의동, 강의실/주차장/편의시설/열람실 로 쓰임 교양 수업 진행 ",
                "20", "20동 건물 : 인문사회 + 사범대학, 행정부서/교수연구실/강의실/세미나실/주차장/편의시설/열람실 로 쓰임 인문사회 그리고 사범대학 수업 진행",
                "42", "42동 건물 : 새천년 종합정보관, 전산정보/어학교육/교수학습개발 로 쓰임 영어 수업 진행 "
        );
        public BuildingInfo(Scanner scanner) {
            this.scanner = scanner;
    }
        System.out.print("건물 번호를 입력하세요 : ");
        String code = scanner.nextLine();
        String info = BuildingInfo.get(code);
        if (info != null) {
            System.out.println("🔎 " + info);
        } else {
            System.out.println("해당 건물 정보를 찾을 수 없습니다.");
        }
    }
    private static void showSchoolcafeteriaMenu() {
        Map<String, String> menuMap = Map.of(
                "월요일", "전주 콩나물국밥, 쌀밥, 떡고기 산적, 양배추 진미채볶음, 김구이, 깍두기",
                "화요일", "마파두부덮밥, 시금치된장국, 꿔바로우, 단무지",
                "수요일", "돼지국밥, 쌀밥, 동그랑땡전, 오이지양파무침, 깍두기",
                "목요일", "육개장, 쌀밥, 사모사튀김, 감자채당근볶음, 깍두기",
                "금요일", "오징어짜글이, 쌀밥, 탕수육, 어묵야채볶음, 배추김치"
        );
        System.out.print("요일을 입력하세요 : ");
        String day = scanner.nextLine();
        String menu = menuMap.get(day);
        if (menu != null) {
            System.out.println("🍴 " + day + "요일 식당 메뉴: " + menu);
        } else {
            System.out.println("입력한 요일의 메뉴 정보를 찾을 수 없습니다.");
        }
    }
    private static Map<String, String> shuttleInfoMap = new LinkedHashMap<>();
    private static void showShuttleSchedule() {
        shuttleInfoMap.put("08:10", "정문 → 생활관 / 학교버스 1");
        shuttleInfoMap.put("08:20", "정문 → 생활관 / 학교버스 2");
        shuttleInfoMap.put("08:30", "정문 → 생활관 / 학교버스 1");
        shuttleInfoMap.put("08:40", "정문 → 생활관 / 학교버스 2");
        shuttleInfoMap.put("09:00", "생활관 → 정문 / 학교버스 1");
        shuttleInfoMap.put("09:10", "생활관 → 정문 / 학교버스 2 (화,수,목 결행)");
        shuttleInfoMap.put("09:20", "생활관 → 정문 / 학교버스 1");
        shuttleInfoMap.put("09:30", "생활관 → 정문 / 미래로관광");
        private static void searchShuttleByTime() {
            System.out.print("조회할 시간을 입력하세요 : ");
            String time = scanner.nextLine();
            String info = shuttleInfoMap.get(time);
            if (info != null) {
                System.out.println("🔍 [" + time + "] " + info);
            } else {
                System.out.println("해당 시간에 운행하는 셔틀이 없습니다.");
            }
        }
        System.out.println("5. 시간으로 셔틀 검색하기");
        case 5 -> searchShuttleByTime();
    }
    








