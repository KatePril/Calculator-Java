import javax.swing.*;

class Model {
    private JLabel label;

    private String number_1_data;
    private String number_2_data;
    private String action_data;

    public Model(JLabel label) {
        this.label = label;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public String getNumber_1_data() {
        return number_1_data;
    }

    public void setNumber_1_data(String number_1_data) {
        this.number_1_data = number_1_data;
    }

    public String getNumber_2_data() {
        return number_2_data;
    }

    public void setNumber_2_data(String number_2_data) {
        this.number_2_data = number_2_data;
    }

    public String getAction_data() {
        return action_data;
    }

    public void setAction_data(String action_data) {
        this.action_data = action_data;
    }

    public  Checkers checkers = new Checkers();

    public void Numbers(String number){
        if (checkers.CheckZero(label.getText()) || checkers.CheckError(label.getText())) {
            label.setText(number);
        } else {
            label.setText(label.getText() + number);
        }
    }

    public void Minus(String minus){
        if (!label.getText().contains(minus)){
            if (checkers.CheckZero(label.getText()) || checkers.CheckError(label.getText())) {
                label.setText(minus);
            } else {
                label.setText(minus + label.getText());
            }
        }
    }

    public void Zero(String zero){
        if (checkers.CheckError(label.getText())) {
            label.setText(zero);
        } else if (checkers.CheckZero(label.getText())){
        } else {
            label.setText(label.getText() + zero);
        }
    }

    public void Point(String point){
        if (!label.getText().contains(point)){
            if (checkers.CheckSpace(label.getText()) || checkers.CheckMinus(label.getText())){
                label.setText( label.getText() + "0.");;
            } else if (checkers.CheckError(label.getText())) {
                label.setText("0.");
            } else {
                label.setText(label.getText() + point);
            }
        }
    }

    public String ReturnResult(String r, double n1, double n2){
        double res = 0.0;
        switch (r){
            case "/":
                if (n2 != 0.0){
                    res = n1 / n2;
                    label.setText(Double.toString(res));
                } else {
                    label.setText("Error");
                }
                break;
            case "*":
                res = n1 * n2;
                label.setText(Double.toString(res));
                break;
            case "-":
                res = n1 - n2;
                label.setText(Double.toString(res));
                break;
            case "+":
                res = n1 + n2;
                label.setText(Double.toString(res));
                break;
            case "^":
                res = Math.pow(n1, n2);
                label.setText(Double.toString(res));
                break;
        }
        return Double.toString(res);
    }

    public void Divide(){
//        JLabel labelTmp = new JLabel();
//        if (!String.valueOf(number_1_data).equals("") && !label.getText().equals("")) {
//            String tmp = ReturnResult(action_data, returnDouble(number_1_data), returnDouble(label.getText()));
//            label.setText(tmp);
//            HistoryItem historyItem = new HistoryItem(number_1_data, number_2_data, action_data, tmp);
//            labelTmp = historyItem.returnHistoryItem();
//        }
        setAction_data("/");
        setNumber_1_data(label.getText());
        label.setText("");
//        return labelTmp;
    }

    public void Multiply(){
//        JLabel labelTmp = new JLabel();
//        if (!String.valueOf(number_1_data).equals("") && !label.getText().equals("")) {
//            String tmp = ReturnResult(action_data, returnDouble(number_1_data), returnDouble(label.getText()));
//            label.setText(tmp);
//            HistoryItem historyItem = new HistoryItem(number_1_data, number_2_data, action_data, tmp);
//            labelTmp = historyItem.returnHistoryItem();
//        }
        setAction_data("*");
        setNumber_1_data(label.getText());
        label.setText("");
//        return labelTmp;
    }

    public void Minus(){
//        JLabel labelTmp = new JLabel();
//        if (!String.valueOf(number_1_data).equals("") && !label.getText().equals("")) {
//            String tmp = ReturnResult(action_data, returnDouble(number_1_data), returnDouble(label.getText()));
//            label.setText(tmp);
//            HistoryItem historyItem = new HistoryItem(number_1_data, number_2_data, action_data, tmp);
//            labelTmp = historyItem.returnHistoryItem();
//        }
        setAction_data("-");
        setNumber_1_data(label.getText());
        label.setText("");
//        return labelTmp;
    }

    public void Plus(){
//        JLabel labelTmp = new JLabel();
//        if (!String.valueOf(number_1_data).equals("") && !label.getText().equals("")) {
//            String tmp = ReturnResult(action_data, returnDouble(number_1_data), returnDouble(label.getText()));
//            label.setText(tmp);
//            HistoryItem historyItem = new HistoryItem(number_1_data, number_2_data, action_data, tmp);
//            labelTmp = historyItem.returnHistoryItem();
//        }
        setAction_data("+");
        setNumber_1_data(label.getText());
        label.setText("");
//        return labelTmp;
    }

    public void Power(){
//        JLabel labelTmp = new JLabel();
//        if (!String.valueOf(number_1_data).equals("") && !label.getText().equals("")) {
//            String tmp = ReturnResult(action_data, returnDouble(number_1_data), returnDouble(label.getText()));
//            label.setText(tmp);
//            HistoryItem historyItem = new HistoryItem(number_1_data, number_2_data, action_data, tmp);
//            labelTmp = historyItem.returnHistoryItem();
//        }
        setAction_data("^");
        setNumber_1_data(label.getText());
        label.setText("");
//        return labelTmp;
    }

    public JLabel Result(){
        JLabel labelTmp = new JLabel();
        setNumber_2_data(label.getText());
        String tmp = ReturnResult(action_data, returnDouble(number_1_data), returnDouble(number_2_data));
        label.setText(tmp);
        HistoryItem historyItem = new HistoryItem(number_1_data, number_2_data, action_data, tmp);
        labelTmp = historyItem.returnHistoryItem();
        return labelTmp;
    }

    public void AC(){
        setNumber_1_data("");
        setNumber_2_data("");
        setAction_data("");
        label.setText("");
    }

    public void C(){
        label.setText("");
    }

    private double returnDouble(String number){
        return Double.parseDouble(number);
    }



}
