package pers.design.strategy.selector;

import com.google.common.collect.Lists;
import pers.design.strategy.MovieGenresEnum;
import pers.design.strategy.MovieSelector;

import java.util.List;

/**
 * @author yuqiang lin
 * @description 动画电影
 * @email 1098387108@qq.com
 * @date 2019/1/3 5:57 PM
 */
public class CartoonMovieSelectorImpl implements MovieSelector {
    @Override
    public List<String> getMovies() {
        return Lists.newArrayList("冰雪奇缘", "狮子王", "千与千寻");
    }

    @Override
    public MovieGenresEnum getGenres() {
        return MovieGenresEnum.CARTOON;
    }
}
