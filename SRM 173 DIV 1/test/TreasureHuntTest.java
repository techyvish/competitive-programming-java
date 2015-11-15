import org.junit.Test;
import static org.junit.Assert.*;

public class TreasureHuntTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] island = new String[] {"..OOOO..",
 ".OOOO...",
 "OOXOOOOO",
 "OOOOOOO.",
 ".OOOO...",
 "..OOO..."};
		String[] instructions = new String[] {"W 3","S 1","E 2"};
		assertArrayEquals(new int[] { 3,  2 }, new TreasureHunt().findTreasure(island, instructions));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] island = new String[] {".......",
 ".OOOOO.",
 ".OOOOO.",
 ".OOXOO.",
 ".OOOOO.",
 ".OOOOO.",
 "......."};
		String[] instructions = new String[] {"N 1"};
		assertArrayEquals(new int[] { 3,  4 }, new TreasureHunt().findTreasure(island, instructions));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] island = new String[] {"OOOOOOOOOOO.",
 "OX..........",
 "OOOOOOOOOOO."};
		String[] instructions = new String[] {"W 2"};
		assertArrayEquals(new int[] { 1,  0 }, new TreasureHunt().findTreasure(island, instructions));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] island = new String[] {"....OO.",
 "..OOXOO",
 "OOOO...",
 ".OOOOOO",
 "...OOOO",
 ".OOOOO.",
 "..OOO.."};
		String[] instructions = new String[] {"N 1","E 1","N 4"};
		assertArrayEquals(new int[] { 3,  1 }, new TreasureHunt().findTreasure(island, instructions));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String[] island = new String[] {"X"};
		String[] instructions = new String[] {"N 1","E 1","S 1","W 1"};
		assertArrayEquals(new int[] { }, new TreasureHunt().findTreasure(island, instructions));
	}
	
	@Test(timeout=2000)
	public void test5() {
		String[] island = new String[] {".................O..",
 "..OO.......OOOOO.O..",
 "..OOO..OOO.OOOOOOOO.",
 "..OOOOOOOOOOOOOOOOO.",
 "..OOOOOOOOOOOOOOOOO.",
 "...OOOOOOOOOOOOOOOO.",
 "OO.OOOOOOOXOOOOOO...",
 ".OOOOOOO..OOOOOOOO..",
 "OOOOOOOOO..OOOOOOOO.",
 "OOOOOOOOO..OOOOOOO..",
 ".OOOOOOOOO..........",
 "OOOOOOOOOOOOOOOOOO..",
 "..OOOOOOOOOOOOOOO...",
 "OOOOOOOOOOOOOOOOO...",
 ".OOOOOOOOOOOOOOOOOOO",
 "OOOOOOOOOOOOOOOOOO..",
 "..OOOOOOOOOOOOOOOOO.",
 "OOOOO.OOOOOO..OOO...",
 "O..OO.OOOO.....OOO..",
 "O......O.OO......OO."};
		String[] instructions = new String[] {"N 2","E 3","N 4","E 2","S 1","W 2","E 9","E 2",
 "N 3","W 5","N 1","W 6","N 6","S 1","S 1","E 7"};
		assertArrayEquals(new int[] { 10,  6 }, new TreasureHunt().findTreasure(island, instructions));
	}
}
