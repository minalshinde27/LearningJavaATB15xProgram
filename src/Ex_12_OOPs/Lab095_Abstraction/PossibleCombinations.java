package Ex_12_OOPs.Lab095_Abstraction;

public class PossibleCombinations {
}

interface I1 {}
interface I2 {}

class A {}
class B {}

//One class cannot extend two classes
//class C extends A,B {}

//One class can implement one/more interfaces
class C implements I1 {}
class D implements I1, I2 {}

//One class can extend a class and implement the interface at a time
// but needs to extend the class first
class E extends A implements I1 {}
//class F implements I1 extends A {}

//One interface can neither implement other interface nor can extend the class
//I1 implements I2 {}
//I1 extends A {}