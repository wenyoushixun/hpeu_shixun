package com.qingshixun.project;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectProcess {

	// 配置方法
	// public void process() {
	// System.out.println("<--横切进来的操作-->");
	// }
	//
	// public void before(JoinPoint joinPoint) {
	// System.out.println(
	// "<--前置通知-->" + joinPoint.getSignature().getDeclaringTypeName() +
	// joinPoint.getSignature().getName());
	// }
	//
	// public void afterReturning(JoinPoint joinPoint, Object value) {
	// System.out.println("<--后置通知-->" + value);
	// }
	//
	// public Object around(ProceedingJoinPoint proceedingJoinPoint) throws
	// Throwable {
	// System.out.println("<--环绕前-->");
	// Object reuslt = proceedingJoinPoint.proceed();
	// System.out.println("<--环绕后-->");
	// return reuslt;
	// }
	//
	// public void throwing(Throwable ex) {
	// System.out.println("<--抛出异常-->" + ex.getMessage());
	// }

	// 注解方法
	//定义一个切入点  
	@Pointcut("execution(* com.qingshixun.project.aop.HelloWorld.*(..))")
	private void cutMethod() {
	}

	@Before("cutMethod()")
	public void process() {
		System.out.println("<--横切进来的操作-->");
	}

	// 后置通知
	@AfterReturning(value = "cutMethod()", returning = "value")
	public void afterReturing(JoinPoint joinPoint, Object value) {
		System.out.println("后置通知:目标方法" + joinPoint.getSignature().getName() + "的返回值是" + value);
	}

	// 环绕通知
	@Around("cutMethod()")
	public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("环绕前");
		Object result = proceedingJoinPoint.proceed();
		System.out.println("环绕后");
		return result;
	}

	// 异常通知
	@AfterThrowing(value = "cutMethod()", throwing = "ex")
	public void afterThrowing(Throwable ex) {
		System.out.println("异常通知" + ex.getMessage());
	}

	@After("cutMethod()")
	public void after() {
		System.out.println("<-- 最终通知！-->");
	}

}
