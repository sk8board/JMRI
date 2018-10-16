package jmri.jmrix.anyma.configurexml;

import jmri.util.JUnitUtil;
import org.junit.*;
import jmri.jmrix.anyma.AnymaDMX_ConnectionConfig;
import javax.swing.JPanel;

/**
 * AnymaDMX_ConnectionConfigXmlTest.java
 * <p>
 * Description: tests for the AnymaDMX_ConnectionConfigXml class
 *
 * @author George Warner Copyright (C) 2017
 * @since 4.9.6
 */
public class AnymaDMX_ConnectionConfigXmlTest extends jmri.jmrix.configurexml.AbstractUsbConnectionConfigXmlTestBase {

    // The minimal setup for log4J
    @Before
    public void setUp() {
        JUnitUtil.setUp();
        xmlAdapter = new AnymaDMX_ConnectionConfigXml();
        cc = new AnymaDMX_ConnectionConfig();
        cc.loadDetails(new JPanel());
    }

    @After
    public void tearDown() {
        xmlAdapter = null;
        cc = null;
        JUnitUtil.tearDown();
    }
}
