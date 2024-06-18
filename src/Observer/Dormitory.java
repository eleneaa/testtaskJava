package Observer;

public interface Dormitory {
    void checkInTenant(Tenant tenant);
    void evictTheTenant(Tenant tenant);
    void notifyTenants();
}
