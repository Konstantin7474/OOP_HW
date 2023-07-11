//Проанализировать и описать персонажей:
//Маг, монах, разбойник, копейщик, снайпер, арбалетчик, крестьянин.
//На базе описания персонажей описать простейшую иерархию классов.
//В основной программе создать по одному экземпляру каждого класса.


public class OOP_Semanar1 {

    class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    // Класс "Маг" - наследуется от класса "Персонаж"
    class Mage extends Person {
        private int spellPower;

        public Mage(String name, int spellPower) {
            super(name);
            this.spellPower = spellPower;
        }

        public int getSpellPower() {
            return spellPower;
        }
    }

    // Класс "Монах" - наследуется от класса "Персонаж"
    class Monk extends Person {
        private int agility;

        public Monk(String name, int agility) {
            super(name);
            this.agility = agility;
        }

        public int getAgility() {
            return agility;
        }
    }

    // Класс "Разбойник" - наследуется от класса "Персонаж"
    class Rogue extends Person {
        private int stealth;

        public Rogue(String name, int stealth) {
            super(name);
            this.stealth = stealth;
        }

        public int getStealth() {
            return stealth;
        }
    }

    // Класс "Копейщик" - наследуется от класса "Персонаж"
    class Spearman extends Person {
        private int attackPower;

        public Spearman(String name, int attackPower) {
            super(name);
            this.attackPower = attackPower;
        }

        public int getAttackPower() {
            return attackPower;
        }
    }

    // Класс "Снайпер" - наследуется от класса "Персонаж"
    class Sniper extends Person {
        private int accuracy;

        public Sniper(String name, int accuracy) {
            super(name);
            this.accuracy = accuracy;
        }

        public int getAccuracy() {
            return accuracy;
        }
    }

    // Класс "Арбалетчик" - наследуется от класса "Персонаж"
    class Crossbowman extends Person {
        private int range;

        public Crossbowman(String name, int range) {
            super(name);
            this.range = range;
        }

        public int getRange() {
            return range;
        }
    }

    // Класс "Крестьянин" - наследуется от класса "Персонаж"
    class Peasant extends Person {
        private int farmingSkill;

        public Peasant(String name, int farmingSkill) {
            super(name);
            this.farmingSkill = farmingSkill;
        }

        public int getFarmingSkill() {
            return farmingSkill;
        }
    }

    // Основная программа
    public class Main {
        public void main(String[] args) {
            Mage mage = new Mage("Гендальф", 100);
            Monk monk = new Monk("Ли Шао", 80);
            Rogue rogue = new Rogue("Гаррет", 90);
            Spearman spearman = new Spearman("Роланд", 110);
            Sniper sniper = new Sniper("Снежок", 95);
            Crossbowman crossbowman = new Crossbowman("Уильям", 120);
            Peasant peasant = new Peasant("Иван", 60);


        }
    }
}
