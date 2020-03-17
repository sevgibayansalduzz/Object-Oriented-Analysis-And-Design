package part4;

import part4.Factory.ConcreteFactory;
import part4.Factory.ProductionFactory;
import part4.Factory.TPX;

public class FactoryMethodTesting {
    public static void main(String[] args) {
        ProductionFactory factory=new ConcreteFactory();
        TPX plane =factory.orderPlane("100");
        System.out.println("Ordered a "+plane.getName()+" for "+plane.getPurpose()+".\n");
        plane =factory.orderPlane("200");
        System.out.println("Ordered a "+plane.getName()+" for "+plane.getPurpose()+".\n");
        plane=factory.orderPlane("300");
        System.out.println("Ordered a "+plane.getName()+" for "+plane.getPurpose()+".\n");
    }
}
