package View;

import Controller.BuyController;
import Model.PurchaseEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class View {
    /*public static void main(String[] args) {
        EntityManager em=Persistence.createEntityManagerFactory("mysqldb").createEntityManager();
        BuyController bc=new BuyController(em);
        PurchaseEntity pe=bc.getEntity(1);
        System.out.println(pe.getProduct());
        System.out.println(pe.getPrice());
        System.out.println(bc.getEntity(2));
        System.out.println(bc.getAllEntities());
    }*/
  /*public BuyController createController() {
      EntityManager em = Persistence.createEntityManagerFactory("mysqldb").createEntityManager();
      BuyController bc = new BuyController(em);
      return bc;
  }*/
}
