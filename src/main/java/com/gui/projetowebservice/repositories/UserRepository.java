package com.gui.projetowebservice.repositories;

import com.gui.projetowebservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
