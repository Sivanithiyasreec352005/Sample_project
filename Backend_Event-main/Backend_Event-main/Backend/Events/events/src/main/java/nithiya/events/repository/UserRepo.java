// package srinivasan.nexus.repository;
package nithiya.events.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nithiya.events.model.User;

public interface UserRepo  extends JpaRepository<User,Long>
{
    User findByEmail(String username);
}
