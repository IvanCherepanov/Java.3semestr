package laba10.Dop;

import javax.swing.*;
import java.util.HashMap;

public interface ICreateDocument {
    public IDocument createNew(String name);
    public IDocument createOpen(String name);
    public void saveFile(HashMap<String, JTextArea> jtas);
    public void exitFile();
    public String getNameOfEditor();
    public void addDocument(IDocument doc);
}
