package pers.design.strategy;

/**
 * @author yuqiang lin
 * @description 电影种类（"爱情"、"动作"、...）
 * @email 1098387108@qq.com
 * @date 2018/12/7 7:02 PM
 */
public enum MovieGenresEnum {
    ROMANCE("爱情"),
    ACTION("动作"),
    COMEDY("喜剧"),
    THRILLER("惊悚"),
    CARTOON("动画");

    MovieGenresEnum(String name) {
        this.name = name;
    }

    /**
     * 种类名称
     */
    private String name;

    public String getName() {
        return name;
    }
}
