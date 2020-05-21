package kereta;

public class MVC {
    Model model = new Model();
    View view = new View();
    Controller controller = new Controller(model,view);
}
