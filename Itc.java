package com.techouts.day8;

public class Itc {
	
		int amount = 10000;

		synchronized void draw(int amount) {
			System.out.println("going to withdraw...");

			if (this.amount < amount) {
				System.out.println("Less balance; waiting for deposit...");
				try {
					wait();
				} catch (Exception e) {
				}
			}
			this.amount -= amount;
			System.out.println("withdraw completed...");
		}

		synchronized void add(int amount) {
			System.out.println("going to deposit...");
			this.amount += amount;
			System.out.println("deposit completed... ");
			notify();
		}
	}

	

