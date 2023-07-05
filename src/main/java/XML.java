import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileReader;

public class XML {
    public void marshalUser(User user) {
        try {
            JAXBContext context = JAXBContext.newInstance(User.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(user, new File("user.xml"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public User unmarshalUser() {
        try {
            JAXBContext context = JAXBContext.newInstance(User.class);
            return (User) context.createUnmarshaller().unmarshal(new FileReader("user.xml"));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
