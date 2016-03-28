package org.netbeans.modules.snhwp.level1;

import java.beans.IntrospectionException;
import java.util.List;
import org.netbeans.api.progress.BaseProgressUtils;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.RequestProcessor;

public class Level1ChildFactory extends ChildFactory<String> {

    @Override
    protected boolean createKeys(final List<String> list) {
        BaseProgressUtils.showProgressDialogAndRun(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10000);
                    list.add("one");
                } catch (InterruptedException ex) {
                    Exceptions.printStackTrace(ex);
                }
            }
        }, "Processing Level 1...");
        return true;
    }

    @Override
    protected Node createNodeForKey(String key) {
        Level1Node node = null;
        try {
            node = new Level1Node(key);
        } catch (IntrospectionException ex) {
            Exceptions.printStackTrace(ex);
        }
        return node;
    }

}
