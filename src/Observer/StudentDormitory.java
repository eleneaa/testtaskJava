package Observer;

import java.util.ArrayList;
import java.util.List;

public class StudentDormitory implements Dormitory{

    private List<Tenant> tenants;
    private String newsDormitory;

    public StudentDormitory() {
        tenants = new ArrayList<>();
    }

    public void setNewsChurch(String news) {
        this.newsDormitory = news;
        notifyTenants();
    }

    @Override
    public void checkInTenant(Tenant tenant) {
        tenants.add(tenant);
    }

    @Override
    public void evictTheTenant(Tenant tenant) {
        tenants.remove(tenant);
    }

    @Override
    public void notifyTenants() {
        for (Tenant tenant : tenants)
            tenant.update(newsDormitory);
    }
}
