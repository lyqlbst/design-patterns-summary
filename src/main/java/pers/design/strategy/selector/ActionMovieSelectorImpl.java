package pers.design.strategy.selector;

import com.google.common.collect.Lists;
import pers.design.strategy.MovieGenresEnum;
import pers.design.strategy.MovieSelector;

import java.util.List;

/**
 * @author yuqiang lin
 * @description 动作电影
 * @email 1098387108@qq.com
 * @date 2019/1/3 5:54 PM
 */
public class ActionMovieSelectorImpl implements MovieSelector {
    @Override
    public List<String> getMovies() {
        return Lists.newArrayList("叶问", "速度与激情", "碟中谍");
    }

    @Override
    public MovieGenresEnum getGenres() {
        return MovieGenresEnum.ACTION;
    }
}
