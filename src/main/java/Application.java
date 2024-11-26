import mainview.MainView;
import mainview.MainViewController;
import services.DataAccessObject;

public class Application {

	public static void main(String[] args) {
		DataAccessObject dao = new DataAccessObject();
		new MainViewController(new MainView(), dao);
	}
}