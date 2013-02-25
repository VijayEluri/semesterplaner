/*
 * (swing1.1beta3)
 * 
 */

package semesterplaner.libs.SplitTable;

import java.awt.*;

/**
 * Quelle: http://www.codeguru.com/java/articles/139.shtml
 * @version 1.0 11/22/98
 */

public interface CellAttribute {

  public void addColumn();

  public void addRow();

  public void insertRow(int row);

  public Dimension getSize();

  public void setSize(Dimension size);


}
