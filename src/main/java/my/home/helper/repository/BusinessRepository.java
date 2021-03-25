package my.home.helper.repository;

import my.home.helper.model.Business;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class BusinessRepository implements CommonRepository<Business> {

    private Map<String, Business> businessMap = new HashMap<>();

    @Override
    public Business save(Business domain) {
        Business result = businessMap.get(domain.getId());
        if (result != null) {
            result.setModified(LocalDateTime.now());
            result.setDescription(domain.getDescription());
            result.setCompleted(domain.isCompleted());
            domain = result;
        }
        businessMap.put(domain.getId(), domain);
        return businessMap.get(domain.getId());
    }

    @Override
    public Iterable<Business> save(Collection<Business> domains) {
        domains.forEach(this::save);
        return findAll();
    }

    @Override
    public void delete(Business domain) {
        businessMap.remove(domain.getId());
    }

    @Override
    public Business findById(String id) {
        return businessMap.get(id);
    }

    @Override
    public Iterable<Business> findAll() {
        return businessMap.entrySet().stream().sorted(entryComparator)
                .map(Map.Entry::getValue).collect(Collectors.toList());
    }

    private Comparator<Map.Entry<String, Business>> entryComparator =
            Comparator.comparing((Map.Entry<String, Business> o) -> o.getValue().getCreated());

}
