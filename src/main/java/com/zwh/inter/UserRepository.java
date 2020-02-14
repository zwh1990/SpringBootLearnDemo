package com.zwh.inter;

import com.zwh.biz.PictureBean;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

/**
 * @author ：zwh
 * @date ：2020/2/14 16:09
 * @description:
 * @modified By：
 * @version: 1.0
 */
@Service
public interface UserRepository  extends MongoRepository<PictureBean, Long> {

    PictureBean findByPicturename(String picturename);


}
