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
public class User {

  private long id;
  private String name;
  private int age;
}
