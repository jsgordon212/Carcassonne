package code;

import java.util.ArrayList;
import java.util.Collections;

import features.City;
import features.Field;
import features.Road;

public class Inventory {
	/**
	 * An instance variable holding all the Tiles of the game
	 */
	private ArrayList<Tile> _tiles;
	
	/**
	 * Creates all the Tiles needed for the game except the start Tile. 
	 * Then shuffles all the Tiles and adds the start Tile at index 0. 
	 */
	public Inventory(){
		_tiles = new ArrayList<Tile>();
		for(int i = 0; i<5; i++){
			Field f = new Field();
			City c = new City();
			Edge bottom = new Edge(f, f, f);
			Edge left = new Edge(f, f, f);
			Edge top = new Edge(c, c, c);
			Edge right = new Edge(f, f, f);
			Tile t = new Tile(bottom, left, top ,right);
			t.setImage("Images/1.png");
			_tiles.add(t);
		}
		for(int i = 0; i<2; i++){
			Field f = new Field();
			City c = new City();
			City c1 = new City();
			Edge bottom = new Edge(f, f, f);
			Edge left = new Edge(f, f, f);
			Edge top = new Edge(c, c, c);
			Edge right = new Edge(c1, c1, c1);
			Tile t = new Tile(bottom, left, top ,right);
			t.setImage("Images/2.png");
			_tiles.add(t);
		}
		for(int i = 0; i<3; i++){
			Field f = new Field();
			City c = new City();
			City c1 = new City();
			Edge bottom = new Edge(c, c, c);
			Edge left = new Edge(f, f, f);
			Edge top = new Edge(c1, c1, c1);
			Edge right = new Edge(f, f, f);
			Tile t = new Tile(bottom, left, top ,right);
			t.setImage("Images/3.png");
			_tiles.add(t);
		}
		for(int i = 0; i<3; i++){
			Field f = new Field();
			City c = new City();
			Edge bottom = new Edge(f, f, f);
			Edge left = new Edge(f, f, f);
			Edge top = new Edge(c, c, c);
			Edge right = new Edge(c, c, c);
			Tile t = new Tile(bottom, left, top ,right);
			t.setImage("Images/4.png");
			_tiles.add(t);
		}
		for(int i = 0; i<2; i++){
			Field f = new Field();
			City c = new City();
			c.setShield(true);
			Edge bottom = new Edge(f, f, f);
			Edge left = new Edge(f, f, f);
			Edge top = new Edge(c, c, c);
			Edge right = new Edge(c, c, c);
			Tile t = new Tile(bottom, left, top ,right);
			t.setImage("Images/5.png");
			_tiles.add(t);
		}
		for(int i = 0; i<1; i++){
			Field f = new Field();
			City c = new City();
			Edge bottom = new Edge(f, f, f);
			Edge left = new Edge(c, c, c);
			Edge top = new Edge(f, f, f);
			Edge right = new Edge(c, c, c);
			Tile t = new Tile(bottom, left, top ,right);
			t.setImage("Images/6.png");
			_tiles.add(t);
		}
		for(int i = 0; i<2; i++){
			Field f = new Field();
			City c = new City();
			c.setShield(true);
			Edge bottom = new Edge(f, f, f);
			Edge left = new Edge(c, c, c);
			Edge top = new Edge(f, f, f);
			Edge right = new Edge(c, c, c);
			Tile t = new Tile(bottom, left, top ,right);
			t.setImage("Images/7.png");
			_tiles.add(t);
		}
		for(int i = 0; i<1; i++){
			City c = new City();
			Edge bottom = new Edge(c, c, c);
			Edge left = new Edge(c, c, c);
			Edge top = new Edge(c, c, c);
			Edge right = new Edge(c, c, c);
			Tile t = new Tile(bottom, left, top ,right);
			t.setImage("Images/8.png");
			_tiles.add(t);
		}
		for(int i = 0; i<3; i++){
			Field f = new Field();
			City c = new City();
			Edge bottom = new Edge(f, f, f);
			Edge left = new Edge(c, c, c);
			Edge top = new Edge(c, c, c);
			Edge right = new Edge(c, c, c);
			Tile t = new Tile(bottom, left, top ,right);
			t.setImage("Images/9.png");
			_tiles.add(t);
		}
		for(int i = 0; i<1; i++){
			Field f = new Field();
			City c = new City();
			c.setShield(true);
			Edge bottom = new Edge(f, f, f);
			Edge left = new Edge(c, c, c);
			Edge top = new Edge(c, c, c);
			Edge right = new Edge(c, c, c);
			Tile t = new Tile(bottom, left, top ,right);
			t.setImage("Images/10.png");
			_tiles.add(t);
		}
		//not creating the start tile yet
		for(int i = 0; i<3; i++){
			Field f = new Field();
			Field f1 = new Field();
			Road r = new Road();
			City c = new City();
			Edge bottom = new Edge(f, f, f);
			Edge left = new Edge(f1, r, f);
			Edge top = new Edge(c, c, c);
			Edge right = new Edge(f, r, f1);
			Tile t = new Tile(bottom, left, top ,right);
			t.setImage("Images/11.png");
			_tiles.add(t);
		}
		for(int i = 0; i<3; i++){
			Field f = new Field();
			Field f1 = new Field();
			Road r = new Road();
			City c = new City();
			Edge bottom = new Edge(f, r, f1);
			Edge left = new Edge(f1, r, f);
			Edge top = new Edge(c, c, c);
			Edge right = new Edge(f1, f1, f1);
			Tile t = new Tile(bottom, left, top ,right);
			t.setImage("Images/12.png");
			_tiles.add(t);
		}
		for(int i = 0; i<3; i++){
			Field f = new Field();
			Field f1 = new Field();
			Road r = new Road();
			City c = new City();
			Edge bottom = new Edge(f, r, f1);
			Edge left = new Edge(f, f, f);
			Edge top = new Edge(c, c, c);
			Edge right = new Edge(f1, r, f);
			Tile t = new Tile(bottom, left, top ,right);
			t.setImage("Images/13.png");
			_tiles.add(t);
		}
		for(int i = 0; i<3; i++){
			Field f = new Field();
			Field f1 = new Field();
			Road r = new Road();
			City c = new City();
			Edge bottom = new Edge(f, r, f1);
			Edge left = new Edge(f1, r, f);
			Edge top = new Edge(c, c, c);
			Edge right = new Edge(c, c, c);
			Tile t = new Tile(bottom, left, top ,right);
			t.setImage("Images/14.png");
			_tiles.add(t);
		}
		for(int i = 0; i<2; i++){
			Field f = new Field();
			Field f1 = new Field();
			Road r = new Road();
			City c = new City();
			c.setShield(true);
			Edge bottom = new Edge(f, r, f1);
			Edge left = new Edge(f1, r, f);
			Edge top = new Edge(c, c, c);
			Edge right = new Edge(c, c, c);
			Tile t = new Tile(bottom, left, top ,right);
			t.setImage("Images/15.png");
			_tiles.add(t);
		}
		for(int i = 0; i<1; i++){
			Field f = new Field();
			Field f1 = new Field();
			Road r = new Road();
			City c = new City();
			Edge bottom = new Edge(f, r, f1);
			Edge left = new Edge(f1, r, f);
			Edge top = new Edge(c, c, c);
			Edge right = new Edge(c, c, c);
			Tile t = new Tile(bottom, left, top ,right);
			t.setImage("Images/16.png");
			_tiles.add(t);
		}
		for(int i = 0; i<2; i++){
			Field f = new Field();
			Field f1 = new Field();
			Road r = new Road();
			City c = new City();
			c.setShield(true);
			Edge bottom = new Edge(f, r, f1);
			Edge left = new Edge(c, c, c);
			Edge top = new Edge(c, c, c);
			Edge right = new Edge(c, c, c);
			Tile t = new Tile(bottom, left, top ,right);
			t.setImage("Images/17.png");
			_tiles.add(t);
		}
		for(int i = 0; i<3; i++){
			Field f = new Field();
			Field f1 = new Field();
			Field f2 = new Field();
			Road r = new Road();
			City c = new City();
			Edge bottom = new Edge(f, r, f1);
			Edge left = new Edge(f2, r, f);
			Edge top = new Edge(c, c, c);
			Edge right = new Edge(f1, r, f2);
			Tile t = new Tile(bottom, left, top ,right);
			t.setImage("Images/18.png");
			_tiles.add(t);
		}
		for(int i = 0; i<4; i++){
			Field f = new Field();
			Edge bottom = new Edge(f, f, f);
			Edge left = new Edge(f, f, f);
			Edge top = new Edge(f, f, f);
			Edge right = new Edge(f, f, f);
			Tile t = new Tile(bottom, left, top ,right);
			t.setMiddle(true);
			t.setImage("Images/19.png");
			_tiles.add(t);
		}
		for(int i = 0; i<2; i++){
			Field f = new Field();
			Road r = new Road();
			Edge bottom = new Edge(f, r, f);
			Edge left = new Edge(f, f, f);
			Edge top = new Edge(f, f, f);
			Edge right = new Edge(f, f, f);
			Tile t = new Tile(bottom, left, top ,right);
			t.setMiddle(true);
			t.setImage("Images/20.png");
			_tiles.add(t);
		}
		for(int i = 0; i<8; i++){
			Field f = new Field();
			Field f1 = new Field();
			Road r = new Road();
			Edge bottom = new Edge(f, f, f);
			Edge left = new Edge(f1, r, f);
			Edge top = new Edge(f1, f1, f1);
			Edge right = new Edge(f, r, f1);
			Tile t = new Tile(bottom, left, top ,right);
			t.setImage("Images/21.png");
			_tiles.add(t);
		}
		for(int i = 0; i<9; i++){
			Field f = new Field();
			Field f1 = new Field();
			Road r = new Road();
			Edge bottom = new Edge(f, r, f1);
			Edge left = new Edge(f1, r, f);
			Edge top = new Edge(f1, f1, f1);
			Edge right = new Edge(f1, f1, f1);
			Tile t = new Tile(bottom, left, top ,right);
			t.setImage("Images/22.png");
			_tiles.add(t);
		}
		for(int i = 0; i<4; i++){
			Field f = new Field();
			Field f1 = new Field();
			Field f2 = new Field();
			Road r = new Road();
			Edge bottom = new Edge(f, r, f1);
			Edge left = new Edge(f2, r, f);
			Edge top = new Edge(f2, f2, f2);
			Edge right = new Edge(f1, r, f2);
			Tile t = new Tile(bottom, left, top ,right);
			t.setImage("Images/23.png");
			_tiles.add(t);
		}
		for(int i = 0; i<1; i++){
			Field f = new Field();
			Field f1 = new Field();
			Field f2 = new Field();
			Field f3 = new Field();
			Road r = new Road();
			Edge bottom = new Edge(f, r, f1);
			Edge left = new Edge(f2, r, f);
			Edge top = new Edge(f3, r, f2);
			Edge right = new Edge(f1, r, f3);
			Tile t = new Tile(bottom, left, top ,right);
			t.setImage("Images/24.png");
			_tiles.add(t);
		}
		Collections.shuffle(_tiles);
		//Adding the start tile at index 0 now.
		Field f = new Field();
		Field f1 = new Field();
		Road r = new Road();
		City c = new City();
		Edge bottom = new Edge(f, f, f);
		Edge left = new Edge(f1, r, f);
		Edge top = new Edge(c, c, c);
		Edge right = new Edge(f, r, f1);
		Tile t = new Tile(bottom, left, top ,right);
		t.setImage("Images/11.png");
		_tiles.add(0, t);
	}
	
	/**
	 * Returns a random tile from the Inventory. Note: also removes it from the Inventory
	 * @return a Tile 
	 */
	public Tile getRandomTile(){
		return _tiles.remove(0);
	}
	
	/**
	 * Returns the size of the Inventory. Useful for end game logic.
	 * @return an int representing the size of the Inventory
	 */
	public int getSize(){
		return _tiles.size();
	}
}