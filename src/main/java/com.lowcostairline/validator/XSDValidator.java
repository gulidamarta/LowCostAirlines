package com.lowcostairline.validator;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.bind.ValidationException;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class XSDValidator {


    public static void validate(File XMLFile, File XSDFile) throws ValidationException {

        try {

            SchemaFactory factory =
                    SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(XSDFile);
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(XMLFile));
        }
        catch (IOException e){

            //logger.error("Validation failed: " + e.getMessage());
            throw new ValidationException(e.getMessage());
        }
        catch (SAXException e){

            //logger.error("Validation failed: " + e.getMessage());
            throw new ValidationException(XMLFile.getName() + " is NOT valid: " + e.getMessage());
        }
    }
}
