import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator extends JFrame implements ActionListener {
    private JTextField display;
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonA = new JButton("A");
    JButton buttonB = new JButton("B");
    JButton buttonC = new JButton("C");
    JButton buttonD = new JButton("D");
    JButton buttonE = new JButton("E");
    JButton buttonF = new JButton("F");
    JButton buttonEqual = new JButton("=");
    JButton buttonMul = new JButton("*");
    JButton buttonDiv = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton notButton = new JButton("NOT");
    JButton andButton = new JButton("AND");
    JButton orButton = new JButton("OR");
    JButton xorButton = new JButton("XOR");
    JButton leftButton = new JButton("<<");
    JButton rightButton = new JButton(">>");
    JButton clearButton = new JButton("Clear");
    ButtonGroup choosetype = new ButtonGroup();
    JRadioButton hex = new JRadioButton("Hexadecimal");
    JRadioButton dec = new JRadioButton("Decimal");
    JRadioButton bin = new JRadioButton("Binary");
    String input = "";
    long result = 0;
    String operator = "";
    boolean newcalc = true;
    String lastmode = "HEX";

    public calculator() {
        setTitle("Programmer Calculator");
        setSize(520, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 16));
        display.setBounds(200, 40, 250, 100);
        display.setEditable(false);
        display.setText("0");

        hex.setBounds(20, 35, 120, 30);
        hex.setFont(new Font("Arial", Font.BOLD, 14));
        hex.setSelected(true);
        dec.setBounds(20, 75, 100, 30);
        dec.setFont(new Font("Arial", Font.BOLD, 14));
        bin.setBounds(20, 115, 100, 30);
        bin.setFont(new Font("Arial", Font.BOLD, 14));

        buttonA.setBounds(20, 180, 80, 40);
        buttonB.setBounds(20, 230, 80, 40);
        buttonC.setBounds(20, 280, 80, 40);
        buttonD.setBounds(20, 330, 80, 40);
        buttonE.setBounds(20, 380, 80, 40);
        buttonF.setBounds(20, 430, 80, 40);

        andButton.setBounds(110, 230, 80, 40);
        orButton.setBounds(200, 230, 80, 40);
        xorButton.setBounds(290, 230, 80, 40);
        notButton.setBounds(110, 180, 80, 40);
        leftButton.setBounds(200, 180, 80, 40);
        rightButton.setBounds(290, 180, 80, 40);
        clearButton.setBounds(380, 180, 80, 40);
        clearButton.setBackground(Color.red);

        buttonPlus.setBounds(380, 230, 80, 40);
        buttonMinus.setBounds(380, 280, 80, 40);
        buttonMul.setBounds(380, 330, 80, 40);
        buttonDiv.setBounds(380, 380, 80, 40);
        buttonEqual.setBounds(380, 430, 80, 40);

        buttonOne.setBounds(110, 380, 80, 40);
        buttonOne.setBackground(Color.lightGray);
        buttonTwo.setBounds(200, 380, 80, 40);
        buttonTwo.setBackground(Color.lightGray);
        buttonThree.setBounds(290, 380, 80, 40);
        buttonThree.setBackground(Color.lightGray);
        buttonFour.setBounds(110, 330, 80, 40);
        buttonFour.setBackground(Color.lightGray);
        buttonFive.setBounds(200, 330, 80, 40);
        buttonFive.setBackground(Color.lightGray);
        buttonSix.setBounds(290, 330, 80, 40);
        buttonSix.setBackground(Color.lightGray);
        buttonSeven.setBounds(110, 280, 80, 40);
        buttonSeven.setBackground(Color.lightGray);
        buttonEight.setBounds(200, 280, 80, 40);
        buttonEight.setBackground(Color.lightGray);
        buttonNine.setBounds(290, 280, 80, 40);
        buttonNine.setBackground(Color.lightGray);
        buttonZero.setBounds(200, 430, 80, 40);
        buttonZero.setBackground(Color.lightGray);

        buttonZero.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonA.addActionListener(this);
        buttonB.addActionListener(this);
        buttonC.addActionListener(this);
        buttonD.addActionListener(this);
        buttonE.addActionListener(this);
        buttonF.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonEqual.addActionListener(this);
        notButton.addActionListener(this);
        andButton.addActionListener(this);
        orButton.addActionListener(this);
        xorButton.addActionListener(this);
        leftButton.addActionListener(this);
        rightButton.addActionListener(this);
        clearButton.addActionListener(this);

        choosetype.add(hex);
        choosetype.add(dec);
        choosetype.add(bin);
        add(display);
        add(hex);
        add(dec);
        add(bin);
        add(notButton);
        add(andButton);
        add(orButton);
        add(xorButton);
        add(leftButton);
        add(rightButton);
        add(buttonOne);
        add(buttonZero);
        add(buttonDiv);
        add(buttonTwo);
        add(buttonThree);
        add(buttonFour);
        add(buttonFive);
        add(buttonSix);
        add(buttonSeven);
        add(buttonEight);
        add(buttonNine);
        add(buttonA);
        add(buttonB);
        add(buttonC);
        add(buttonD);
        add(buttonE);
        add(buttonF);
        add(buttonEqual);
        add(buttonPlus);
        add(buttonMinus);
        add(buttonMul);
        add(clearButton);

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setbtn();
                convertnum();
            }
        };

        hex.addActionListener(actionListener);
        dec.addActionListener(actionListener);
        bin.addActionListener(actionListener);
        setVisible(true);
    }

    private void convertnum() {
        if (!display.getText().isEmpty() && !display.getText().equals("Error")) {
            try {
                String displaytext = display.getText();
                String[] parts = displaytext.split(" ");
                StringBuilder newdisplay = new StringBuilder();
                for (int i = 0; i < parts.length; i++) {
                    if (i > 0) {
                        newdisplay.append(" ");
                    }
                    if (parts[i].matches("[+\\-*/]|AND|OR|XOR|<<|>>")) {
                        newdisplay.append(parts[i]);
                    } else if (!parts[i].isEmpty()) {
                        long value = changetolong(parts[i]);
                        newdisplay.append(formatnum(value));
                    }
                }
                display.setText(newdisplay.toString());
                if (hex.isSelected()) {
                    lastmode = "HEX";
                } else if (dec.isSelected()) {
                    lastmode = "DEC";
                } else {
                    lastmode = "BIN";
                }
            } catch (NumberFormatException e) {
                display.setText("Error");
            }
        }
    }

    private long changetolong(String number) {
        try {
            if (lastmode.equals("HEX")) {
                return Long.parseLong(number, 16);
            } else if (lastmode.equals("BIN")) {
                return Long.parseLong(number, 2);
            } else {
                return Long.parseLong(number);
            }
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private String formatnum(long value) {
        if (hex.isSelected()) {
            return Long.toHexString(value).toUpperCase();
        } else if (bin.isSelected()) {
            return Long.toBinaryString(value);
        } else {
            return String.valueOf(value);
        }
    }

    private void resultcalc(long num1, long num2) {
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    throw new ArithmeticException("YOU CANNOT DIVIDE BY ZERO");
                }
                break;
            case "AND":
                result = num1 & num2;
                break;
            case "OR":
                result = num1 | num2;
                break;
            case "XOR":
                result = num1 ^ num2;
                break;
        }
    }

    public void setbtn() {
        if (bin.isSelected()) {
            buttonTwo.setEnabled(false);
            buttonThree.setEnabled(false);
            buttonFour.setEnabled(false);
            buttonFive.setEnabled(false);
            buttonSix.setEnabled(false);
            buttonSeven.setEnabled(false);
            buttonEight.setEnabled(false);
            buttonNine.setEnabled(false);
            buttonA.setEnabled(false);
            buttonB.setEnabled(false);
            buttonC.setEnabled(false);
            buttonD.setEnabled(false);
            buttonE.setEnabled(false);
            buttonF.setEnabled(false);
            andButton.setEnabled(true);
            orButton.setEnabled(true);
            xorButton.setEnabled(true);
        } else if (dec.isSelected()) {
            buttonTwo.setEnabled(true);
            buttonThree.setEnabled(true);
            buttonFour.setEnabled(true);
            buttonFive.setEnabled(true);
            buttonSix.setEnabled(true);
            buttonSeven.setEnabled(true);
            buttonEight.setEnabled(true);
            buttonNine.setEnabled(true);
            buttonA.setEnabled(false);
            buttonB.setEnabled(false);
            buttonC.setEnabled(false);
            buttonD.setEnabled(false);
            buttonE.setEnabled(false);
            buttonF.setEnabled(false);
            andButton.setEnabled(false);
            orButton.setEnabled(false);
            xorButton.setEnabled(false);
        } else if (hex.isSelected()) {
            buttonTwo.setEnabled(true);
            buttonThree.setEnabled(true);
            buttonFour.setEnabled(true);
            buttonFive.setEnabled(true);
            buttonSix.setEnabled(true);
            buttonSeven.setEnabled(true);
            buttonEight.setEnabled(true);
            buttonNine.setEnabled(true);
            buttonA.setEnabled(true);
            buttonB.setEnabled(true);
            buttonC.setEnabled(true);
            buttonD.setEnabled(true);
            buttonE.setEnabled(true);
            buttonF.setEnabled(true);
            andButton.setEnabled(true);
            orButton.setEnabled(true);
            xorButton.setEnabled(true);
        }
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == buttonZero || source == buttonOne || source == buttonTwo ||
                source == buttonThree || source == buttonFour || source == buttonFive ||
                source == buttonSix || source == buttonSeven || source == buttonEight ||
                source == buttonNine || source == buttonA || source == buttonB ||
                source == buttonC || source == buttonD || source == buttonE || source == buttonF) {

            String digit = getdigit(source);
            if (display.getText().equals("0") || newcalc) {
                display.setText(digit);
                input = digit;
                newcalc = false;
            } else {
                display.setText(display.getText() + digit);
                input += digit;
            }
        } else if (source == buttonPlus || source == buttonMinus ||
                source == buttonMul || source == buttonDiv ||
                source == andButton || source == orButton ||
                source == xorButton || source == leftButton ||
                source == rightButton) {

            String newop = getoperation(source);

            if (input.isEmpty() || display.getText().equals("0")) {
                input = "0";
                display.setText("0 " + newop + " ");
            } else if (!operator.isEmpty()) {
                String currenttext = display.getText();
                int lastoperation = currenttext.lastIndexOf(operator);
                if (lastoperation != -1) {
                    display.setText(currenttext.substring(0, lastoperation) + newop + " ");
                }
            } else {
                display.setText(input + " " + newop + " ");
            }
            operator = newop;
            newcalc = false;
        } else if (source == notButton) {
            try {
                String value;
                if (input.isEmpty()) {
                    value = "0";
                } else {
                    value = display.getText();
                }
                long num = changetolong(value);
                result = -(num + 1);
                display.setText(formatnum(result));
                input = formatnum(result);
                operator = "";
                newcalc = true;
            } catch (NumberFormatException ex) {
                display.setText("Error");
            }
        } else if (source == buttonEqual) {
            if (operator.isEmpty()) {
                return;
            }
            try {
                String currenttext = display.getText().trim();
                String[] parts = currenttext.split(" ");
                long num1 = changetolong(parts[0]);
                long num2;
                if (parts.length < 3 || parts[2].isEmpty()) {
                    num2 = num1;
                } else {
                    num2 = changetolong(parts[2]);
                }
                if (operator.equals("<<") || operator.equals(">>")) {
                    if (num2 >= 64) {
                        num2 = num2 % 64;
                    } else if (num2 < 0) {
                        num2 = 0;
                    }
                    if (operator.equals(">>") && num1 < 0) {
                        result = num1;
                        for (int i = 0; i < num2; i++) {
                            result = result / 2;
                            String bunresult = Long.toBinaryString(result);
                            result = Long.parseLong("1" + bunresult, 2);
                        }
                    } else if (operator.equals(">>")) {
                        result = num1;
                        for (int i = 0; i < num2; i++) {
                            result = result / 2;
                        }
                    } else {
                        result = num1;
                        for (int i = 0; i < num2; i++) {
                            result = result * 2;
                        }
                    }
                } else {
                    resultcalc(num1, num2);
                }
                display.setText(formatnum(result));
                input = formatnum(result);
                operator = "";
                newcalc = true;
            } catch (Exception ex) {
                display.setText("Error");
            }
        } else if (source == clearButton) {
            display.setText("0");
            input = "";
            result = 0;
            operator = "";
            newcalc = true;
        }
    }

    private String getdigit(Object source) {
        if (source == buttonZero) {
            return "0";
        }
        if (source == buttonOne) {
            return "1";
        }
        if (source == buttonTwo) {
            return "2";
        }
        if (source == buttonThree) {
            return "3";
        }
        if (source == buttonFour) {
            return "4";
        }
        if (source == buttonFive) {
            return "5";
        }
        if (source == buttonSix) {
            return "6";
        }
        if (source == buttonSeven) {
            return "7";
        }
        if (source == buttonEight) {
            return "8";
        }
        if (source == buttonNine) {
            return "9";
        }
        if (source == buttonA) {
            return "A";
        }
        if (source == buttonB) {
            return "B";
        }
        if (source == buttonC) {
            return "C";
        }
        if (source == buttonD) {
            return "D";
        }
        if (source == buttonE) {
            return "E";
        }
        if (source == buttonF) {
            return "F";
        }
        return "";
    }

    private String getoperation(Object source) {
        if (source == buttonPlus) {
            return "+";
        }
        if (source == buttonMinus) {
            return "-";
        }
        if (source == buttonMul) {
            return "*";
        }
        if (source == buttonDiv) {
            return "/";
        }
        if (source == andButton) {
            return "AND";
        }
        if (source == orButton) {
            return "OR";
        }
        if (source == xorButton) {
            return "XOR";
        }
        if (source == leftButton) {
            return "<<";
        }
        if (source == rightButton) {
            return ">>";
        }
        return "";
    }

    public static void main(String[] args) {
        new calculator();
    }
}
