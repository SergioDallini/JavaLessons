//package dNine;
//
//import com.sun.source.tree.BinaryTree;
//import jdk.incubator.vector.VectorOperators;
//
//public class TestFigures {
//    protected static double calculateRedPerimetr(Figure[] figures){
//        double per = 0;
//        for (Figure item: figures){
//            if(item.getColor().equals("red")){
//                per+= item.perimetr();
////                System.out.println(item.getColor() +" " + item.toString());
//            }
//        }
//     return per;
//    }
//    public static double calculateRedArea(Figure[] figures){
//        double area = 0;
//        for (Figure item: figures){
//            if(item.getColor().equals("red")){
//                area+= item.area();
//            }
//        }
//        return area;
//    }
//    public static void main(String[] args) {
//        Figure[] figures = {
//                new Triangle("red", 10, 10, 10),
//                new Triangle("green", 10, 20, 30),
//                new Triangle("red", 10, 20, 15),
//                new Rectangle("red", 5,10),
//                new Rectangle("orange", 40,15),
//                new Circle("red", 4),
//                new Circle("red", 10),
//                new Circle("blue", 5)
//        };
//
//        System.out.println("Area = " + calculateRedArea(figures));
//        System.out.println("Perimetr = " + calculateRedPerimetr(figures));
//
//    }
//}
