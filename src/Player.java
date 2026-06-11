import java.util.Random;

public class Player {
    private int HP;
    private int maxHP;
    private String nickname;

    public Player(String nickname) {
        this.nickname = nickname;
        this.maxHP = 30;
        this.HP = this.maxHP;
    }

    public int maxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int HP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public String nickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void gotAttacked(){
        this.HP -= new Random().nextInt(4) + 2;
    }

    public void heal() {
        this.HP += new Random().nextInt(6) + 4;
        if (this.HP > this.maxHP){
            this.HP = 30;
        }
    }

    public void attack(Monster monster){
        Random r = new Random();
        if (r.nextInt(100) + 1 > 80){
            monster.gotAttacked((r.nextInt(5) + 3) * 2);
        } else {
            monster.gotAttacked(r.nextInt(5) + 3) ;
        }
    }

    public boolean isAlive(){
        return this.HP > 0 ? true : false;
    }
}
