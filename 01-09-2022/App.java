
/*
3. Implement switch case in the above enum example where a single value of object m is checked
against all the cases of the switch case. Based on the value of m, the particular case should be executed
*/
package com.java;
	enum Month{
		Jan,Feb,March,April,May,June
	}

	public class App
	{
		Month m;
		App(Month m){
			this.m=m;
		}
		
		void disp()
		{		
			switch(m) {
		
		case Jan:
			System.out.println(m);
			break;
		case Feb:
			System.out.println(m);
			break;
		case March:
			System.out.println(m);
			break;
		case April:
			System.out.println(m);
			break;
		case May:
			System.out.println(m);
			break;
		case June:
			System.out.println(m);
			break;
			
			default:
				break;
			
			
		
			
			}
			
	
	}
		
		
		public static void main(String args[])
		{
			
			
		    App a=new App(Month.May);
		    //System.out.println(a);
		    a.disp();
		}
		}

