package hadihariri.intro.interop;

import hadihariri.intro.classes.CustomerJava;

import java.util.List;

public interface CustomerRepository {
    CustomerJava getById(Integer id);
    List<CustomerJava> getAll();
}
