/*
 * TCSS 305 May 20, 2013 
 */
package powerpaint;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;

/**
 * The LineAction creates an action and the parameters used to create a button.
 *
 * @author Casey Morrison
 * @version May 20, 2013
 */
@SuppressWarnings("serial")
public class LineAction extends AbstractAction {
  
  /** Icon used for the Line button. */
  private static final ImageIcon LINE = new ImageIcon("line_bw.gif");
  
  /** The JPanel to associate with this Action. */
  private final DrawPanel my_panel;
  
  /**
   * Creates a Line Action object.
   * @param the_panel - the drawing panel associated with this line.
   */
  public LineAction(final DrawPanel the_panel) {
    super("Line");
    my_panel = the_panel;
    putValue(Action.MNEMONIC_KEY, KeyEvent.VK_L);
    putValue(Action.SELECTED_KEY, true);
    putValue(Action.SMALL_ICON, LINE);
    putValue(Action.SHORT_DESCRIPTION, "Use the Line tool to draw");
    putValue("start", false);
  }
  
  /** {@inheritDoc} */
  @Override
  public void actionPerformed(final ActionEvent the_action) {
//    my_panel.setDrawType(2);
    my_panel.setLineDraw();
  }
}