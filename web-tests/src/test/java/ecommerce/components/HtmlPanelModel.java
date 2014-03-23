package ecommerce.components;

import ecommerce.domain.PanelModel;
import org.jsoup.nodes.Element;

class HtmlPanelModel implements PanelModel {

    private Element element;

    HtmlPanelModel(Element element) {
        this.element = element;
    }

    @Override
    public String getText() {
        return getElementText(".panel-body" , 0);
    }

    protected final String getElementText(String selector, int index){
        return element.select(selector).get(index).text();
    }

}
