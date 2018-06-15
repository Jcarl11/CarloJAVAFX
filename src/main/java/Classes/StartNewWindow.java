package Classes;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartNewWindow 
{
    private String windowFXML;
    private String style;
    private String windowTitle;
    private boolean isResizable;
    
    private StartNewWindow(StartNewWindowBuilder builder)
    {
        windowFXML = builder.windowFXML;
        style = builder.style;
        windowTitle = builder.windowTitle;
        isResizable = builder.isResizable;
    }
    
    public static class StartNewWindowBuilder
    {
        private String windowFXML;
        private String style;
        private String windowTitle;
        private boolean isResizable;

        public StartNewWindowBuilder(String windowFXML) { this.windowFXML = windowFXML; }

        public StartNewWindowBuilder setIsResizable(boolean isResizable) {
            this.isResizable = isResizable;
            return this;
        }

        public StartNewWindowBuilder setStyle(String style) {
            this.style = style;
            return this;
        }

        public StartNewWindowBuilder setWindowTitle(String windowTitle) {
            this.windowTitle = windowTitle;
            return this;
        }
        
        public void show()
        {
            try
            {
                Parent root = FXMLLoader.load(getClass().getResource("/fxml/" + windowFXML));
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                scene.getStylesheets().add("/styles/" + style);
                stage.setTitle(windowTitle);
                stage.setScene(scene);
                stage.setResizable(isResizable);
                stage.show();
            }catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
    }
}
