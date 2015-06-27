/*
 * TCSS 305 May 20, 2013 
 */
package powerpaint;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JColorChooser;

/**
 * This class creates a color action and implements AbstractAction.
 * This will be used to create a color button in the menu and tool bars.
 *
 * @author Casey Morrison
 * @version May 20, 2013
 */
@SuppressWarnings("serial")
public class ColorAction extends AbstractAction {

  /** The string used to put the color in the map. */
  private static final String COLOR_VALUE = "color";
  
  /** The JPanel to associate with this Action. */
  private final DrawPanel my_panel;
  
  /** The MenuBar associated with the frame that contains a color button. */
  private final MenuBar my_bar;
  
  /** The ToolBar associated with the frame that contains a color button. */
  private final ToolBar my_tool;
  
  /** The color of the background of the button. */
  private Color my_result = Color.BLACK;
  
  /**
   * Creates an action and objects used to create the color buttons.
   * 
   * @param the_panel - the drawing panel that will be affected by the color changes.
   * @param the_bar - the MenuBar that will house one of the color buttons.
   * @param the_tool - the ToolBar that will house one of the color buttons.
   */
  public ColorAction(final DrawPanel the_panel, final MenuBar the_bar,
                     final ToolBar the_tool) {
    super("Color...");
    my_panel = the_panel;
    my_bar = the_bar;
    my_tool = the_tool;
    putValue(Action.MNEMONIC_KEY, KeyEvent.VK_C);
    putValue(Action.SELECTED_KEY, true);
    putValue(COLOR_VALUE, my_result);
    putValue(Action.SHORT_DESCRIPTION, "Choose the Color to draw with");
  }

  /** {@inheritDoc} */
  @Override
  public void actionPerformed(final ActionEvent the_event) {
    my_result = JColorChooser.showDialog(null, "A Color Chooser",
                                                  my_panel.getColor());
    if (my_result != null) {
      my_panel.setColor(my_result);
      putValue(COLOR_VALUE, my_result);
      my_bar.setBackgroundColor(my_result);
      my_tool.setBackgroundColor(my_result);
    }
  }  
}
