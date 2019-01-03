package pers.design.strategy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author yuqiang lin
 * @description 测试类
 * @email 1098387108@qq.com
 * @date 2019/1/3 6:46 PM
 */
public class StrategyTest {
    @Test
    public void testGetMovieSelector() {
        MovieSelectorFactory movieSelectorFactory = MovieSelectorFactory.getInstance();
        MovieSelector romanceMovieSelector = movieSelectorFactory.getMovieSelector("爱情");
        assertEquals("爱情", romanceMovieSelector.getGenres().getName());
        assertTrue(romanceMovieSelector.getMovies().size() > 0);
    }

    @Test(expected = MovieGenresNotExistException.class)
    public void testNoSuchGenres() {
        MovieSelectorFactory movieSelectorFactory = MovieSelectorFactory.getInstance();
        movieSelectorFactory.getMovieSelector("科幻");
    }
}
