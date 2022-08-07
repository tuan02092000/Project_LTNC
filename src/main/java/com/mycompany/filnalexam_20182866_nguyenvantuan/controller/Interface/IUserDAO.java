package com.mycompany.filnalexam_20182866_nguyenvantuan.controller.Interface;

import com.mycompany.filnalexam_20182866_nguyenvantuan.model.UserModel;

/**
 *
 * @author Nguyen Van Tuan
 */
public interface IUserDAO {
    UserModel findUser(String userName, String password, int checkBox);
}
