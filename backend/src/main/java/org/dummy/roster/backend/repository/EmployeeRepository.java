package org.dummy.roster.backend.repository;

import org.dummy.roster.backend.entity.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * {@link Repository} {@link Employee}.
 */
@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {
}
