/*
 * Test06_interface 
 * Ex) class와 interface들 간의 상속
 */
package o302;

class Unit{
	int currentHP;
	int x, y;
}//class end

interface Movable{
	void move(int x, int y);
}//interface end
interface Attackabel{
	void attack(Unit u);
}//interface end

// 1) interface 들간의 상속은 다중상속이 가능
interface Fightable extends Movable, Attackabel{}//interface end

// 2) class 들간의 상속은 단일상속만 가능
class Fight extends Unit implements Fightable{
	@Override
	public void attack(Unit u) {}
	@Override
	public void move(int x, int y) {}
}//class end

// 3) interface의 다중 구현
class Tetris extends Unit implements Movable, Attackabel{
	@Override
	public void attack(Unit u) {}
	@Override
	public void move(int x, int y) {}
}
public class Test06_interfaceEx {}