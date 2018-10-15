import java.util.Objects;

class RaindropConverter {

    String convert(int number) {
        if(number==1){
            return Objects.toString(number);}

            String result1 = checkForFactor3(number);
            String result2 = checkForFactor5(number);
            String result3 = checkForFactor7(number);

            if(Objects.equals(result1,"") && Objects.equals(result2,"") && Objects.equals(result3,"")){
                return Objects.toString(number);
            }

            return result1 + result2 + result3;
    }

    private String checkForFactor7(int number) {
        if(number%7==0){
            return "Plong";
        }
        return "";
    }

    private String checkForFactor5(int number) {
        if(number%5==0) {
            return "Plang";
        }
        return "";
    }

    private String checkForFactor3(int number) {
        if(number%3==0) {
            return "Pling";
        }
        return "";
    }


}
