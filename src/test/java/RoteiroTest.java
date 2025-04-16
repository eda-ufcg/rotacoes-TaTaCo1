import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RoteiroTest {
    	
    @Test
    public void testIsAVL() {
    	BST bst = new BST();
    	assertTrue(bst.isAVL());
    	int[] values = new int[]{41,20,11,29,
    		32,65,50,91,72,99};
    	for (int i : values)
    		bst.add(i);
    	assertTrue(bst.isAVL());

    	bst = new BST();
    	bst.add(1);
    	assertTrue(bst.isAVL());
    	bst.add(2);
    	assertTrue(bst.isAVL());
    	bst.add(3);
    	assertFalse(bst.isAVL());

		bst = new BST();
    	bst.add(1);
    	assertTrue(bst.isAVL());
    	bst.add(3);
    	assertTrue(bst.isAVL());
    	bst.add(2);
    	assertFalse(bst.isAVL());    	

    	bst = new BST();
    	bst.add(10);
    	assertTrue(bst.isAVL());
    	bst.add(5);
    	assertTrue(bst.isAVL());
    	bst.add(1);
    	assertFalse(bst.isAVL());

    	bst = new BST();
    	bst.add(10);
    	assertTrue(bst.isAVL());
    	bst.add(5);
    	assertTrue(bst.isAVL());
    	bst.add(6);
    	assertFalse(bst.isAVL());

        bst = new BST();
    	values = new int[]{90,13,4,8,37,16,24,44,
    		42,88,51,72,81,84,92};
    	for (int i : values)
    		bst.add(i);
		assertFalse(bst.isAVL());

        bst = new BST();
		values = new int[]{23, 12, 40, 9, 25, 60, 50};
    	for (int i : values)
    		bst.add(i);
		assertTrue(bst.isAVL());
    }

	@Test
	public void testInsertIsAVL() {
		BST bst = new BST();

		// test rotate left
		assertTrue(bst.isAVL());
		bst.insertAvl(3);
		bst.insertAvl(2);
		bst.insertAvl(1);
		assertTrue(bst.isAVL());


		BST bst1 = new BST();
		// test rotate left
		assertTrue(bst.isAVL());
		bst1.insertAvl(1);
		bst1.insertAvl(2);
		bst1.insertAvl(3);
		assertTrue(bst1.isAVL());


		BST bst2 = new BST();
		// test rotate left
		assertTrue(bst2.isAVL());
		bst2.insertAvl(5);
		bst2.insertAvl(3);
		bst2.insertAvl(4);
		assertTrue(bst2.isAVL());

		BST bst3 = new BST();
		// test rotate left
		assertTrue(bst3.isAVL());
		bst3.insertAvl(3);
		bst3.insertAvl(6);
		bst3.insertAvl(4);
		assertTrue(bst3.isAVL());

	}

}


