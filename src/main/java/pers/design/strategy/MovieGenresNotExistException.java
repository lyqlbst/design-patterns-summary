package pers.design.strategy;

/**
 * @author yuqiang lin
 * @description 电影分类不存在
 * @email 1098387108@qq.com
 * @date 2019/1/3 6:17 PM
 */
public final class MovieGenresNotExistException extends RuntimeException {
    public MovieGenresNotExistException(String message) {
        super(message);
    }
}
