package com.wyd.julyed;

import java.net.URL;
import java.util.ResourceBundle;
import com.wyd.julyed.tool.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class NewController implements Initializable {

	int num1 = 0, num2 = 0, res = 0;
	boolean firstNum = true;
	Operator opt;
	@FXML
	private Button button1;

	@FXML
	private Button button2;

	@FXML
	private Button button3;

	@FXML
	private Button button4;

	@FXML
	private Button button5;

	@FXML
	private Button button6;

	@FXML
	private Button button7;

	@FXML
	private Button button8;

	@FXML
	private Button button9;

	@FXML
	private Button button0;

	@FXML
	private Button buttonAdd;

	@FXML
	private Button buttonSub;

	@FXML
	private Button buttonMul;

	@FXML
	private Button buttonDiv;

	@FXML
	private Button buttonCalc;

	@FXML
	private TextField calcResult;

	@FXML
	private Button buttonClear;

	// When user click on myButton
	// this method will be called.
	public void clickBt1(ActionEvent event) {
		if (res == 0)
			calcResult.appendText("1");
		if (firstNum) {
			num1 = num1 * 10 + 1;
		} else {
			num2 = num2 * 10 + 1;
		}

	}

	public void clickBt2(ActionEvent event) {
		calcResult.appendText("2");
		if (firstNum) {
			num1 = num1 * 10 + 2;
		} else {
			num2 = num2 * 10 + 2;
		}

	}

	public void clickBt3(ActionEvent event) {
		calcResult.appendText("3");
		if (firstNum) {
			num1 = num1 * 10 + 3;
		} else {
			num2 = num2 * 10 + 3;
		}

	}

	public void clickBt4(ActionEvent event) {
		calcResult.appendText("4");
		if (firstNum) {
			num1 = num1 * 10 + 4;
		} else {
			num2 = num2 * 10 + 4;
		}

	}

	public void clickBt5(ActionEvent event) {
		calcResult.appendText("5");
		if (firstNum) {
			num1 = num1 * 10 + 5;
		} else {
			num2 = num2 * 10 + 5;
		}

	}

	public void clickBt6(ActionEvent event) {
		calcResult.appendText("6");
		if (firstNum) {
			num1 = num1 * 10 + 6;
		} else {
			num2 = num2 * 10 + 6;
		}

	}

	public void clickBt7(ActionEvent event) {
		calcResult.appendText("7");
		if (firstNum) {
			num1 = num1 * 10 + 7;
		} else {
			num2 = num2 * 10 + 7;
		}

	}

	public void clickBt8(ActionEvent event) {
		calcResult.appendText("8");
		if (firstNum) {
			num1 = num1 * 10 + 8;
		} else {
			num2 = num2 * 10 + 8;
		}

	}

	public void clickBt9(ActionEvent event) {
		calcResult.appendText("9");
		if (firstNum) {
			num1 = num1 * 10 + 9;
		} else {
			num2 = num2 * 10 + 9;
		}

	}

	public void clickBt0(ActionEvent event) {
		calcResult.appendText("0");
		if (firstNum) {
			num1 = num1 * 10 + 0;
		} else {
			num2 = num2 * 10 + 0;
		}

	}

	public void clickBtAdd(ActionEvent event) {
		calcResult.appendText("+");
		firstNum = false;
		opt = Operator.ADD;

	}

	public void clickBtSub(ActionEvent event) {
		calcResult.appendText("-");
		firstNum = false;
		opt = Operator.SUB;

	}

	public void clickBtMul(ActionEvent event) {
		calcResult.appendText("*");
		firstNum = false;
		opt = Operator.MUL;

	}

	public void clickBtDiv(ActionEvent event) {
		calcResult.appendText("/");
		firstNum = false;
		opt = Operator.DIV;

	}

	public void clickBtCalc(ActionEvent event) {
		calcResult.appendText("=");
		int res = 0;
		if (firstNum) {
			calcResult.clear();
			calcResult.appendText("num1");
		} else if (opt.equals(Operator.DIV) && num2 == 0) {
			calcResult.clear();
			calcResult.appendText("Invalid divisor");
		} else {
			res = opt.calcResult(num1, num2);
			calcResult.appendText(String.valueOf(res));
		}
	}

	public void clickBtClear_all(ActionEvent event) {
		calcResult.clear();
		num1 = num2 = 0;
		firstNum = true;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}
}