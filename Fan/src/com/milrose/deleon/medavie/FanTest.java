package com.milrose.deleon.medavie;

import static com.milrose.deleon.medavie.Direction.BACKWARD;
import static com.milrose.deleon.medavie.Direction.FORWARD;
import static com.milrose.deleon.medavie.Fan.OFF;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FanTest {

	private Fan fan;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		fan = new Fan();
	}

	@Test
	void testSpeedUp() {
		assertEquals(FORWARD, fan.getDirection());
		assertEquals(OFF, fan.getSpeed());

		fan.speedUp();
		assertEquals(1, fan.getSpeed());
		assertEquals(FORWARD, fan.getDirection());
		System.out.println(fan.toString());

		fan.speedUp();
		assertEquals(2, fan.getSpeed());
		assertEquals(FORWARD, fan.getDirection());

		fan.speedUp();
		assertEquals(3, fan.getSpeed());
		assertEquals(FORWARD, fan.getDirection());

		fan.speedUp();
		assertEquals(OFF, fan.getSpeed());
		assertEquals(FORWARD, fan.getDirection());
	}

	@Test
	void testReverseSpeedupDirection() {
		assertEquals(OFF, fan.getSpeed());
		assertEquals(FORWARD, fan.getDirection());

		fan.reverseDirection();
		assertEquals(OFF, fan.getSpeed());
		assertEquals(BACKWARD, fan.getDirection());

		fan.speedUp();
		assertEquals(1, fan.getSpeed());
		assertEquals(BACKWARD, fan.getDirection());

		fan.reverseDirection();
		assertEquals(1, fan.getSpeed());
		assertEquals(FORWARD, fan.getDirection());

		fan.speedUp();
		assertEquals(2, fan.getSpeed());
		assertEquals(FORWARD, fan.getDirection());

		fan.reverseDirection();
		assertEquals(2, fan.getSpeed());
		assertEquals(BACKWARD, fan.getDirection());

		fan.speedUp();
		assertEquals(3, fan.getSpeed());
		assertEquals(BACKWARD, fan.getDirection());

		fan.reverseDirection();
		assertEquals(3, fan.getSpeed());
		assertEquals(FORWARD, fan.getDirection());

		fan.speedUp();
		assertEquals(OFF, fan.getSpeed());
		assertEquals(FORWARD, fan.getDirection());

		fan.reverseDirection();
		assertEquals(OFF, fan.getSpeed());
		assertEquals(BACKWARD, fan.getDirection());

	}

	@Test
	void testReverseDirection() {
		assertEquals(FORWARD, fan.getDirection());
		assertEquals(OFF, fan.getSpeed());

		fan.reverseDirection();
		assertEquals(BACKWARD, fan.getDirection());
		assertEquals(OFF, fan.getSpeed());

		fan.speedUp();
		assertEquals(1, fan.getSpeed());
		assertEquals(BACKWARD, fan.getDirection());

		fan.speedUp();
		assertEquals(2, fan.getSpeed());
		assertEquals(BACKWARD, fan.getDirection());

		fan.speedUp();
		assertEquals(3, fan.getSpeed());
		assertEquals(BACKWARD, fan.getDirection());

		fan.speedUp();
		assertEquals(OFF, fan.getSpeed());
		assertEquals(BACKWARD, fan.getDirection());
	}

}
