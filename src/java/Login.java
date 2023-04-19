import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Login extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Đăng nhập");

        // Tạo layout
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        // Tạo các control
        Label lblUserName = new Label("Tên đăng nhập:");
        grid.add(lblUserName, 0, 1);

        TextField txtUserName = new TextField();
        grid.add(txtUserName, 1, 1);

        Label lblPassword = new Label("Mật khẩu:");
        grid.add(lblPassword, 0, 2);

        PasswordField passwordField = new PasswordField();
        grid.add(passwordField, 1, 2);

        Button btnSignIn = new Button("Đăng nhập");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btnSignIn);
        grid.add(hbBtn, 1, 4);

        // Xử lý sự kiện khi người dùng click vào nút Đăng nhập
        btnSignIn.setOnAction(event -> {
            String userName = txtUserName.getText();
            String password = passwordField.getText();

            if (isValid(userName, password)) {
                System.out.println("Đăng nhập thành công");
                // Thực hiện chức năng của ứng dụng ở đây
            } else {
                System.out.println("Sai tên đăng nhập hoặc mật khẩu");
            }
        });

        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private boolean isValid(String userName, String password) {
        // Kiểm tra tên đăng nhập và mật khẩu có hợp lệ không
        // Trả về true nếu đúng, false nếu sai
        return true;
    }
}
