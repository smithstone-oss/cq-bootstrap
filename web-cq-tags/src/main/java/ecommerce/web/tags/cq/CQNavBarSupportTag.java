package ecommerce.web.tags.cq;

import ecommerce.domain.NavBarBodyModelUI;
import ecommerce.domain.NavBarHeaderUI;
import ecommerce.domain.NavBarLinkModel;
import ecommerce.web.tags.AbstractNavBarSupportTag;
import ecommerce.web.tags.NavBarBodyModelUIFactory;
import ecommerce.web.tags.NavBarFactory;
import ecommerce.web.tags.NavBarHeaderUIFactory;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CQNavBarSupportTag extends AbstractNavBarSupportTag {

    @Override
    protected NavBarFactory getNavBarFactory() {


        final Resource resource = ResourceLocator.locate(getJspContext());
        final ValueMap properties = resource.adaptTo(ValueMap.class);


        NavBarFactory navBarFactory = new NavBarFactory() {
            @Override
            public NavBarHeaderUIFactory getHeaderFactory() {
                return new NavBarHeaderUIFactory() {
                    @Override
                    public NavBarHeaderUI getInstance() {
                        return new NavBarHeaderUI() {
                            @Override
                            public String getBrand() {
                                return properties.get("brand", "--");
                            }
                        };
                    }

                };
            }

            @Override
            public NavBarBodyModelUIFactory getBodyFactory() {
                return getLinks(resource);
            }
        };


        return navBarFactory;

    }

    private NavBarBodyModelUIFactory getLinks(final Resource resource) {
        return new NavBarBodyModelUIFactory() {
            @Override
            public NavBarBodyModelUI getInstance() {
                return new NavBarBodyModelUI() {
                    @Override
                    public List<NavBarLinkModel> getLinks() {
                        ArrayList<NavBarLinkModel> list = new ArrayList<NavBarLinkModel>();
                        Iterator<Resource> links = resource.getChild("links").listChildren();

                        while (links.hasNext()) {

                            list.add(getNavBarLinkModel(links));
                        }


                        return list;
                    }

                    @Override
                    public String getId() {
                        return "bs-example-navbar-collapse-1";
                    }
                };
            }
        };
    }

    private NavBarLinkModel getNavBarLinkModel(Iterator<Resource> links) {
        Resource next = links.next();
        final ValueMap valueMap = next.adaptTo(ValueMap.class);
        return new NavBarLinkModel() {

            @Override
            public boolean isActive() {
                return Boolean.parseBoolean(valueMap.get("active", "false"));
            }

            @Override
            public String getHref() {
                return valueMap.get("href", "#");
            }

            @Override
            public String getText() {
                return valueMap.get("text", "-");
            }
        };
    }
}