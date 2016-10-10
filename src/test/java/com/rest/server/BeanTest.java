package com.rest.server;

import java.util.function.Function;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BeanTest {
	
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
	
	public static class RuleEngine {
		public String applyRules(String knowledge) {
			return "yyyy";
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

	public static void main(String[] args) {
		Repository repo = new Repository();
		RuleEngine eng = new RuleEngine();
		
		Processor proc = new Processor(repo, eng);
		System.out.println(proc.process());
		
//		
//		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("rest-app-context.xml");
//		
//		Processor p = ctx.getBean(Processor.class);
//		
//		System.out.println(p.process());
//		
//		ctx.close();
		
//		Function f = p -> {
//			String x =args[0];
//			return p.toString();
//		};
//		Function f2 = new Function<Long, String>() {
//			public String apply(Long t) {return t.toString();};
//		};
//		
//		x(f);
		
	}
	
	
	private static void x(Function<Long, String> converter) {
//		System.out.println(converter.apply(100L));
	}
	
	
}
