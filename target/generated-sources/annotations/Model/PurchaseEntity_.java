package Model;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PurchaseEntity.class)
public abstract class PurchaseEntity_ {

	public static volatile SingularAttribute<PurchaseEntity, String> product;
	public static volatile SingularAttribute<PurchaseEntity, Date> dateofbuying;
	public static volatile SingularAttribute<PurchaseEntity, Integer> price;
	public static volatile SingularAttribute<PurchaseEntity, Integer> id;
	public static volatile SingularAttribute<PurchaseEntity, String> category;
	public static volatile SingularAttribute<PurchaseEntity, String> placeofbuying;

}

