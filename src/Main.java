
public class Main {
    public static void Tach(String a) {
        int m=0;
        int n=0;
        for (int i = 0; i < a.length(); i++) {
            if (a.indexOf(",") > -1 ||a.indexOf(".") > -1 ) {
                a = a.replace(",", "");
                a = a.replace(".", "");
            }
        }
        String[] list = a.split(" ");
        int max = 0;
        int vt = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].length() > max) {
                max = list[i].length();
                vt = i;
            }
        }
        System.out.println(list[vt]);
    }
    public static void main(String[] args) {
        String g = "Tôi ,là   ai ,fsdf ,. .,,fgrty  ,.,,..ghiyts";
        Tach(g);
    }
    // Test nhanh Main
}
