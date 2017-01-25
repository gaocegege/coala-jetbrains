package io.coala.idea;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;

/**
 * Created by gaoce on 2017/1/25.
 */
public class MyActionClass extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
        Messages.showMessageDialog("Hello!\n I am glad to see you.", "Information", Messages.getInformationIcon());
    }
}
