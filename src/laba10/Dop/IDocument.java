package laba10.Dop;

import javax.swing.*;

public interface IDocument {
    public String getName();
    public JTextArea getContent();
    public void setContent(String content);
}
