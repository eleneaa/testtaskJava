package Observer;

public class Tenant {

    private String name;

        public Tenant(String name, Dormitory dormitory) {
            this.name = name;
            dormitory.checkInTenant(this);
        }

        void update(String newsDormitory) {
            System.out.println(name + " " +
                    "узнал новость: " + newsDormitory);
        }
    }

