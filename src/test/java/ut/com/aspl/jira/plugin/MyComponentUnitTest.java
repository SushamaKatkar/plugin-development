package ut.com.aspl.jira.plugin;

import org.junit.Test;
import com.aspl.jira.plugin.api.MyPluginComponent;
import com.aspl.jira.plugin.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}