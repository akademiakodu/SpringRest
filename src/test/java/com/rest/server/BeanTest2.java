package com.rest.server;

import com.rest.server.BeanTest.Repository;
import com.rest.server.BeanTest.RuleEngine;

public class BeanTest2 {
	public static class Repository {
		String sql; 
		int param;
		
		
		
		public Repository(String sql, int param) {
			super();
			this.sql = sql;
			this.param = param;
		}



		public Repository() {
			// TODO Auto-generated constructor stub
		}



		public String getKnowledgeBase() {
			return "xxxx";
		}
	}

	public static class Processor {
		private int costam;
		private Repository repository;
		private RuleEngine ruleEngine;
		public Processor(Repository repository, RuleEngine ruleEngine) {
			super();
			this.repository = repository;
			this.ruleEngine = ruleEngine;
		}
		
		public String process() {
			return ruleEngine.applyRules(repository.getKnowledgeBase());
		}
		
		public void setCostam(int costam) {
			this.costam = costam;
		}
	}
	
	public static class RuleEngine {
		public String applyRules(String knowledge) {
			return "yyyy";
		}
	}
	public static void main(String[] args) {
		RuleEngine ruleEngine =new RuleEngine();
		Repository repor= new Repository();
		// TODO Auto-generated method stub
		Processor proce = new Processor(repor, ruleEngine);
		proce.process();
	}

}
