package pers.design.strategy.selector;

import com.google.common.collect.Lists;
import pers.design.strategy.MovieGenresEnum;
import pers.design.strategy.MovieSelector;

import java.util.List;

/**
 * @author yuqiang lin
 * @description 爱情电影
 * @email 1098387108@qq.com
 * @date 2019/1/3 5:16 PM
 */
public class RomanceMovieSelectorImpl implements MovieSelector {
    @Override
    public List<String> getMovies() {
        return Lists.newArrayList("罗马假日", "泰坦尼克号", "人鬼情未了");
    }

    @Override
    public MovieGenresEnum getGenres() {
        return MovieGenresEnum.ROMANCE;
    }
}
