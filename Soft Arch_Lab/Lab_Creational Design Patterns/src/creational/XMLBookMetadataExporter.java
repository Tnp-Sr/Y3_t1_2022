package creational;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

public class XMLBookMetadataExporter extends BookMetadataExporter {

    @Override
    public BookMetadataFormatter createBook() throws IOException, ParserConfigurationException {
        return new XMLBookMetadataFormatter();
    }
}
