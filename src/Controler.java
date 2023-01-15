import javax.swing.*;

class Controler {
    View view = new View();


    public void Calculator() {
        view.drawGUI();
        Model model = new Model(view.getLabel());
        view.getBtn1().addActionListener((e -> {
            model.Numbers(view.getBtn1().getText());
        }));
        view.getBtn2().addActionListener((e -> {
            model.Numbers(view.getBtn2().getText());
        }));
        view.getBtn3().addActionListener((e -> {
            model.Numbers(view.getBtn3().getText());
        }));
        view.getBtn4().addActionListener((e -> {
            model.Numbers(view.getBtn4().getText());
        }));
        view.getBtn5().addActionListener((e -> {
            model.Numbers(view.getBtn5().getText());
        }));
        view.getBtn6().addActionListener((e -> {
            model.Numbers(view.getBtn6().getText());
        }));
        view.getBtn7().addActionListener((e -> {
            model.Numbers(view.getBtn7().getText());
        }));
        view.getBtn8().addActionListener((e -> {
            model.Numbers(view.getBtn8().getText());
        }));
        view.getBtn9().addActionListener((e -> {
            model.Numbers(view.getBtn9().getText());
        }));

        view.getBtn0().addActionListener((e -> {
            model.Numbers(view.getBtn0().getText());
        }));
        view.getBtnP().addActionListener(e -> {
            model.Point(view.getBtnP().getText());
        });
        view.getBtnM().addActionListener(e -> {
            model.Minus(view.getBtnM().getText());
        });

        view.getBtnDiv().addActionListener(e -> {
//            JLabel labelTmp =
            model.Divide();
//            if(!labelTmp.getText().equals("")){
//                view.getPanelHistory().add(labelTmp);
//                view.getPanelHistory().validate();
//                view.getPanelHistory().repaint();
//            }
        });

        view.getBtnMult().addActionListener(e -> {
//            JLabel labelTmp =
            model.Multiply();
//            if(!labelTmp.getText().equals("")){
//                view.getPanelHistory().add(labelTmp);
//                view.getPanelHistory().validate();
//                view.getPanelHistory().repaint();
//            }
        });

        view.getBtnMin().addActionListener(e -> {
//            JLabel labelTmp =
            model.Minus();
//            if(!labelTmp.getText().equals("")){
//                view.getPanelHistory().add(labelTmp);
//                view.getPanelHistory().validate();
//                view.getPanelHistory().repaint();
//            }
        });

        view.getBtnPlus().addActionListener(e -> {
//            JLabel labelTmp =
            model.Plus();
//            if(!labelTmp.getText().equals("")){
//                view.getPanelHistory().add(labelTmp);
//                view.getPanelHistory().validate();
//                view.getPanelHistory().repaint();
//            }
        });

        view.getBtnPow().addActionListener(e -> {
//            JLabel labelTmp =
            model.Power();
//            if(!labelTmp.getText().equals("")){
//                view.getPanelHistory().add(labelTmp);
//                view.getPanelHistory().validate();
//                view.getPanelHistory().repaint();
//            }
        });

        view.getBtnRes().addActionListener(e -> {
            JLabel labelTmp = model.Result();
            if(!labelTmp.getText().equals("")){
                view.getPanelHistory().add(labelTmp);
                view.getPanelHistory().validate();
                view.getPanelHistory().repaint();
            }
        });

        view.getBtnAC().addActionListener(e -> {
            model.AC();
        });

        view.getBtnC().addActionListener(e -> {
            model.C();
        });

    }
}
