import java.util.Random;

public class Monster {
    private int HP;



    public Monster() {
        this.HP = 25;
    }

    public int HP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void attackPlayer(Player player){
        player.gotAttacked();
    }


    public void gotAttacked(int howBigDamage){
        this.HP -= howBigDamage;
    }

    public boolean isAlive(){
        return this.HP > 0 ? true : false;
    }


}
