package com.example.customerapi.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

interface CustomerJPAEntityRepository extends JpaRepository<CustomerJPAEntity, Long> {
}
