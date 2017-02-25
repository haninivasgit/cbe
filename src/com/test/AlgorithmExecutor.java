package com.test;

public enum AlgorithmExecutor {
	
	

	GTOne {
		boolean match(Integer size) {
			return (size>1) ;
		}

		void execute(String test) {
			System.out.println(this.name());
		}
	},
	EQone {
		boolean match(Integer size) {
			return (size==1) ;
		}

		void execute(String test) {
			System.out.println(this.name());
		}
	},
	DEFAULT {
		boolean match(Integer size) {
			return (size==0) ;
		}

		void execute(String test) {
			System.out.println(this.name());
		}
	};
	
	AlgorithmExecutor() {
		// TODO Auto-generated constructor stub
	}

	public static AlgorithmExecutor getAlgorithmFromCondition(Integer size) {
		for (AlgorithmExecutor c : values()) {
			if (c.match(size)) {
				return c;
			}
		}

		return DEFAULT;
	}

	abstract boolean match(Integer condition);

	abstract void execute(String test);
}