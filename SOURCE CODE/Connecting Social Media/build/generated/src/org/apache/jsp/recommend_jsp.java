package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import Dbcon.DbConnection;

public final class recommend_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      			"", true, 8192, true);
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
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <title>Connecting Social Media to E-Commerce</title>\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\" />\n");
      out.write("    <meta content=\"\" name=\"description\" />\n");
      out.write("    <meta content=\"\" name=\"author\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/plugins/bootstrap/css/bootstrap.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/main.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/theme.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/MoneAdmin.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/plugins/Font-Awesome/css/font-awesome.css\" />\n");
      out.write("    <link href=\"assets/css/layout2.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"assets/plugins/flot/examples/examples.css\" rel=\"stylesheet\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/plugins/timeline/timeline.css\" />\n");
      out.write("</head>\n");
      out.write("<style> \n");
      out.write("\n");
      out.write("            .inputs {\n");
      out.write("                background: #B2E1F5;\n");
      out.write("                font-size: 16px;\n");
      out.write("                -moz-border-radius: 3px;\n");
      out.write("                -webkit-border-radius: 3px;\n");
      out.write("                border-radius: 3px;\n");
      out.write("                border: none;\n");
      out.write("                padding: 10px 10px;\n");
      out.write("                width: 240px;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("                box-shadow: inset 0 2px 3px rgba( 0, 0, 0, 0.1 );\n");
      out.write("                clear: both;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .inputs:focus {\n");
      out.write("                background: #fff;\n");
      out.write("                box-shadow: 0 0 0 3px #fff38e, inset 0 2px 3px rgba( 0, 0, 0, 0.2 ), 0px 5px 5px rgba( 0, 0, 0, 0.15 );\n");
      out.write("                outline: none;\n");
      out.write("            }\n");
      out.write("            .inputss {\n");
      out.write("                background: #B2E1F5;\n");
      out.write("                font-size: 1.9rem;\n");
      out.write("                -moz-border-radius: 3px;\n");
      out.write("                -webkit-border-radius: 3px;\n");
      out.write("                border-radius: 3px;\n");
      out.write("                border: none;\n");
      out.write("                padding: 10px 10px;\n");
      out.write("                width: 220px;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("                box-shadow: inset 0 2px 3px rgba( 0, 0, 0, 0.1 );\n");
      out.write("                clear: both;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .inputss:focus {\n");
      out.write("                background: #fff;\n");
      out.write("                box-shadow: 0 0 0 3px #fff38e, inset 0 2px 3px rgba( 0, 0, 0, 0.2 ), 0px 5px 5px rgba( 0, 0, 0, 0.15 );\n");
      out.write("                outline: none;\n");
      out.write("            }\n");
      out.write("            .button {\n");
      out.write("                background-color: forestgreen; /* Green */\n");
      out.write("                border: none;\n");
      out.write("                color: white;\n");
      out.write("                padding: 10px 90px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: inline-block;\n");
      out.write("                font-size: 16px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("<body class=\"padTop53 \" >\n");
      out.write("    <div id=\"wrap\" >\n");
      out.write("        <div id=\"top\">\n");
      out.write("            <nav class=\"navbar navbar-inverse navbar-fixed-top \" style=\"padding-top: 10px;\">\n");
      out.write("                <a data-original-title=\"Show/Hide Menu\" data-placement=\"bottom\" data-tooltip=\"tooltip\" class=\"accordion-toggle btn btn-primary btn-sm visible-xs\" data-toggle=\"collapse\" href=\"#menu\" id=\"menu-toggle\">\n");
      out.write("                    <i class=\"icon-align-justify\"></i>\n");
      out.write("                </a>\n");
      out.write("                <header class=\"navbar-header\">\n");
      out.write("                    <H4><font style=\"font-family: fantasy; font-size: 20px \">Connecting Social Media to E-Commerce: Cold-Start Product Recommendation Using Microblogging Information</font></H4>\n");
      out.write("                </header>\n");
      out.write("                <ul class=\"nav navbar-top-links navbar-right\">\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                            <span class=\"label label-success\">2</span>    <i class=\"icon-envelope-alt\"></i>&nbsp; <i class=\"icon-chevron-down\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu dropdown-messages\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <strong>John Smith</strong>\n");
      out.write("                                        <span class=\"pull-right text-muted\">\n");
      out.write("                                            <em>Today</em>\n");
      out.write("                                        </span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>Lorem ipsum dolor sit amet, consectetur adipiscing.\n");
      out.write("                                        <br />\n");
      out.write("                                        <span class=\"label label-primary\">Important</span> \n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <strong>Raphel Jonson</strong>\n");
      out.write("                                        <span class=\"pull-right text-muted\">\n");
      out.write("                                            <em>Yesterday</em>\n");
      out.write("                                        </span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>Lorem ipsum dolor sit amet, consectetur adipiscing.\n");
      out.write("                                        <br />\n");
      out.write("                                        <span class=\"label label-success\"> Moderate </span> \n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <strong>Chi Ley Suk</strong>\n");
      out.write("                                        <span class=\"pull-right text-muted\">\n");
      out.write("                                            <em>26 Jan 2014</em>\n");
      out.write("                                        </span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>Lorem ipsum dolor sit amet, consectetur adipiscing.\n");
      out.write("                                        <br />\n");
      out.write("                                        <span class=\"label label-danger\"> Low </span> \n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a class=\"text-center\" href=\"#\">\n");
      out.write("                                    <strong>Read All Messages</strong>\n");
      out.write("                                    <i class=\"icon-angle-right\"></i>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                            <i class=\"icon-user \"></i>&nbsp; <i class=\"icon-chevron-down \"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu dropdown-user\">\n");
      out.write("                            <li><a href=\"#\"><i class=\"icon-user\"></i> User Profile </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"icon-gear\"></i> Settings </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li><a href=\"index.jsp\"><i class=\"icon-signout\"></i> Logout </a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"left\" >\n");
      out.write("            <div class=\"media user-media well-small\">\n");
      out.write("                <a class=\"user-link\" href=\"#\">\n");
      out.write("                </a>\n");
      out.write("                <br />\n");
      out.write("                <div class=\"media-body\">\n");
      out.write("                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img  alt=\"User Picture\" src=\"img/mon.jpg\" width=\"120\" height=\"120\" />\n");
      out.write("                    <h5 class=\"media-heading\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;E-Commerce</h5>\n");
      out.write("                    <ul class=\"list-unstyled user-info\">\n");
      out.write("\n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <br />\n");
      out.write("            </div>\n");
      out.write("            <!--START MENU SECTION -->\n");
      out.write("            <ul id=\"menu\" class=\"collapse\">\n");
      out.write("                <li><a href=\"e_commerce.jsp\" >E-Commerce Home</a></li>\n");
      out.write("                <li><a href=\"recommend.jsp\" >Recommendation</a></li>\n");
      out.write("                <li><a href=\"recom_de.jsp\">Recommended Details</a></li>\n");
      out.write("                <li><a href=\"index.jsp\">Logout</a></li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"content\">\n");
      out.write("\n");
      out.write("            <div class=\"inner\" style=\"min-height: 700px;\">\n");
      out.write("                \n");
      out.write("           <!---@1 part Start--->\n");
      out.write("            <center><div class=\"col_w300\">\n");
      out.write("                     <!---@1 part Start--->\n");
      out.write("                     <h3 class=\"service2\" style=\"color: orange\">Product Recommendation by Demographic Attributes and<br> Text Attributes</h3>\n");
      out.write("                     <form action=\"Recommends\" method=\"get\"> \n");
      out.write("                           <input type=\"text\" required=\"Gender\" class=\"inputs\" name=\"gen\" /><br>\n");
      out.write("                           <input type=\"text\" required=\"Age\" class=\"inputs\" name=\"age\"/><br>\n");
      out.write("                           <input type=\"text\" required=\"Marital Status\" class=\"inputs\" name=\"marital\"/><br> \n");
      out.write("                           <input type=\"text\" required=\"Education\" class=\"inputs\" name=\"edu\"/><br>\n");
      out.write("                           <input type=\"text\" required=\"Interests\" class=\"inputs\" name=\"interest\"/><br>\n");
      out.write("                           <input type=\"file\" required=\"\" class=\"inputs\" name=\"photo\"  />\n");
      out.write("                           <textarea rows=\"3\" cols=\"30\"></textarea><br><br>\n");
      out.write("                           <input type=\"Submit\" value=\"UPLOAD\" class=\"button\" >\n");
      out.write("                     </form>\n");
      out.write("                     <!---@1 part End--->\n");
      out.write("            </div></center>\n");
      out.write("           <!---@1 part End--->\n");
      out.write("                                                    \n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"right\">\n");
      out.write("            <br><div class=\"well well-small\">\n");
      out.write("               <img width=\"180\" height=\"150\" src=\"img\\e3.png\"/>\n");
      out.write("            </div><br>\n");
      out.write("            <div class=\"well well-small\">\n");
      out.write("               <img width=\"180\" height=\"150\" src=\"img\\e2.png\"/>\n");
      out.write("            </div><br>\n");
      out.write("            <div class=\"well well-small\">\n");
      out.write("                <img width=\"180\" height=\"150\" src=\"img\\e1.png\"/>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"footer\">\n");
      out.write("        <p>&copy;  CopyRight &nbsp;2017 &nbsp;</p>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"assets/plugins/jquery-2.0.3.min.js\"></script>\n");
      out.write("    <script src=\"assets/plugins/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"assets/plugins/modernizr-2.6.2-respond-1.1.0.min.js\"></script>\n");
      out.write("    <script src=\"assets/plugins/flot/jquery.flot.js\"></script>\n");
      out.write("    <script src=\"assets/plugins/flot/jquery.flot.resize.js\"></script>\n");
      out.write("    <script src=\"assets/plugins/flot/jquery.flot.time.js\"></script>\n");
      out.write("    <script  src=\"assets/plugins/flot/jquery.flot.stack.js\"></script>\n");
      out.write("    <script src=\"assets/js/for_index.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
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
}
