package es.upm.dit.gsi.intellijbootstrapplugin;

import com.intellij.codeInsight.template.TemplateActionContext;
import com.intellij.codeInsight.template.TemplateContextType;
import org.jetbrains.annotations.NotNull;

public class HTMLContext extends TemplateContextType {

    protected HTMLContext() {
        super("HTML", "HTML");
    }

    @Override
    public boolean isInContext(@NotNull TemplateActionContext templateActionContext) {
        return templateActionContext.getFile().getName().endsWith(".html");
    }
}
