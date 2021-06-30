package kim.kin.service;

import kim.kin.model.UserInfoDTO;
import kim.kin.repository.UserInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author choky
 */
public interface UserInfoService {
    UserInfo save(UserInfoDTO dto);
    UserInfo save(UserInfo dto);

    UserInfo findByUsername(String username);

    Page<UserInfo> findAll(Pageable pageable);
}
