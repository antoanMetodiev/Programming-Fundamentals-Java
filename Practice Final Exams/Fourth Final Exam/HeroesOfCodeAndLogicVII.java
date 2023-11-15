import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Hero> heroes = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {

            String[] inputData = scanner.nextLine().split(" ");
            String hero = inputData[0];
            int hp = Integer.parseInt(inputData[1]);
            int mp = Integer.parseInt(inputData[2]);
            Hero heroData = new Hero(hp, mp);
            heroes.put(hero, heroData);
        }


        String line = scanner.nextLine();
        while (!line.equals("End")) {

            String[] data = line.split("\\s+-\\s+");
            String command = data[0];
            String heroName = data[1];  // Key

            switch (command) {
                case "CastSpell":
                    int neededMP = Integer.parseInt(data[2]);
                    String spell = data[3];

                    int currentMP = heroes.get(heroName).getMp();
                    if (currentMP >= neededMP) {
                        heroes.get(heroName).setMp(currentMP - neededMP);
                        System.out.printf("%s has successfully cast %s and now has %d MP!\n",
                                heroName, spell, heroes.get(heroName).getMp());
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!\n", heroName, spell);
                    }

                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(data[2]);
                    String attacker = data[3];

                    int currentHP = heroes.get(heroName).getHp();
                    heroes.get(heroName).setHp(currentHP - damage);

                    if (heroes.get(heroName).getHp() > 0) {
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n"
                                , heroName, damage, attacker, heroes.get(heroName).getHp());
                    } else {
                        heroes.remove(heroName);
                        System.out.printf("%s has been killed by %s!\n", heroName, attacker);
                    }

                    break;
                case "Recharge":

                    int sum = Integer.parseInt(data[2]);
                    int currentMp = heroes.get(heroName).getMp();

                    int newMp = sum + currentMp;
                    if (newMp > 200) {
                        newMp -= newMp - 200;
                        heroes.get(heroName).setMp(newMp);
                        System.out.printf("%s recharged for %d MP!\n", heroName, newMp - currentMp);
                        line = scanner.nextLine();
                        continue;
                    }
                    heroes.get(heroName).setMp(newMp);
                    System.out.printf("%s recharged for %d MP!\n", heroName, sum);

                    break;
                case "Heal":

                    int healSum = Integer.parseInt(data[2]);
                    int currentHp = heroes.get(heroName).getHp();

                    int newHp = currentHp + healSum;
                    if (newHp > 100) {
                        newHp -= newHp - 100;
                        heroes.get(heroName).setHp(newHp);
                        System.out.printf("%s healed for %d HP!\n", heroName, newHp - currentHp);
                        line = scanner.nextLine();
                        continue;
                    }
                    heroes.get(heroName).setHp(newHp);
                    System.out.printf("%s healed for %d HP!\n", heroName, healSum);
                    break;
            }


            line = scanner.nextLine();
        }
        heroes.forEach((key, value) -> {
            System.out.println(key);
            System.out.printf("HP: %d\n", value.getHp());
            System.out.printf("MP: %d\n", value.getMp());
        });

    }

    static class Hero {
        int hp;
        int mp;

        public Hero(int hp, int mp) {
            this.hp = hp;
            this.mp = mp;
        }

        public int getHp() {
            return hp;
        }

        public int getMp() {
            return mp;
        }

        public void setHp(int hp) {
            this.hp = hp;
        }

        public void setMp(int mp) {
            this.mp = mp;
        }
    }


}
