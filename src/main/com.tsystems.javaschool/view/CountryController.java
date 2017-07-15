package view;

import entities.CountryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import svc.CountryService;
import svc.Impl.CountryServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

/**
 * Created by Людмила on 14.07.2017.
 */

@Controller
public class CountryController {

    @Autowired
    private CountryService countryService;

    private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(CountryController.class);
    //private static Logger log = Logger.getLogger(CountryController.class.getName());

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String listUsers(@RequestParam("countries") String param, Model model) throws SQLException {
        model.addAttribute("countries",param);
        System.out.println("Привет!");
        System.err.println("WTF?!");
        log.info("hiadfasfasfasfasfasf");
        List<CountryEntity> countryEntity = countryService.getAllCountries();
        String res="";
        for (CountryEntity ce:countryEntity) {
                res=res+ce.getName()+"\n";
        }
        return res;

    }


//@Controller
//public class CountryController {
//
//    @Autowired
//    private CountryServiceImpl countryService;
//
////    @RequestMapping(value = "/countries", method = RequestMethod.GET)
////    public List<CountryEntity> listUsers() throws SQLException {
////        return countryService.getAllCountries();
////    }
//
//    @RequestMapping(value = "/countries", method = RequestMethod.POST)
//    public String listUsers(Model model) throws SQLException {
//        model.addAttribute("user", new CountryEntity());
//        model.addAttribute("countries", countryService.getAllCountries());
//        return "countries";
//    }
//
//
//
// }


//public class CountryController extends HttpServlet {
//
//    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
//
//    private CountryServiceImpl countryService;
//    /**
//     * Handles the HTTP <code>GET</code> method.
//     *
//     * @param request  servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException      if an I/O error occurs
//     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//
//        String userStr = request.getParameter("userString");
//        if (userStr == null || userStr.trim().isEmpty()) {
//            //userStr = getInitParameter ("defaultName");
//            response.sendRedirect("index.html");
//        }
//
//
//
//        if (userStr.equals(request.getParameter("userString"))) {
//            int wordCount = userStr.split(" +").length;
//            userStr = userStr + "<br><br>Count: " + wordCount;
//        }
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet Hello</title>");
//            out.println("</head>");
//            out.println("<body>");
//
//            List<CountryEntity> countryEntity = (List<CountryEntity>) countryService.getAllCountries();
//            for (CountryEntity ce:countryEntity) {
//                out.println("<p>"+ce.getName()+"</p>");
//
//            }
//            out.println("</body>");
//            out.println("</html>");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request  servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException      if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet Hello</title>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet Hello at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }
}