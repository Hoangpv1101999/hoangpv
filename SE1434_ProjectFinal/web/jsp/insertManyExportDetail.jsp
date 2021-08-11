<%-- 
    Document   : insertManyExportDetail
    Created on : Mar 21, 2021, 12:58:37 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Nhập khẩu</title>
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
        <!----------------------------------------->
        <link href="css/home1.css" rel="stylesheet" type="text/css"/>

    </head>
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
    <!-- //main slider-banner --> 
    <body>
        <div>
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
        </div>

        <link href="css/home4.css" rel="stylesheet" type="text/css"/>
        <link href="css/footer.css" rel="stylesheet" type="text/css"/>
        <h2 class="title">Thêm lỗi chi tiết</h2>
        <form action="InsertManyExportDetail" method="post">
            <table class="table table-bordered">
                <thead>
                <p>Mã sản phẩm : ${idss}</p>
                <tr>
                    <th>Các loại lỗi</th>
                    <th>Số lượng </th>
                    <th>Tỉ lệ(%)</th>
                    <th>Cho phép</th>
                    <th>Không cho phép</th>
                </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>
                            <select name="type" class="form-select" aria-label="Default select example">
                                <option selected>Chọn lỗi</option>
                                <c:forEach items="${requestScope.typeE}" var="e">
                                    <option 
                                        <c:if test="${type eq e.typeError}">
                                            selected="selected"
                                        </c:if>
                                        value="${e.typeError}">
                                        ${e.typeError}
                                    </option>
                                </c:forEach>
                            </select>
                        </td>
                        <td><input type="number" name="amount"> </td>
                        <td><input type="text" name="rate"> </td>
                        <td>
                            <input type="radio" name="allow" value="a"/>Có
                            <input type="radio" name="allow" value="a1" />Không
                        </td>
                        <td>
                            <input type="radio" name="notallow" value="b" />Có
                            <input type="radio" name="notallow" value="b1" />Không
                        </td>
                    </tr>
                </tbody>
            </table>

            <button style="float: right;margin-right: 50px;" class="w-100 btn btn-primary btn-lg" type="submit">Thêm</button>
        </form>
        <br>
        <br>
        <nav style="margin-top: 120px" class="footer">
            <div>
                <a>Công ty TNHH thương mại sản xuất dịch vụ PHẠM GIA</a><br>
                <a>Địa chỉ : Thôn Hoàng Long - Xã Tản Lĩnh - Huyện Ba Vì - Hà Nội</a><br>
                <a>Số điện Thoại: 0333.559.686</a>
            </div>
        </nav>
    </body>


</html>


