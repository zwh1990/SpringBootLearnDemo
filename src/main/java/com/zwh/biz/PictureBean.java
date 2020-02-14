package com.zwh.biz;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * @author ：zwh
 * @date ：2020/2/14 16:10
 * @description:
 * @modified By：
 * @version: 1.0
 */
@Document(collection = "user")
public class PictureBean implements Serializable {

    @Id
    private Long id;

    private String pictureName;
    private String pictureBase64;

    public PictureBean(Long id, String pictureName, String pictureBase64) {
        this.id = id;
        this.pictureName = pictureName;
        this.pictureBase64 = pictureBase64;
    }
}
