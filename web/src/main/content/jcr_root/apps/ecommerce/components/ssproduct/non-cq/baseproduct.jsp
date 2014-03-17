<%@taglib prefix="sf" uri="http://www.smithstone.com/ecommerce/tags" %>
<%@taglib prefix="pa" tagdir="/WEB-INF/tags/apps/ecommerce/components/tags" %>

<sf:productFactory/>

<jsp:useBean id="product" type="ecommerce.domain.Product" scope="request"/>

<div data-ng-app="ecommerce">

    <div>
        <p data-ng-controller="GreetingController">
            {{greeting}}
        </p>
    </div>

    <div>

        <div data-ng-controller="LoginController">

            <p>{{ formMessage }}</p>


            <form action="#" data-ng-submit="login()">

                <fieldset>

                    <div>
                        <label for="username">Username : </label>
                        <input type="text" id="username" data-ng-model="model.username">
                        <p>{{model.username}}</p>
                    </div>

                    <div>
                        <label for="password">Password : </label>
                        <input type="password" id="password" data-ng-model="model.password"/>
                        <p>{{model.password}}</p>
                    </div>

                </fieldset>

                <fieldset>

                    <div>
                        <input type="submit" value="Login"/>
                    </div>

                </fieldset>

            </form>


        </div>


    </div>
</div>




<%--<div class="product-info">
    <h2>Product</h2>

    <div class="attribute">
        <div class="title">${product.ui.titleLabel}</div>
        <div class="data">${product.model.title}</div>
    </div>


    <pa:product_information label="${product.ui.descriptionLabel}" data="${product.model.description}"/>
    <pa:product_information label="${product.ui.idLabel}" data="${product.model.id}"/>
    <pa:product_information label="${product.ui.priceLabel}" data="${product.model.price}"/>


    <div class="attribute">
        <div class="title">${product.ui.summaryLabel}</div>
        <div class="data">${product.model.summary}</div>
    </div>

    <div class="attribute">
        <div class="title">${product.ui.featuresLabel}</div>
        <div class="data">${product.model.features}</div>
    </div>

    <div class="attribute">
        <div class="title">${product.ui.categoriesLabel}</div>
        <div class="data">${product.model.categories}</div>
    </div>

    <div class="attribute">
        <div class="title">${product.ui.stockCodeLabel}</div>
        <div class="data">${product.model.stockCode}</div>
    </div>

    <div class="attribute">
        <div class="title">${product.ui.stockLevelLabel}</div>
        <div class="data">${product.model.stockLevel}</div>
    </div>

    <div class="clear_fix"></div>
</div>--%>
