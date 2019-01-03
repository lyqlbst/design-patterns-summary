package pers.design.strategy.selector;

import com.google.common.collect.Lists;
import pers.design.strategy.MovieGenresEnum;
import pers.design.strategy.MovieSelector;

import java.util.List;

/**
 * @author yuqiang lin
 * @description 喜剧电影
 * @email 1098387108@qq.com
 * @date 2019/1/3 5:55 PM
 */
public class ComedyMovieSelectorImpl implements MovieSelector {
    @Override
    public List<String> getMovies() {
        return Lists.newArrayList("变相怪杰", "三傻大闹宝莱坞", "功夫");
    }

    @Override
    public MovieGenresEnum getGenres() {
        return MovieGenresEnum.COMEDY;
    }
}
