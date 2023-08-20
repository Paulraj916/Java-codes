import java.util.*;

class java2Darraylist {
    public static void main(String[] args) {
        //2D ArrayList = a dynamic list of lists
        //You can change the size of these lists durings runtime

        ArrayList<ArrayList<String>> familylist =new ArrayList();
        ArrayList<String> bakiyarajlist = new ArrayList();
        bakiyarajlist.add("bakiyaraj");
        bakiyarajlist.add("stellamary");
        bakiyarajlist.add("Paul Raj");
        bakiyarajlist.add("Danial Raj");
        ArrayList<String> shagayarajlist = new ArrayList();
        shagayarajlist.add("shagayaraj");
        shagayarajlist.add("selvi");
        shagayarajlist.add("shopanamary");
        shagayarajlist.add("stellamary");
        ArrayList<String> arokiyarajlist = new ArrayList();
        arokiyarajlist.add("arokiyaraj");
        arokiyarajlist.add("seela");
        arokiyarajlist.add("jose");
        arokiyarajlist.add("antony");

        familylist.add(bakiyarajlist);
        familylist.add(shagayarajlist);
        familylist.add(arokiyarajlist);

        System.out.println(familylist.get(0));
    }
}
