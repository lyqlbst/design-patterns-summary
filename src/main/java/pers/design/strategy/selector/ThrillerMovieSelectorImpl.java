package pers.design.strategy.selector;

import com.google.common.collect.Lists;
import pers.design.strategy.MovieGenresEnum;
import pers.design.strategy.MovieSelector;

import java.util.List;

/**
 * @author yuqiang lin
 * @description 惊悚电影
 * @email 1098387108@qq.com
 * @date 2019/1/3 5:55 PM
 */
public class ThrillerMovieSelectorImpl implements MovieSelector {
    @Override
    public List<String> getMovies() {
        return Lists.newArrayList("我是传奇", "生化危机", "七宗罪");
    }

    @Override
    public MovieGenresEnum getGenres() {
        return MovieGenresEnum.THRILLER;
    }
}
