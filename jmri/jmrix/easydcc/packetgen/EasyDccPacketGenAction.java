// EasyDccPacketGenAction.java

package jmri.jmrix.easydcc.packetgen;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

/**
 * Swing action to create and register a
 *       			EasyDccPacketGenFrame object
 *
 * @author			Bob Jacobsen    Copyright (C) 2001
 * @version			$Revision: 1.3 $
 */
public class EasyDccPacketGenAction 			extends AbstractAction {

	public EasyDccPacketGenAction(String s) { super(s);}

    public EasyDccPacketGenAction() {
        this("Generate EasyDCC message");
    }

    public void actionPerformed(ActionEvent e) {
		EasyDccPacketGenFrame f = new EasyDccPacketGenFrame();
		try {
			f.initComponents();
			}
		catch (Exception ex) {
			log.error("Exception: "+ex.toString());
			}
		f.show();
	}
   static org.apache.log4j.Category log = org.apache.log4j.Category.getInstance(EasyDccPacketGenAction.class.getName());
}


/* @(#)EasyDccPacketGenAction.java */
