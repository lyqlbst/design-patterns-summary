package pers.design.strategy;

import com.google.common.collect.Maps;
import org.reflections.Reflections;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

/**
 * @author yuqiang lin
 * @description 选择电影的工厂
 * @email 1098387108@qq.com
 * @date 2018/12/7 7:10 PM
 */
public class MovieSelectorFactory {
    /**
     * 单例
     */
    private static final MovieSelectorFactory INSTANCE = new MovieSelectorFactory();
    /**
     * 选择器集合
     * key: MovieGenresEnum.name;
     * value: 实例化的MovieSelector实现类（实例化一次）
     */
    private static final Map<String, MovieSelector> MOVIE_SELECTORS;

    private MovieSelectorFactory() {
    }

    static {
        // 获取MovieSelectorFactory所在的包名packageName
        String packageName = MovieSelectorFactory.class.getPackage().getName();
        Reflections reflections = new Reflections(packageName);
        // 通过反射获取在packageName包下的，所有实现了MovieSelector接口的类
        Set<Class<? extends MovieSelector>> movieSelectorClasses = reflections.getSubTypesOf(MovieSelector.class);
        // 初始化MOVIE_SELECTORS
        MOVIE_SELECTORS = Maps.newHashMapWithExpectedSize(movieSelectorClasses.size());
        for (Class<? extends MovieSelector> movieSelectorClass : movieSelectorClasses) {
            try {
                // 通过反射实例化类
                MovieSelector movieSelector = movieSelectorClass.newInstance();
                // 获取定义好的电影分类
                MovieGenresEnum genresEnum = movieSelector.getGenres();
                // 存入选择器集合
                MOVIE_SELECTORS.put(genresEnum.getName(), movieSelector);
            } catch (InstantiationException | IllegalAccessException e) {
                // log the error...
            }
        }
    }

    /**
     * 单例
     *
     * @return movieSelector工厂
     */
    public static MovieSelectorFactory getInstance() {
        return INSTANCE;
    }

    /**
     * 根据电影分类，获取该分类的电影选择器
     *
     * @param genres 电话的分类（动画、爱情、惊悚等等）
     * @return 获取电影选择器
     */
    public MovieSelector getMovieSelector(String genres) {
        return Optional.ofNullable(MOVIE_SELECTORS.get(genres))
                .orElseThrow(() -> new MovieGenresNotExistException("目前该电影分类不存在"));
    }
}
