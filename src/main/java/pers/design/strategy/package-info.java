/**
 * @description 策略模式 + 简单工厂 + 反射 替代if else的例子
 *
 * 项目中往往会遇到很多条件分支，例如：
 * if (xxx = a) {
 *     do a things...
 * } else if (xxx = b) {
 *     do b things...
 * } else if (xxx = c) {
 *     do c things...
 * } else if (xxx = d) {
 *     do d things...
 * } else if (...) {
 *     ...
 * }
 *
 * 这样做也不是不行，但是看起来真的很low!
 * 而且扩展性极差，增加一个分支条件，就需要改代码，这显然不够优雅。
 * 那么家喻户晓的设计模式到底怎么应用到代码里？
 *
 * 本demo的关键点在于反射，Java特有的反射机制能完美的和策略模式结合，能够称得上优雅。
 * 下面介绍一下每个包或者类的作用：
 *
 * strategy 一一·该包下的类可以实现一个demo，代替if else
 *    |
 *    ·一一一一一·MovieSelector                  电影选择器，实现该接口既可拓展
 *    |
 *    ·一一一一一·selector                       该包下的类即实现了MovieSelector接口，每个类对应一个电影分类
 *    |
 *    ·一一一一一·MovieGenresEnum                电影分类枚举，拓展时增加一个属性既可
 *    |
 *    ·一一一一一·MovieGenresNotExistException   电影分类不存在的异常，继承自RuntimeException
 *    |
 *    ·一一一一一·MovieSelectorFactory           电影选择器的简单工厂，核心类，在static静态方法中通过反射实现
 *
 * 通过这种方式，若想拓展一个分类，只需两步操作：
 * 1.在MovieGenresEnum中增加一个枚举；
 * 2.在selector包下再实现一个类，定义好分类和电影。
 * 其他的代码并没有改动。
 *
 * @author yuqiang lin
 * @email 1098387108@qq.com
 * @date 2019/1/3 6:57 PM
 */
package pers.design.strategy;