package application;
	
import javafx.application.Application; // Base class for JavaFX apps.
import javafx.geometry.Insets; // Used to set padding/margins.
import javafx.scene.Scene; // Main building block for UI windows.
import javafx.stage.Stage; // Main building block for UI windows
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;

// Label, Button, TextField, TextInputDialog, Alert: UI controls.
//VBox: Layout to arrange elements vertically.

public class Main extends Application {

  private Account[] accounts = new Account[10];//array of accounts
  private Account currentAccount = null;// Tracks the currently logged-in account
  private Stage window;

  @Override
  public void start(Stage primaryStage) // start method / Entry point for UI
  {
      window = primaryStage;
      // Initializes 10 accounts with IDs 0–9 and $100 balance.
      for (int i = 0; i < 10; i++) {
          accounts[i] = new Account(i, 100);
      }

      showLoginScene();
  }

  private void showLoginScene() 
  {
    // UI controls for login: label, text field, login button, and label for error messages.
	  Label label = new Label("Enter Account ID (0 - 9):");
      TextField idField = new TextField();
      Button loginButton = new Button("Login");
      Label errorLabel = new Label();

      // VBox: Vertically arranges login UI components with 10px spacing.
      VBox layout = new VBox(10, label, idField, loginButton, errorLabel);
      layout.setAlignment(Pos.CENTER);
      layout.setPadding(new Insets(20)); // Sets padding
      //when login button is clicked
      loginButton.setOnAction(e -> {
          try {
              int id = Integer.parseInt(idField.getText());
              if (id >= 0 && id < 10) {
                  showMainMenu(accounts[id]);
              } else {
                  errorLabel.setText("Invalid ID. Enter between 0 and 9.");
              }
          } catch (NumberFormatException ex) {
              errorLabel.setText("Please enter a valid number.");
          }
      });

      Scene scene = new Scene(layout, 300, 200); //creates a scene of size 300x200.
      window.setScene(scene);
      window.setTitle("ATM Login");
      window.show();
  }

  private void showMainMenu(Account account) 
  {
	  // ATM Menu Scene Setup
      Label welcome = new Label("Welcome Account ID: " + account.getId());
      Button viewBalanceBtn = new Button("1. View Balance");
      Button withdrawBtn = new Button("2. Withdraw");
      Button depositBtn = new Button("3. Deposit");
      Button exitBtn = new Button("4. Exit");

      VBox layout = new VBox(10, welcome, viewBalanceBtn, withdrawBtn, depositBtn, exitBtn);
      layout.setAlignment(Pos.CENTER);
      layout.setPadding(new Insets(20));
      // when view balance is clicked
      viewBalanceBtn.setOnAction(e -> {
          showAlert("Current Balance", "Balance: $" + account.getBalance());
      });

      // when withdraw button is clicked
      withdrawBtn.setOnAction(e -> {
          TextInputDialog dialog = new TextInputDialog();
          dialog.setTitle("Withdraw");
          dialog.setHeaderText("Enter amount to withdraw:");
          dialog.showAndWait().ifPresent(amountStr -> {
              try {
                  double amount = Double.parseDouble(amountStr);
                  if (amount > account.getBalance()) {
                      showAlert("Error", "Insufficient balance.");
                  } else {
                      account.withdraw(amount);
                      showAlert("Success", "Withdrawn $" + amount);
                  }
              } catch (NumberFormatException ex) {
                  showAlert("Error", "Invalid input.");
              }
          });
      });
      //when deposit button is clicked
      depositBtn.setOnAction(e -> {
          TextInputDialog dialog = new TextInputDialog();
          dialog.setTitle("Deposit");
          dialog.setHeaderText("Enter amount to deposit:");
          dialog.showAndWait().ifPresent(amountStr -> {
              try {
                  double amount = Double.parseDouble(amountStr);
                  account.deposit(amount);
                  showAlert("Success", "Deposited $" + amount);
              } catch (NumberFormatException ex) {
                  showAlert("Error", "Invalid input.");
              }
          });
      });

      exitBtn.setOnAction(e -> showLoginScene());

      Scene scene = new Scene(layout, 300, 250);
      window.setScene(scene);
  }

  private void showAlert(String title, String message) {
      Alert alert = new Alert(Alert.AlertType.INFORMATION);
      alert.setTitle(title);
      alert.setHeaderText(null);
      alert.setContentText(message);
      alert.showAndWait();
  }

  public static void main(String[] args) {
      launch(args); //Java main method that launches the JavaFX app.
  }
}
