package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class payment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Nhập khẩu</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"keywords\" content=\"Super Market Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("            function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/font-awesome.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/skdslider.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/easing.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/jquery-1.11.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/minicart.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/move-top.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/responsiveslides.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/skdslider.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!----------------------------------------->\n");
      out.write("        <link href=\"css/home1.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- here stars scrolling icon -->\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            /*\n");
      out.write("             var defaults = {\n");
      out.write("             containerID: 'toTop', // fading element id\n");
      out.write("             containerHoverID: 'toTopHover', // fading element hover id\n");
      out.write("             scrollSpeed: 1200,\n");
      out.write("             easingType: 'linear' \n");
      out.write("             };\n");
      out.write("             */\n");
      out.write("\n");
      out.write("            $().UItoTop({easingType: 'easeOutQuart'});\n");
      out.write("\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("    <!-- //here ends scrolling icon -->\n");
      out.write("    <script src=\"js/minicart.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("        // Mini Cart\n");
      out.write("        paypal.minicart.render({\n");
      out.write("            action: '#'\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        if (~window.location.search.indexOf('reset=true')) {\n");
      out.write("            paypal.minicart.reset();\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("    <!-- main slider-banner -->\n");
      out.write("    <script src=\"js/skdslider.min.js\"></script>\n");
      out.write("    <link href=\"css/skdslider.css\" rel=\"stylesheet\">\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        jQuery(document).ready(function () {\n");
      out.write("            jQuery('#demo1').skdslider({'delay': 5000, 'animationSpeed': 2000, 'showNextPrev': true, 'showPlayButton': true, 'autoSlide': true, 'animationType': 'fading'});\n");
      out.write("\n");
      out.write("            jQuery('#responsive').change(function () {\n");
      out.write("                $('#responsive_wrapper').width(jQuery(this).val());\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        });\n");
      out.write("    </script>\t\n");
      out.write("    <!-- //main slider-banner --> \n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <div class=\"agileits_header\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"agile-login\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"registered.html\"> Create Account </a></li>\n");
      out.write("                            <li><a href=\"login\">Đăng nhập</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"logo_products\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"w3ls_logo_products_left\">\n");
      out.write("                        <h1><a href=\"main\">Túi siêu thị</a></h1>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"navigation-agileits\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <nav class=\"navbar navbar-default\">\n");
      out.write("                        <div class=\"navbar-header nav_2\">\n");
      out.write("                            <button type=\"button\" class=\"navbar-toggle collapsed navbar-toggle1\" data-toggle=\"collapse\" data-target=\"#bs-megadropdown-tabs\">\n");
      out.write("                                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                            </button>\n");
      out.write("                        </div> \n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"bs-megadropdown-tabs\">\n");
      out.write("                            <ul class=\"nav navbar-nav\">\n");
      out.write("                                <li class=\"active\"><a href=\"main\" class=\"act\">Trang chủ</a></li>\t\n");
      out.write("                                <li class=\"dropdown\">\n");
      out.write("                                    <a href=\"main\" class=\"dropdown-toggle\" >Sản phẩm<b ></b></a>\n");
      out.write("\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"dropdown\">\n");
      out.write("                                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Xuất nhập<b class=\"caret\"></b></a>\n");
      out.write("                                    <ul class=\"dropdown-menu multi-column columns-3\">\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"multi-gd-img\">\n");
      out.write("                                                <ul class=\"multi-column-dropdown\">\n");
      out.write("                                                    <h6>Danh sách</h6>\n");
      out.write("                                                    <li><a href=\"import\">Danh sách nhập kho</a></li>\n");
      out.write("                                                    <li><a href=\"export\">Danh sách xuất kho</a></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                            </div>\t\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"dropdown\">\n");
      out.write("                                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Báo cáo<b class=\"caret\"></b></a>\n");
      out.write("                                    <ul class=\"dropdown-menu multi-column columns-3\">\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"multi-gd-img\">\n");
      out.write("                                                <ul class=\"multi-column-dropdown\">\n");
      out.write("                                                    <h6>Danh sách</h6>\n");
      out.write("                                                    <li><a href=\"groceries.html\">Tổng hợp</a></li>\n");
      out.write("                                                    <li><a href=\"groceries.html\">Tồn kho</a></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                            </div>\t\n");
      out.write("                                        </div>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <link href=\"css/footer.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <h2 style=\"margin-top: 30px;text-align: center;color: #00e58b\">Thanh toán</h2>\n");
      out.write("        <table  class=\"table table-bordered\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th scope=\"rowgroup\">Mã sản phẩm</th>\n");
      out.write("                    <th scope=\"rowgroup\">Tên sản phẩm</th>\n");
      out.write("                    <th scope=\"rowgroup\"></th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                \n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <nav class=\"footer\">\n");
      out.write("            <div>\n");
      out.write("                <a>Contact: FPT University</a><br>\n");
      out.write("                <a>Adress: Hòa lạc</a><br>\n");
      out.write("                <a>Phone: 0392465659</a>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("p");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.products}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <tr>\n");
          out.write("\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                        <td>\n");
          out.write("                            <a href=\"paymentAll?productid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Thanh toán>></a>\n");
          out.write("                        </td>\n");
          out.write("                    </tr>\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
