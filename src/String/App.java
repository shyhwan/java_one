package String;

public class App {
    public static void main(String[] args) throws Exception {
        String str = "  :: InfraOne || ";
        
        System.out.println("equals              >> " + "  :: InfraOne || ".equals(str));
        System.out.println("equals              >> " + "  :: InfraOne || ".equals(str));
        System.out.println("equalsIgnoreCase    >> " + "  :: InfraOne || ".equalsIgnoreCase(str));
        System.out.println("equalsIgnoreCase    >> " + "  :: InfraOne || ".equalsIgnoreCase(str));
        System.out.println("toString            >> " + str.toString()); // 문자열 반환
        System.out.println("length              >> " + str.length()); // 길이 반환
        System.out.println("charAt              >> " + str.charAt(0)); // 인덱스의 문자 반환
        System.out.println("indexOf             >> " + str.indexOf("C")); // 문자 위치한 인덱스 반환
        System.out.println("substring           >> " + str.substring(2,4)); // 입력 인덱스의 문자 추출
        System.out.println("replace             >> " + str.replace("|", "?")); // 특정 단어 변경
        System.out.println("replaceAll          >> " + str.replaceAll("[a-z]", "!")); // 정규식 사용 가능
        System.out.println("split               >> " + str.split(" ")); // 정규식 사용 가능
        System.out.println("startsWith          >> " + str.startsWith("??")); // 시작 단어 확인
        System.out.println("endsWith            >> " + str.endsWith("??")); // 마지막 단어 확인
        System.out.println("matches             >> " + str.matches("[a-zA-Z]")); // 정규식 만족하는 문자열 확인
        System.out.println("concat              >> " + str.concat(" concat"));
        System.out.println("toCharArray         >> " + str.toCharArray()); // 배열로 반환
        System.out.println("toUpperCase         >> " + str.toUpperCase()); // 대문자 변환
        System.out.println("toLowerCase         >> " + str.toLowerCase()); // 소문자 변환
        System.out.println("trim                >> " + str.trim()); // 앞 뒤 공백 제거
        System.out.println("isEmpty             >> " + str.isEmpty()); // 빈문자열 확인
    }
}
