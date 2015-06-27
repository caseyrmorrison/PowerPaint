/*
 * TCSS 305 May 20, 2013 
 */
package powerpaint;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;

/**
 * The MenuBar is an object that creates a menu bar at the top of the frame.
 * The MenuBar consists of a file menu, options menu, tools menu, and help menu.
 *
 * @author Casey Morrison
 * @version May 20, 2013
 */
@SuppressWarnings("serial")
public class MenuBar extends JMenuBar {
  
  /** The thickness of the last radio buttons. */
  private static final int THICKNESS_FOUR = 4;
  /** The file drop down menu. */
  private final JMenu my_filemenu = new JMenu("File");;
  /** The options drop down menu. */
  private final JMenu my_optionsmenu = new JMenu("Options");
  /** The tools drop down menu. */
  private final JMenu my_toolsmenu = new JMenu("Tools");
  /** The help drop down menu. */
  private final JMenu my_helpmenu = new JMenu("Help");
  /** A button group for the View menu radio buttons. */
  private final ButtonGroup my_toggle_group = new ButtonGroup();
  /** A button group for the View thickness radio buttons. */
  private final ButtonGroup my_thickness_group = new ButtonGroup();
  /** The menu item, exit thats used to exit the program. */
  private final JMenuItem my_exit_button = new JMenuItem("Exit", 'x');
  /** The drawing panel used to draw object on in the paint program. */
  private final DrawPanel my_panel;
  /** The menu item that is a color chooser. */
  private JMenuItem my_color_button;

  
  /**
   * Sets up the Menu bar.
   * @param the_frame - the frame this bar is attached to.
   * @param the_panel - the panel this bar edits.
   */
  public MenuBar(final JFrame the_frame, final DrawPanel the_panel) {
    super();
    my_panel = the_panel;
    my_exit_button.addActionListener(new ActionListener() {
      public void actionPerformed(final ActionEvent the_event) {
        the_frame.dispose();
      }
    });
    setupFileMenu(my_exit_button);
    setupOptionsMenu();
    setupHelpMenu();
    
    add(my_filemenu);
    add(my_optionsmenu);
    add(my_toolsmenu);
    add(my_helpmenu);
  }

  /** 
   * Sets up the file menu.
   * @param the_exit the menu item to assign an action listener to.
   */
  private void setupFileMenu(final JMenuItem the_exit) {
    my_filemenu.setMnemonic(KeyEvent.VK_F);
    final JMenuItem clear = new JMenuItem("Clear", 'C');
    clear.addActionListener(new ActionListener() {
      public void actionPerformed(final ActionEvent the_event) {
        my_panel.clearAll(); 
      }
    });
    my_filemenu.add(clear);
    my_filemenu.addSeparator();
    my_filemenu.add(the_exit);
    
  }
  
  /** 
   * Sets up the options menu.
   */
  private void setupOptionsMenu() {
    my_optionsmenu.setMnemonic(KeyEvent.VK_O);
    
    final JCheckBoxMenuItem grid = new JCheckBoxMenuItem("Grid");
    grid.setMnemonic(KeyEvent.VK_G);
    grid.addActionListener(new ActionListener() { 
      public void actionPerformed(final ActionEvent the_event) {
        if (grid.getState()) {
          my_panel.setGrid(true);
          my_panel.repaint();
        } else {
          my_panel.setGrid(false);
          my_panel.repaint();
        }
      }
    });
    
    final JMenu thicknessmenu = new JMenu("Thickness");
    thicknessmenu.setMnemonic(KeyEvent.VK_T);
    
    final JRadioButtonMenuItem one = new JRadioButtonMenuItem("1", true);
    one.setMnemonic(KeyEvent.VK_1);
    one.addActionListener(new ActionListener() { 
      public void actionPerformed(final ActionEvent the_event) {
        my_panel.setThickness(1);
      }
    });
    
    final JRadioButtonMenuItem two = new JRadioButtonMenuItem("2");
    two.setMnemonic(KeyEvent.VK_2);
    two.addActionListener(new ActionListener() { 
      public void actionPerformed(final ActionEvent the_event) {
        my_panel.setThickness(2);
      }
    });
    
    final JRadioButtonMenuItem four = new JRadioButtonMenuItem("4");
    four.setMnemonic(KeyEvent.VK_4);
    four.addActionListener(new ActionListener() { 
      public void actionPerformed(final ActionEvent the_event) {
        my_panel.setThickness(THICKNESS_FOUR);
      }
    });
    
    my_thickness_group.add(one);
    my_thickness_group.add(two);
    my_thickness_group.add(four);
    thicknessmenu.add(one);
    thicknessmenu.add(two);
    thicknessmenu.add(four);
    
    my_optionsmenu.add(grid);
    my_optionsmenu.add(thicknessmenu);
  }

  /**
   * Creates the menu radio buttons used for the tools.
   * @param the_action - the action associated with these tools.
   */
  public void createMenuButton(final Action the_action) {
    my_toolsmenu.setMnemonic(KeyEvent.VK_T);
    final JRadioButtonMenuItem toggle_button = new JRadioButtonMenuItem(the_action);
    my_toggle_group.add(toggle_button);
    my_toolsmenu.add(toggle_button);
    if ((boolean) the_action.getValue("start")) {
      toggle_button.setSelected(true);
    }
  }
  
  /**
   * To create the color menu button in the drop down menu under tools.
   * @param the_action - the action associated with this button.
   */
  public void createColorMenuButton(final Action the_action) {
    my_color_button = new JMenuItem(the_action);
    my_color_button.setBackground((Color) the_action.getValue("color"));
    my_color_button.setForeground(Color.LIGHT_GRAY);
    my_toolsmenu.add(my_color_button);
    my_toolsmenu.addSeparator();
  }
  
  /**
   * Sets the background color of the color button.
   * @param the_color - color imported from the color action.
   */
  public void setBackgroundColor(final Color the_color) {
    my_color_button.setBackground(the_color);
  }
  
  /** 
   * Sets up the help menu.
   */
  private void setupHelpMenu() {
    my_helpmenu.setMnemonic(KeyEvent.VK_H);
    final JMenuItem about = new JMenuItem("About...", 'A');
    about.addActionListener(new ActionListener() { 
      public void actionPerformed(final ActionEvent the_event) {
        JOptionPane.showMessageDialog(null, "Implemented by:\n\n Casey Morrison, 5/21/2013.", 
                                      "About", JOptionPane.INFORMATION_MESSAGE);
      }
    });
    my_helpmenu.add(about);
  }
}
