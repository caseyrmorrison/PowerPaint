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
 * The RectangleAction creates an action and the parameters used to create a button.
 *
 * @author Casey Morrison
 * @version May 20, 2013
 */
@SuppressWarnings("serial")
public class RectangleAction extends AbstractAction {
  
  /** Icon used for the Rectangle button. */
  private static final ImageIcon RECTANGLE = new ImageIcon("rectangle_bw.gif");
  
  /** The JPanel to associate with this Action. */
  private final DrawPanel my_panel;
  
  /**
   * Creates a Rectangle Action object.
   * @param the_panel - the drawing panel associated with this line.
   */
  public RectangleAction(final DrawPanel the_panel) {
    super("Rectangle");
    my_panel = the_panel;
    putValue(Action.MNEMONIC_KEY, KeyEvent.VK_R);
    putValue(Action.SELECTED_KEY, true);
    putValue(Action.SMALL_ICON, RECTANGLE);
    putValue(Action.SHORT_DESCRIPTION, "Use the Rectangle tool to draw");
    putValue("start", false);
  }
  
  /** {@inheritDoc} */
  @Override
  public void actionPerformed(final ActionEvent the_action) {
//    my_panel.setDrawType(3);
    my_panel.setRectangleDraw();
  }
}