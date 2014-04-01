package ecommerce.cart.web;

import ecommerce.cart.Cart;
import ecommerce.domain.PurchaseProduct;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

public class HttpCart extends Cart {

    private final HttpSession session;

    public HttpCart(HttpServletRequest request) {
        session = request.getSession(true);
    }


    @Override
    protected void store(Map<String, PurchaseProduct> products) {
        session.setAttribute("cart", products);
    }

    @Override
    public Map<String, PurchaseProduct> getProducts() {
        return (Map<String, PurchaseProduct>) session.getAttribute("cart");
    }
}
