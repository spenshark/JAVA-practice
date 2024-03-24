package start.question.cond;

public class DistanceEx {

    public static void main(String[] args) {
        int distance = 1;
        String transporation;


        if(distance <= 1){
            transporation = "도보";
        } else if (distance <= 10) {
            transporation = "자전거";
        } else if (distance <= 100) {
            transporation = "자동차";
        } else {
            transporation = "비행기";
        }

        System.out.println(transporation + "를 이용하세요");
    }
}
