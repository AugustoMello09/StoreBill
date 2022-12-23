package com.io.github.AugustoMello09.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.io.github.AugustoMello09.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
