package part4;

import part4.AbstractFactory.*;

public class AbstractFactoryTesting {
    public static void main(String[] args) {
        ProductionFactory factory1 = new OtherFactory();
        ProductionFactory factory2 = new DomesticFactory();
        ProductionFactory factory3 = new EurasiaFactory();

        TPX plane =factory1.orderPlane("100");
        System.out.println("Ordered a "+plane.getName()+" for "+plane.getPurpose()+".\n");
        plane =factory1.orderPlane("200");
        System.out.println("Ordered a "+plane.getName()+" for "+plane.getPurpose()+".\n");
        plane=factory1.orderPlane("300");
        System.out.println("Ordered a "+plane.getName()+" for "+plane.getPurpose()+".\n\n");



        plane =factory2.orderPlane("100");
        System.out.println("Ordered a "+plane.getName()+" for "+plane.getPurpose()+".\n");
        plane =factory2.orderPlane("200");
        System.out.println("Ordered a "+plane.getName()+" for "+plane.getPurpose()+".\n");
        plane=factory2.orderPlane("300");
        System.out.println("Ordered a "+plane.getName()+" for "+plane.getPurpose()+".\n\n");


        plane =factory3.orderPlane("100");
        System.out.println("Ordered a "+plane.getName()+" for "+plane.getPurpose()+".\n");
        plane =factory3.orderPlane("200");
        System.out.println("Ordered a "+plane.getName()+" for "+plane.getPurpose()+".\n");
        plane=factory3.orderPlane("300");
        System.out.println("Ordered a "+plane.getName()+" for "+plane.getPurpose()+".\n");
    }
}
