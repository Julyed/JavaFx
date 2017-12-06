package application;

import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class newController implements Initializable {
	
	int num1=0, num2=0, flag=0, opt = 0,res = 0;
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
   private Button buttonPlus;
   
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

   @Override
   public void initialize(URL location, ResourceBundle resources) {

       // TODO (don't really need to do anything here).

   }

   // When user click on myButton
   // this method will be called.
   public void clickBt1(ActionEvent event) {
       if(res == 0)
	   calcResult.appendText("1");
       if(flag == 0) {
    	   num1 = num1*10 + 1;
       }
       else {
    	   num2 = num2*10 + 1;
       }

   }
   
   public void clickBt2(ActionEvent event) {
	   calcResult.appendText("2");
       if(flag == 0) {
    	   num1 = num1*10 + 2;
       }
       else {
    	   num2 = num2*10 + 2;
       }

   }
   
   public void clickBt3(ActionEvent event) {
	   calcResult.appendText("3");
       if(flag == 0) {
    	   num1 = num1*10 + 3;
       }
       else {
    	   num2 = num2*10 + 3;
       }

   }
   
   public void clickBt4(ActionEvent event) {
	   calcResult.appendText("4");
       if(flag == 0) {
    	   num1 = num1*10 + 4;
       }
       else {
    	   num2 = num2*10 + 4;
       }

   }
   
   public void clickBt5(ActionEvent event) {
	   calcResult.appendText("5");
       if(flag == 0) {
    	   num1 = num1*10 + 5;
       }
       else {
    	   num2 = num2*10 + 5;
       }

   }
   
   public void clickBt6(ActionEvent event) {
	   calcResult.appendText("6");
       if(flag == 0) {
    	   num1 = num1*10 + 6;
       }
       else {
    	   num2 = num2*10 + 6;
       }

   }
   
   public void clickBt7(ActionEvent event) {
	   calcResult.appendText("7");
       if(flag == 0) {
    	   num1 = num1*10 + 7;
       }
       else {
    	   num2 = num2*10 + 7;
       }

   }
   
   public void clickBt8(ActionEvent event) {
	   calcResult.appendText("8");
       if(flag == 0) {
    	   num1 = num1*10 + 8;
       }
       else {
    	   num2 = num2*10 + 8;
       }

   }
   
   public void clickBt9(ActionEvent event) {
	   calcResult.appendText("9");
       if(flag == 0) {
    	   num1 = num1*10 + 9;
       }
       else {
    	   num2 = num2*10 + 9;
       }

   }
   
   public void clickBt0(ActionEvent event) {
	   calcResult.appendText("0");
       if(flag == 0) {
    	   num1 = num1*10 + 0;
       }
       else {
    	   num2 = num2*10 + 0;
       }

   }
   
   public void clickBtPlus(ActionEvent event) {
       calcResult.appendText("+");
       flag = 1;
       opt = 1;

   }
   
   public void clickBtSub(ActionEvent event) {
	   calcResult.appendText("-");
       flag = 1;
       opt = 2;

   }
   
   public void clickBtMul(ActionEvent event) {
	   calcResult.appendText("*");
       flag = 1;
       opt = 3;

   }
   
   public void clickBtDiv(ActionEvent event) {
	   calcResult.appendText("/");
       flag = 1;
       opt = 4;

   }
   
   public void clickBtCalc(ActionEvent event) {
	   calcResult.appendText("=");
	   int res = 0;
	   if(flag == 0) {
		   calcResult.clear();
		   calcResult.appendText("num1");
	   }
	   else if(opt == 4 && num2 == 0) {
		   calcResult.clear();
		   calcResult.appendText("Invalid divisor");
	   }
	   else {
		   switch(opt) {
		   case 1:
			   res = num1 + num2;
			   break;
		   case 2:
			   res = num1 - num2;
			   break;
		   case 3:
			   res = num1 * num2;
			   break;
		   case 4:
			   res = num1 / num2;
			   break;
		   }
		   calcResult.appendText(String.valueOf(res));
	   }
   }
   public void clickBtClear_all(ActionEvent event) {
	   calcResult.clear();
	   num1 = num2 = flag = opt = 0;
   }

}