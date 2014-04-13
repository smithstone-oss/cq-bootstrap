package ecommerce.http.cq.servlets;

import org.apache.sling.commons.testing.sling.MockSlingHttpServletRequest;
import org.apache.sling.commons.testing.sling.MockSlingHttpServletResponse;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.mock.web.MockHttpSession;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class JSONViewCartSlingServletTest {


    @Test
    public void onGetShouldReturnJsonViewOfMyCart() throws Exception {
        JSONViewCartSlingServlet servlet = new JSONViewCartSlingServlet();
        MockSlingHttpServletRequest request =
                new MockSlingHttpServletRequest("/content/commerce/en",
                        "cart.view", "do", "", "") {

                    @Override
                    public HttpSession getSession() {
                        return new MockHttpSession();
                    }

                    @Override
                    public HttpSession getSession(boolean create) {
                        return new MockHttpSession();
                    }
                };
        final MockHttpServletResponse response = new MockHttpServletResponse();


        servlet.doGet(request, new MockSlingHttpServletResponse() {
            @Override
            public PrintWriter getWriter() throws IOException {
                return response.getWriter();
            }

            @Override
            public void setContentType(String contentType) {
                response.setContentType(contentType);
            }
        });

        assertThat(response.getContentType(), equalTo("application/json"));
        assertThat(response.getContentAsString(), not(nullValue()));

    }
}

