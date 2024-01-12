
public class Names {

    String[] names = {"anderson", "gabrielle", "sarah", "gabriel", "helena", "felipe", "josé", "rosa", "linda", "beatriz"};
    int position = 0;

    public String nextName() {

        String name = names[position].substring(0,1).toUpperCase().concat(names[position].substring(1));
        position++;
        return name;

    }

    public static void main(String[] args) {

        Names names = new Names();

        System.out.println(names.nextName());
        System.out.println(names.nextName());
        System.out.println(names.nextName());
        System.out.println(names.nextName());
        System.out.println(names.nextName());
        System.out.println(names.nextName());
        System.out.println(names.nextName());
        System.out.println(names.nextName());
        System.out.println(names.nextName());
        System.out.println(names.nextName());
    }
}
