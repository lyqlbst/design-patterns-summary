package pers.design.strategy;

import java.util.List;

/**
 * @author yuqiang lin
 * @description 根据电影分类选出电影
 * @email 1098387108@qq.com
 * @date 2018/12/7 7:06 PM
 */
public interface MovieSelector {
    /**
     * 定义拥有的电影名
     *
     * @return 电影名
     */
    List<String> getMovies();

    /**
     * 定义电影分类
     *
     * @return 电影的分类
     */
    MovieGenresEnum getGenres();
}
