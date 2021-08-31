package com.alkemy.Jp.repositories;

import com.alkemy.Jp.entities.Rol;
import com.alkemy.Jp.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long> {

    Optional<Role>findByName(Rol rol);



}
