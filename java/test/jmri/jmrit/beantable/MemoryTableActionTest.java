package jmri.jmrit.beantable;

import jmri.util.JUnitUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for classes in the jmri.jmrit.beantable package
 *
 * @author	Bob Jacobsen Copyright 2004
 */
public class MemoryTableActionTest extends AbstractTableActionBase {

    @Test
    public void testCreate() {
        Assert.assertNotNull(a);
    }

    @Override
    public String getTableFrameName(){
       return Bundle.getMessage("TitleMemoryTable");
    }

    @Override
    @Test
    public void testGetClassDescription(){
         Assert.assertEquals("Memory Table Action class description","Memory Table",a.getClassDescription());
    }

    /**
     * Check the return value of includeAddButton.  The table generated by 
     * this action includes an Add Button.
     */
    @Override
    @Test
    public void testIncludeAddButton(){
         Assert.assertTrue("Default include add button",a.includeAddButton());
    }

    @Before
    public void setUp() {
        JUnitUtil.setUp();
        jmri.util.JUnitUtil.resetProfileManager();
        jmri.util.JUnitUtil.initDefaultUserMessagePreferences();
        a = new MemoryTableAction();
    }

    @After
    public void tearDown() {
        JUnitUtil.tearDown();
        a = null;
    }

}
