<!doctype html>
<html lang="en">
<head>
    <title></title>

    <link rel="stylesheet" href="/etc/designs/ecommerce/style/bootstrap/css/bootstrap.css"/>
    <link rel="stylesheet" href="/etc/designs/ecommerce/style/bootstrap/css/bootstrap-theme.css"/>

    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <script src="/etc/designs/ecommerce/style/bootstrap/js/bootstrap.js"></script>
    <script src="/etc/designs/ecommerce/javascript/deps/angular.js"></script>

    <script src="/etc/designs/ecommerce/javascript/main.js"></script>

    <script src="/data/products-data.js"></script>

    <script>

    </script>


    <script src="/etc/designs/ecommerce/javascript/lib/controllers/cart_controller.js"></script>
    <script src="/etc/designs/ecommerce/javascript/lib/controllers/product_controller.js"></script>


    <script src="/etc/designs/ecommerce/javascript/lib/directives/cart-button.js"></script>
    <script src="/etc/designs/ecommerce/javascript/lib/directives/productTile.js"></script>
    <script src="/etc/designs/ecommerce/javascript/lib/directives/product_information_button.js"></script>

    <script src="/etc/designs/ecommerce/javascript/lib/services/cart_service.js"></script>

    <style>
        body {

        }
    </style>

</head>
<body>


<div class="container" ng-app="ecommerce">

    <jsp:include page="/apps/ecommerce/components/templates/product/non-cq/base.jsp"/>

<%--
    <div ng-controller="CartController">

        <div>
            <div class="panel panel-info">
                <div class="panel-heading">Cart Information</div>

                <table class="table">
                    <tbody>
                    <tr ng-repeat="product in cart.products">
                        <td>{{product.code}}</td>
                        <td>{{product.quantity}}</td>
                        <td>{{product.totalItemCost}}</td>
                    </tr>
                    </tbody>
                    <tfooter>
                        <tr>
                            <td align="right" colspan="3" style="bold">
                                {{totalCost()}}
                            </td>
                        </tr>
                    </tfooter>
                </table>
            </div>

        </div>


        <div ng-controller="ProductsController">
            <div class="row">
                <div ng-repeat="product in products">
                    <product-tile product="product" cart="cart"></product-tile>
                </div>
            </div>
        </div>
    </div>
--%>
</div>


</body>
</html>
