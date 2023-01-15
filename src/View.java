import javax.swing.*;
import java.awt.*;

class View {
    private JLabel label;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btn0;
    private JButton btnM;
    private JButton btnP;
    private JButton btnAC;
    private JButton btnC;
    private JButton btnDiv;
    private JButton btnMult;
    private JButton btnMin;
    private JButton btnPlus;
    private JButton btnPow;
    private JButton btnRes;
    private JPanel panelHistory;

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public JButton getBtn1() {
        return btn1;
    }

    public void setBtn1(JButton btn1) {
        this.btn1 = btn1;
    }

    public JButton getBtn2() {
        return btn2;
    }

    public void setBtn2(JButton btn2) {
        this.btn2 = btn2;
    }

    public JButton getBtn3() {
        return btn3;
    }

    public void setBtn3(JButton btn3) {
        this.btn3 = btn3;
    }

    public JButton getBtn4() {
        return btn4;
    }

    public void setBtn4(JButton btn4) {
        this.btn4 = btn4;
    }

    public JButton getBtn5() {
        return btn5;
    }

    public void setBtn5(JButton btn5) {
        this.btn5 = btn5;
    }

    public JButton getBtn6() {
        return btn6;
    }

    public void setBtn6(JButton btn6) {
        this.btn6 = btn6;
    }

    public JButton getBtn7() {
        return btn7;
    }

    public void setBtn7(JButton btn7) {
        this.btn7 = btn7;
    }

    public JButton getBtn8() {
        return btn8;
    }

    public void setBtn8(JButton btn8) {
        this.btn8 = btn8;
    }

    public JButton getBtn9() {
        return btn9;
    }

    public void setBtn9(JButton btn9) {
        this.btn9 = btn9;
    }

    public JButton getBtn0() {
        return btn0;
    }

    public void setBtn0(JButton btn0) {
        this.btn0 = btn0;
    }

    public JButton getBtnM() {
        return btnM;
    }

    public void setBtnM(JButton btnM) {
        this.btnM = btnM;
    }

    public JButton getBtnP() {
        return btnP;
    }

    public void setBtnP(JButton btnP) {
        this.btnP = btnP;
    }

    public JButton getBtnAC() {
        return btnAC;
    }

    public void setBtnAC(JButton btnAC) {
        this.btnAC = btnAC;
    }

    public JButton getBtnC() {
        return btnC;
    }

    public void setBtnC(JButton btnC) {
        this.btnC = btnC;
    }

    public JButton getBtnDiv() {
        return btnDiv;
    }

    public void setBtnDiv(JButton btnDiv) {
        this.btnDiv = btnDiv;
    }

    public JButton getBtnMult() {
        return btnMult;
    }

    public void setBtnMult(JButton btnMult) {
        this.btnMult = btnMult;
    }

    public JButton getBtnMin() {
        return btnMin;
    }

    public void setBtnMin(JButton btnMin) {
        this.btnMin = btnMin;
    }

    public JButton getBtnPlus() {
        return btnPlus;
    }

    public void setBtnPlus(JButton btnPlus) {
        this.btnPlus = btnPlus;
    }

    public JButton getBtnPow() {
        return btnPow;
    }

    public void setBtnPow(JButton btnPow) {
        this.btnPow = btnPow;
    }

    public JButton getBtnRes() {
        return btnRes;
    }

    public void setBtnRes(JButton btnRes) {
        this.btnRes = btnRes;
    }

    public JPanel getPanelHistory() {
        return panelHistory;
    }

    public void setPanelHistory(JPanel panelHistory) {
        this.panelHistory = panelHistory;
    }

    public void drawGUI() {
        JFrame frame_calculator = new JFrame("Calculator");
        frame_calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame_calculator.setPreferredSize(new Dimension(480, 650));
        frame_calculator.setLocation(400, 10);
        frame_calculator.setResizable(false);

        JPanel panel_display_calculator = new JPanel();
        panel_display_calculator.setPreferredSize(new Dimension(480, 500));

        JPanel panel_for_label = new JPanel();
        panel_for_label.setPreferredSize(new Dimension(380, 50));
        JLabel label = new JLabel("");
        panel_for_label.add(label);


        setLabel(label);

        panel_display_calculator.add(panel_for_label);

        JFrame frame_history = new JFrame("History");

        frame_history.setPreferredSize(new Dimension(130, 650));
        JPanel panel_for_history = new JPanel();
        frame_history.getContentPane().add(panel_for_history);
        frame_history.setLocation(870, 10);

        setPanelHistory(panel_for_history);

        setBtnAC(createButton("AC"));
        addBtnToPanel(panel_display_calculator, getBtnAC());
        setBtnC(createButton("C"));
        addBtnToPanel(panel_display_calculator, getBtnC());
        setBtnRes(createButton("="));
        addBtnToPanel(panel_display_calculator, getBtnRes());
        setBtnDiv(createButton("/"));
        addBtnToPanel(panel_display_calculator, getBtnDiv());

        setBtn7(createButton("7"));
        addBtnToPanel(panel_display_calculator, getBtn7());
        setBtn8(createButton("8"));
        addBtnToPanel(panel_display_calculator, getBtn8());
        setBtn9(createButton("9"));
        addBtnToPanel(panel_display_calculator, getBtn9());
        setBtnMult(createButton("*"));
        addBtnToPanel(panel_display_calculator, getBtnMult());

        setBtn4(createButton("4"));
        addBtnToPanel(panel_display_calculator, getBtn4());
        setBtn5(createButton("5"));
        addBtnToPanel(panel_display_calculator, getBtn5());
        setBtn6(createButton("6"));
        addBtnToPanel(panel_display_calculator, getBtn6());
        setBtnMin(createButton("-"));
        addBtnToPanel(panel_display_calculator, getBtnMin());

        setBtn1(createButton("1"));
        addBtnToPanel(panel_display_calculator, getBtn1());
        setBtn2(createButton("2"));
        addBtnToPanel(panel_display_calculator, getBtn2());
        setBtn3(createButton("3"));
        addBtnToPanel(panel_display_calculator, getBtn3());
        setBtnPlus(createButton("+"));
        addBtnToPanel(panel_display_calculator, getBtnPlus());

        setBtnM(createButton("-"));
        addBtnToPanel(panel_display_calculator, getBtnM());
        setBtn0(createButton("0"));
        addBtnToPanel(panel_display_calculator, getBtn0());
        setBtnP(createButton("."));
        addBtnToPanel(panel_display_calculator, getBtnP());
        setBtnPow(createButton("^"));
        addBtnToPanel(panel_display_calculator, getBtnPow());

        frame_calculator.add(panel_display_calculator);

        frame_calculator.pack();
        frame_calculator.setVisible(true);

        frame_history.pack();
        frame_history.setVisible(true);
    }

    private JButton createButton(String title) {
        JButton btn = new JButton(title);
        btn.setPreferredSize(new Dimension(95, 95));
        return btn;
    }
    private void addBtnToPanel(JPanel panel, JButton btn) {
        panel.add(btn);
    }
}
