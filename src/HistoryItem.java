import javax.swing.*;

class HistoryItem {
    private String number_1_data;
    private String number_2_data;
    private String data_action;
    private String result;

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

    public String getData_action() {
        return data_action;
    }

    public void setData_action(String data_action) {
        this.data_action = data_action;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public HistoryItem(String number_1_data, String number_2_data, String data_action, String result) {
        this.number_1_data = number_1_data;
        this.number_2_data = number_2_data;
        this.data_action = data_action;
        this.result = result;
    }

    public JLabel returnHistoryItem(){
        String history = getNumber_1_data() +" "+ getData_action() +" "+ getNumber_2_data() +" = "+ getResult();
        JLabel labelNew = new JLabel();
        labelNew.setText(history);
        return labelNew;
    }

}
