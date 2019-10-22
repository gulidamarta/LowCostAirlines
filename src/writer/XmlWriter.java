package writer;

import beans.aircraftCrew.steward.Steward;
import writer.exception.XmlOutInException;

import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.io.IOException;

public class XmlWriter {
    public void Write(Steward steward, String fileName) throws XmlOutInException {
        try {
            XMLEncoder xmlEncoder = new XMLEncoder(new FileOutputStream(fileName));
            xmlEncoder.writeObject(steward);
            xmlEncoder.close();
        } catch (IOException e) {
            throw new XmlOutInException("can't write to file = [" + fileName + "]", e);
        }
    }
}
