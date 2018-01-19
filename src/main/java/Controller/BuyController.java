package Controller;

import Model.PurchaseEntity;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaQuery;
import javax.ejb.Stateless;
import java.util.List;
@Stateless
public class BuyController {
    @PersistenceContext
    private EntityManager em;

    //public BuyController(EntityManager em)
   // {this.em=em;}
   public BuyController(){}
    public PurchaseEntity getEntity(int id){
        return em.find(PurchaseEntity.class,id);

    }
    public List<PurchaseEntity> getAllEntities() {
        CriteriaQuery<PurchaseEntity> criteria=em.getCriteriaBuilder().createQuery(PurchaseEntity.class);
        criteria.select(criteria.from(PurchaseEntity.class));
        return em.createQuery(criteria).getResultList();
    }
}
