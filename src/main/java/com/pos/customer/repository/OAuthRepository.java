package com.pos.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pos.customer.entity.OAuth;

@Repository
@Transactional
public interface OAuthRepository extends JpaRepository<OAuth, Long> {

	@Modifying
	@Query("UPDATE OAuth s SET s.password=:password where s.userId=:userId")
	void updateLoginById(@Param("userId") Long userId, @Param("password") String password);

	// @Query("SELECT a FROM OAuth a WHERE a.userId=:userId")
	// List<OAuth> findByUserId(@Param("userId") long userId);
	@Modifying
	@Query("UPDATE OAuth o SET o.profileStatus=:status WHERE o.userId=:userName")
	void activateProfile(@Param("userName") Long phoneNo, @Param("status") String status);

	@Modifying
	@Query("UPDATE OAuth o SET o.profileStatus=:status WHERE o.userId=:userName")
	void deActivateProfile(@Param("userName") Long phoneNo, @Param("status") String status);

}
