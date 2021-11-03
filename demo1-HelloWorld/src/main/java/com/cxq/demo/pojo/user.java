package com.cxq.demo.pojo;

import lombok.Data;

/**
 * 使用lombok注解，简化代码
 * @Data：自动生成 Getter/Setter、toString、equals、hashCode 方法，以及不带参数的构造方法
 */
@Data
public class user {
    private String name;
    private Integer age;

    //IDEA 实用技能
    /**
     * 一、实现自动转义
     * 1.使用快捷键 Alt + Enter，选注入语言或引用 Inject language or reference
     * 2.搜索 json 并选择（也可以选其他语言），然后使用快捷键 Alt + Enter 自动选定语言
     * 3.再使用快捷键 Alt + Enter，
     *      选 Edit JSON Fragment 开启编辑 JSON语法信息文件 的视图，退出视图使用快捷键 Ctrl + F4
     *      选 Uninject language or reference 取消注入，恢复String输入
     * 测试如下：
     */
    //language=JSON
    String testJson = "{\"member\": [{\n" +
            "  \"name\":" +
            "\"小明\",\"age\": 23\n" +
            "},{\n" +
            "  \"name\":" +
            "  \"pegasus\",\"age\": 24\n" +
            "}]}";
    //language=HTML
    String testHtml = "<p>Hello StringHtml</p>";

    public void test1(String name,Integer age){
        System.out.println(name + age);
    }
    public void test2(){
        /**
         * 二、自动参数提示
         * 使用 鼠标放在方法内 或 快捷键 Ctrl + P
         */
        test1("小巴",23);

        /**
         * 三、智能提示代码（自动代码补全）
         * 1. 使用 Ctrl + Space 可以快速提示可用的方法、变量等
         * 2. 使用 Ctrl + Shift +  Space 可以基于上下文环境智能匹配使用的方法
         */

        /**
         * 四、自定义高复用代码块
         * 1. 使用IDEA的 Live Template 保存高复用代码段，且可以自定义关键字。
         *    在使用时，只需输入关键字然后按 Enter 键，直接输出代码块
         * 2. IDEA默认提供的 Live Template：
         *    main: 可以快速生成 public static void main(String[] args){}
         *    sout: 可以快速生成 System.out.println();
         *    soutm: 可以快速输出当前类和方法名 System.out.println("user.test2");
         *    fori: 可以快速输出 for (int i = 0; i < ; i++) {}
         *    ifn: 可以快速输出 if (可用的属性名 == null) {}
         * 3. 自定义 Live Template
         *    File -> Setting（快捷键） -> Editor -> Live Templates -> +
         *    ① Abbreviation: 代表添加缩写语句，如main
         *    ② Description: 代表描述信息，以便查阅
         *    ③ Template text: 代表要生成的复用代码
         */

        /**
         * 五、设置注释信息
         * 1. IDEA提供 file and code template 模板，可以新建代码时自动添加注释信息
         * 2. 例如：新建 class类时，自动添加作者注释信息
         *    File -> Setting -> Editor -> file and code template -> 右侧窗口单击 includes
         *    -> 选中 File Header -> 右边框中，输入下方作者注释信息模板
         */
        /**
         * Copyright(C),2021-${YEAR},小巴冒险有限公司
         * FileName:${NAME}
         * Author:小巴
         * Date:${DATE}${TIME}
         * Description:${DESCRIPTION}
         * History:
         * <author>  <time>  <version>  <desc>
         * 作者姓名  修改时间    版本号     描述
         */
        /**
         * DATE和TIME分别代表创建文件的日期和时间
         */

        /**
         * 六、超智能的 Alt + Enter 快捷键
         * 它的功能与光标所在位置有关，光标放的位置不同，使用此快捷键弹出的菜单选项也不同，用法如下：
         * 1. 对光标所在的类进行包导入
         * 2. 在接口类中，如果把光标放在已经在接口实现类中实现了的方法上，则此快捷键的效果是跳转
         * 3. 在接口实现类中添加一个方法后，可以让该接口类也自动生成
         * 4. 给Hibernate的 Entity 对象分配数据源，从而产生一系列智能功能
         * 5. 对当前光标所在类生成单元测试类
         * 6. 对当前光标所在类创建子类。常用在对接口生成接口是实现类。
         *    如，选中服务接口名字，按 Alt + Enter 快捷键，在弹出的窗口中选择 implement interface
         *    命令，可以快速创建服务实现类
         * 7. 移除未使用的变量、对象等元素
         * 8. 把自定义的单词加入此库中，可以让拼写单词检查错误的波浪线提示消失
         */

        /**
         * 七、使用全局配置
         * 1. 全局 JDK
         *    File -> Project Structure -> SDKs
         * 2. 全局 Maven
         *    由于IDEA提供的 Maven 版本较老，需要修改
         *    File -> New Projects Settings -> Settings for Nes Projects -> Build Tools -> Maven
         * 3. 全局版本控制 Git
         *    File -> Settings -> Version Control -> Git
         * 4. 自动导包与智能移除
         *    如果没有进行全局设置，在新加入依赖后，IDEA会自动提示是否“自动导入包”。
         *    设置全局自动导入：File -> New Projects Settings -> Settings for Nes Projects
         *    -> Other Settings -> Auto Import
         */

        /**
         * 八、自动生成语句
         * 1. 快速生成 if 语句
         *    在IDEA中，如果要自动生成 “not null” 这种 if 判断，则可以使用IDEA的自动生成语句功能，
         *    在参数输入结束后，接着输入 “.notnull” 并按 Enter 键，IDEA就自动生成 if 语句。
         * 2. Postfix Code 功能
         *    此功能可以在编写代码时，减少向后插入符号的跳转，可以在变量后面直接加上 .for、.sout、.switch等表达式，
         *    IDEA会直接转换成相应的语句。
         * 3. 快速生成 try/catch、if/else 等代码
         *    将光标放在要生成代码的语句处，使用 Ctrl + Alt + T
         * 4. 快速生成构造器、Getter/Setter、Override 等方法
         *    使用 Alt + Insert
         */
        if (name != null) {

        }
        int n = 5;
        for (int i = 0; i < n; i++) {
            
        }
        int m = n / 0;

        /**
         * 九、IDEA的项目结构
         *    在IDEA中，聚合功能和普通的根目录时功能（Project）。它的每一个子模块（Module）都可以使用
         *    独立的 JDK 和 Maven，下面的子工程称为模块（Module），子模块之间可以相互关联，也可以没有关联。
         */

        /**
         * 十、理解上下文
         *    IDEA懂得上下文，它检索整个项目，分析项目所有的内容。在任何时候无论光标放在哪里，IDEA都知道开发人员需要什么。
         *    如，新建一个 class 类，IDEA会把包路径和类名自动添加好，而 Eclipse 新建的文件时空白的。
         */

        /**
         * 十一、IDEA部分快捷键
         *      自动代码补全：Basic模式 -> Ctrl + 空格，智能模式 -> Ctrl + Shift + 空格
         *      自动代码生成：Alt + Insert
         *      删除当前行：Ctrl + Y 或 Ctrl + X
         *      跟进代码和方法：Ctrl + B 或 Ctrl + 鼠标左键
         *      查看继承及重写：Ctrl + Shift + B
         *      代码模板：Ctrl + J
         *      最近编辑文件：Ctrl + E
         *      提示方法参数：Ctrl + P
         *      跳转最近编辑内容：Ctrl + Shift + Backspace 或 Ctrl + Alt + 左箭头
         *      返回最近编辑内容：Ctrl + Alt + 右箭头
         *      切换窗口：Ctrl + Tab 或 Alt + 左/右箭头
         *      查看类、方法说明：Ctrl + Q
         *      覆盖父类方法：Ctrl + O
         *      搜索所有：双击 Shift
         *      搜索类：Ctrl + N
         *      搜索文件：Ctrl + Shift + N
         *      按描述或快捷键搜索快捷键：Ctrl + Shift + A（Help -> Find Action）
         *      方法调用：Ctrl + Alt + H
         *      格式化代码：Ctrl + Alt + L
         *      整理Import：Ctrl + Alt + O
         *      快速修复错误：Alt + Enter
         *      搜索当前窗口文本：Ctrl + F
         *      全局搜索文本：Ctrl + Shift + F
         *      替换当前窗口文本：Ctrl + R
         *      全局替换文本：Ctrl + Shift + R
         *      显示方法信息：在方法名上使用 ctrl +　鼠标左键
         */
    }
}
