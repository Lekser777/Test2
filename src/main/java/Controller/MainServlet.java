package Controller;

import Controller.BuyController;
import Model.PurchaseEntity;
import org.hibernate.Session;

import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet
public class MainServlet extends HttpServlet {

    @EJB
    private BuyController bc;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       //List<PurchaseEntity> pclist=bc.getAllEntities();
        // добавляем полученный список в request,
        // который отправится на jsp
      PurchaseEntity pc=bc.getEntity(1);
       request.setAttribute("entityname", pc.getProduct());
        request.setAttribute("entitycat", pc.getCategory());
        request.setAttribute("entityprice", pc.getPrice());

      // request.setAttribute("products",pclist);
        // отправляем request на jsp
        request.getRequestDispatcher("/index.jsp").forward(request, response);

    }
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

}
