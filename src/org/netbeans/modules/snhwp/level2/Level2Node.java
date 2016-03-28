package org.netbeans.modules.snhwp.level2;

import java.beans.IntrospectionException;
import org.netbeans.modules.snhwp.level3.Level3ChildFactory;
import org.openide.nodes.BeanNode;
import org.openide.nodes.Children;

public class Level2Node extends BeanNode {
    
    public Level2Node(String bean) throws IntrospectionException {
        super(bean, Children.create(new Level3ChildFactory(), true));
        setDisplayName(bean);
    }
    
}
