/*
 * TCSS 305 May 20, 2013 
 */
package powerpaint;

import java.awt.Color;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

/**
 * The ToolBar object creates a tool bar used at the bottom of the frame.
 * The ToolBar consists of a color button, a pencil tool, a line tool, a rectangle tool,
 * and a ellipse tool.
 * The ToolBar can be moved around and separated from the frame.
 *
 * @author Casey Morrison
 * @version May 20, 2013
 */
@SuppressWarnings("serial")
public class ToolBar extends JToolBar {
  
  /** A button group for the mutually exclusive tool bar buttons. */
  private final ButtonGroup my_group;
  
  /** The color button associated with a JColorChooser. */
  private JButton my_color_button;
  
  /**
   * Construct the ToolBar.
   */
  public ToolBar() {
    super();
    my_group = new ButtonGroup();
  }
  
  /**
   * Create a JToggleButton for the ToolBar.
   * @param the_action to associate with the created JToggleButton
   */
  public void createToggleButton(final Action the_action) {
    final JToggleButton toggle_button = new JToggleButton(the_action);
    my_group.add(toggle_button);
    add(toggle_button);
  }
  
  /**
   * To create the color tool button in the tool bar.
   * @param the_action - the action associated with this button.
   */
  public void createColorToolButton(final Action the_action) {
    my_color_button = new JButton(the_action);
    my_color_button.setBackground((Color) the_action.getValue("color"));
    my_color_button.setForeground(Color.LIGHT_GRAY);
    add(my_color_button);
  }
  
  /**
   * Sets the background color of the color button.
   * @param the_color - color imported from the color action.
   */
  public void setBackgroundColor(final Color the_color) {
    my_color_button.setBackground(the_color);
  }
}
