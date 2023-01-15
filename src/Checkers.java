import java.util.Objects;

class Checkers {
    public boolean CheckZero(String val){
        return Objects.equals(val, "0");
    }
    public boolean CheckError(String val){
        return Objects.equals(val, "Error");
    }
    public boolean CheckSpace(String val) {
        return Objects.equals(val, "");
    }
    public boolean CheckMinus(String val) {
        return Objects.equals(val, "-");
    }
}
