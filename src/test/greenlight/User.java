package test.greenlight;

import java.time.LocalDate;
import java.util.Objects;

public class User  implements Comparable<User>{
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return id == user.id && customerId == user.customerId && Objects.equals(name, user.name) && Objects.equals(activatedOn, user.activatedOn) && Objects.equals(deactivatedOn, user.deactivatedOn);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, customerId, activatedOn, deactivatedOn);
//    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", customerId=" + customerId +
                ", activatedOn=" + activatedOn +
                ", deactivatedOn=" + deactivatedOn +
                '}';
    }

    @Override
    public int compareTo(User user) {
        return this.id - user.id;
    }

    int id;
    String name;
    int customerId;
    // when this user started
    LocalDate activatedOn;
    // last day to bill for user
    // should bill up to and including this date
    // since user had some access on this date
    LocalDate deactivatedOn;

    public User() {
    }

    public User(int id, String name, int customerId, LocalDate activatedOn, LocalDate deactivatedOn) {
        this.id = id;
        this.name = name;
        this.customerId = customerId;
        this.activatedOn = activatedOn;
        this.deactivatedOn = deactivatedOn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public LocalDate getActivatedOn() {
        return activatedOn;
    }

    public void setActivatedOn(LocalDate activatedOn) {
        this.activatedOn = activatedOn;
    }

    public LocalDate getDeactivatedOn() {
        return deactivatedOn;
    }

    public void setDeactivatedOn(LocalDate deactivatedOn) {
        this.deactivatedOn = deactivatedOn;
    }


}
