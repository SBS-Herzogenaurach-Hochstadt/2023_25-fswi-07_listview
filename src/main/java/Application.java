import mainview.MainView;
import services.DataAccessObject;

public class Application {

	public static void main(String[] args) {
		DataAccessObject dao = new DataAccessObject();
		MainView mv = new MainView(dao);
	}
}