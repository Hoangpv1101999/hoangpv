<%-- 
    Document   : home1
    Created on : Mar 15, 2021, 8:37:31 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <title>May túi siêu thị</title>
        <!-- for-mobile-apps -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Super Market Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
            function hideURLbar(){ window.scrollTo(0,1); } </script>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/font-awesome.css" rel="stylesheet" type="text/css"/>
        <link href="css/skdslider.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/easing.js" type="text/javascript"></script>
        <script src="js/jquery-1.11.1.min.js" type="text/javascript"></script>
        <script src="js/minicart.min.js" type="text/javascript"></script>
        <script src="js/move-top.js" type="text/javascript"></script>
        <script src="js/responsiveslides.min.js" type="text/javascript"></script>
        <script src="js/skdslider.min.js" type="text/javascript"></script>

    </script>
    <!-- start-smoth-scrolling -->
</head>

<body>
    <!-- header -->
    <div class="agileits_header">
        <div class="container">
            <div class="agile-login">
                <ul>
                    <li><a href="logout">Đăng xuất</a></li>
                </ul>
            </div>
            <div class="clearfix"> </div>
        </div>
    </div>
    <div class="logo_products">
        <div class="container">
            <div class="w3ls_logo_products_left">
                <h1><a href="main">Túi siêu thị</a></h1>
            </div>
            <div class="clearfix"> </div>
        </div>
    </div>
    <div class="navigation-agileits">
        <div class="container">
            <nav class="navbar navbar-default">
                <div class="navbar-header nav_2">
                    <button type="button" class="navbar-toggle collapsed navbar-toggle1" data-toggle="collapse" data-target="#bs-megadropdown-tabs">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                </div> 
                <div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
                    <ul class="nav navbar-nav">
                        <li class="dropdown">
                            <a href="main" class="dropdown-toggle" >Sản phẩm<b ></b></a>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Xuất nhập<b class="caret"></b></a>
                            <ul class="dropdown-menu multi-column columns-3">
                                <div class="row">
                                    <div class="multi-gd-img">
                                        <ul class="multi-column-dropdown">
                                            <h6>Danh sách</h6>
                                            <li><a href="import">Danh sách nhập kho</a></li>
                                            <li><a href="export">Danh sách xuất kho</a></li>
                                        </ul>
                                    </div>	

                                </div>
                            </ul>
                        </li>

                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Báo cáo<b class="caret"></b></a>
                            <ul class="dropdown-menu multi-column columns-3">
                                <div class="row">
                                    <div class="multi-gd-img">
                                        <ul class="multi-column-dropdown">
                                            <h6>Danh sách</h6>
                                            <li><a href="payment">Thanh toán</a></li>
                                        </ul>
                                    </div>	
                                </div>
                            </ul>
                        </li>
                    </ul>
                </div>
            </nav>
        </div>
    </div>


    <div class="top-brands">
        <div class="container">
            <h2>Sản phẩm</h2>
            <div class="grid_3 grid_5">
                <div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
                    <div id="myTabContent" class="tab-content">
                        <!--                        <div  id="bottomPagger" class="pagger"></div>-->
                        <div class="clearfix">

                            <ul class="pagination">
                                <c:if test="${pageindex>2}">
                                    <li class="page-item disabled"><a href="main?page=${pageindex-1}"><<</a></li>
                                    </c:if>
                                    <c:forEach begin="1" end="${endpage}" var="i">
                                    <li class="page-item ${pageindex==i?"active":""}"><a href="main?page=${i}" class="page-link">${i}</a></li>
                                    </c:forEach>
                                    <c:if test="${pageindex<endpage}">
                                    <li class="page-item"><a href="main?page=${pageindex+1}" class="page-link">>></a></li>
                                    </c:if>
                            </ul>
                        </div>
                        <div style="background-color: black" role="tabpanel" class="tab-pane fade in active" id="expeditions" aria-labelledby="expeditions-tab">
                            <c:forEach items="${requestScope.products}" var="p">
                                <div class="agile_top_brands_grids">
                                    <div class="col-md-3 top_brand_left-1">
                                        <div class="hover14 column">
                                            <div class="agile_top_brand_left_grid">
                                                <div class="agile_top_brand_left_grid1">
                                                    <figure>
                                                        <div class="snipcart-item block">
                                                            <div class="snipcart-thumb">
                                                                <a ><img title=" " alt=" " src="${p.img}"></a>		
                                                                <p>${p.name}</p>
                                                            </div>
                                                        </div>
                                                    </figure>
                                                </div>
                                            </div>
                                            <div class="clearfix"> </div>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                    </div>
                </div>
                <!--
                <!--banner-bottom-->
                <div class="ban-bottom-w3l">
                    <div class="container">
                        <div class="col-md-6 ban-bottom3">
                            <div class="ban-top">
                                <img src="images/p2.jpg" class="img-responsive" alt=""/>

                            </div>
                            <div class="ban-img">
                                <div class=" ban-bottom1">
                                    <div class="ban-top">
                                        <img src="images/p3.jpg" class="img-responsive" alt=""/>

                                    </div>
                                </div>
                                <div class="ban-bottom2">
                                    <div class="ban-top">
                                        <img src="images/p4.jpg" class="img-responsive" alt=""/>
                                    </div>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                        </div>
                        <div class="col-md-6 ban-bottom">
                            <div class="ban-top">
                                <img src="images/111.jpg" class="img-responsive" alt=""/>


                            </div>
                        </div>

                        <div class="clearfix"></div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script src="js/bootstrap.min.js"></script>
    <!-- here stars scrolling icon -->
    <script type="text/javascript">
        $(document).ready(function () {
            /*
             var defaults = {
             containerID: 'toTop', // fading element id
             containerHoverID: 'toTopHover', // fading element hover id
             scrollSpeed: 1200,
             easingType: 'linear' 
             };
             */

            $().UItoTop({easingType: 'easeOutQuart'});

        });
    </script>
    <!-- //here ends scrolling icon -->
    <script src="js/minicart.min.js"></script>
    <script>
        // Mini Cart
        paypal.minicart.render({
            action: '#'
        });

        if (~window.location.search.indexOf('reset=true')) {
            paypal.minicart.reset();
        }
    </script>
    <!-- main slider-banner -->
    <script src="js/skdslider.min.js"></script>
    <link href="css/skdslider.css" rel="stylesheet">
    <script type="text/javascript">
        jQuery(document).ready(function () {
            jQuery('#demo1').skdslider({'delay': 5000, 'animationSpeed': 2000, 'showNextPrev': true, 'showPlayButton': true, 'autoSlide': true, 'animationType': 'fading'});

            jQuery('#responsive').change(function () {
                $('#responsive_wrapper').width(jQuery(this).val());
            });

        });
    </script>


    <br>
    <br>
    <nav style="background-color: #BBBBBB;text-align: center" class="footer">
        <div>
            <a>Công ty TNHH thương mại sản xuất dịch vụ PHẠM GIA</a><br>
            <a>Địa chỉ : Thôn Hoàng Long - Xã Tản Lĩnh - Huyện Ba Vì - Hà Nội</a><br>
            <a>Số điện Thoại: 0333.559.686</a>
        </div>
    </nav>
    <!-- //main slider-banner --> 
</body>
</html>
