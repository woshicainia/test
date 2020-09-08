package day08.demo07;

/**
 * Created by wangxiaowei on 2020/9/8.
 */
public class Hero {
    private String name;
    private Skill skill;

    public Hero() {
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public void attack(Skill skill){
        System.out.println("姓名是：" + name + "开始释放技能");
        skill.use();
        System.out.println("释放技能结束");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
