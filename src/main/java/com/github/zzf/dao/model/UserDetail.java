package com.github.zzf.dao.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhanfeng.zhang
 * @date 2019/10/18
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDetail {

  private long userId;

  private String homeAddr;
  private String workAddr;

}
