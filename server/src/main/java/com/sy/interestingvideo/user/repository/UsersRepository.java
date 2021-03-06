package com.sy.interestingvideo.user.repository;

import com.sy.interestingvideo.user.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @description:用户repository
 * @className:UsersRepository
 * @author: Clrvn
 * @date: 2019-04-18 18:11
 */
@Repository
public interface UsersRepository extends JpaRepository<UserInfo, Long> {

    /**
     * qq/微信登录,查询有无有此信息
     * @param uniqueCode
     * @return
     */
    public UserInfo findUserInfoByUniqueCode(String uniqueCode);
}
