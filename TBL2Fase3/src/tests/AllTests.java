package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	ImpostoDeRendaTest.class,
	RendimentoBrutoTest.class,
	RendimentoLiquidoTest.class
})
public class AllTests {

}
